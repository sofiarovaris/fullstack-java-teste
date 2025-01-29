package com.lemontech.backend.client;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lemontech.backend.model.TravelRequest;
import com.lemontech.backend.utils.DateUtils;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import jakarta.xml.bind.JAXBElement;

/**
 * Service class responsible for interacting with the Lemontech API
 */
@Service
public class TravelApiService {

    @Value("${lemontech.api.client-key}")
    private String clientKey;

    @Value("${lemontech.api.username}")
    private String username;

    @Value("${lemontech.api.password}")
    private String password;

    private static final Logger logger = LoggerFactory.getLogger(TravelApiService.class);

    @Autowired
    private WsSelfBookingService wsSelfBookingService;

    /**
     * Fetches travel requests from the Lemontech API based on the provided date range
     * 
     * @param startDate the start date of the range
     * @param endDate the end date of the range
     * @return a list of TravelRequest objects
     */
    public List<TravelRequest> fetchTravelRequests(LocalDateTime startDate, LocalDateTime endDate) {
        logger.info("Fetching travel requests from {} to {}", startDate, endDate);

        // Build the request object with the provided date range
        PesquisarSolicitacaoRequest request = buildRequest(startDate, endDate);
        logger.debug("Built request: {}", request);

        try {
            // Call the external API to fetch the travel requests
            logger.info("Calling the external API to fetch travel requests");
            WsSelfBooking port = wsSelfBookingService.getWsSelfBookingPort();
            PesquisarSolicitacaoResponse response = port.pesquisarSolicitacao(
                clientKey,
                username, 
                password, 
                request
            );
            
            // Process the response and return the list of travel requests
            logger.info("Received response from API");
            return processResponse(response);
        } catch (Exception e) {
            logger.error("Error calling service: {}", e.getMessage(), e);
            return new ArrayList<>();
        }
    }

    /**
     * Builds the request object for the API with the provided date range
     * 
     * @param startDate the start date of the range
     * @param endDate the end date of the range
     * @return a request object for the API
     */
    private PesquisarSolicitacaoRequest buildRequest(LocalDateTime startDate, LocalDateTime endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

        logger.debug("Setting start date: {}", startDate.format(formatter));
        request.getContent().add(new JAXBElement<>(new QName("dataInicial"), String.class, startDate.format(formatter)));

        logger.debug("Setting end date: {}", endDate.format(formatter));
        request.getContent().add(new JAXBElement<>(new QName("dataFinal"), String.class, endDate.format(formatter)));

        request.getContent().add(new JAXBElement<>(new QName("registroInicial"), Integer.class, 1));
        
        return request;
    }

    /**
     * Processes the response from the API and maps it into a list of TravelRequest objects
     * 
     * @param response the response from the API
     * @return a list of TravelRequest objects
     */
    private List<TravelRequest> processResponse(PesquisarSolicitacaoResponse response) {
        List<TravelRequest> travelRequests = new ArrayList<>();

        if (response == null || response.getSolicitacao() == null) {
            logger.warn("Response is empty or contains no solicitations");
            return travelRequests;
        }
        
        // Iterate over the response data and map it to TravelRequest objects
        for (Solicitacao solicitacao : response.getSolicitacao()) {
            if (solicitacao.getAereos() != null) {
                for (Aereo aereo : solicitacao.getAereos().getAereo()) {
                    if (aereo.getAereoSeguimento() != null) {
                        for (AereoSeguimento segment : aereo.getAereoSeguimento()) {
                            logger.debug("Processing segment: {}", segment);
                            TravelRequest request = mapToTravelRequest(solicitacao, aereo, segment);
                            travelRequests.add(request);
                        }
                    }
                }
            }
        }
        
        logger.info("Processed {} travel requests", travelRequests.size());
        return travelRequests;
    }

    /**
     * Maps the data from the response into a TravelRequest object
     * 
     * @param solicitacao the solicitation data
     * @param aereo the flight data
     * @param segment the flight segment data
     * @return a TravelRequest object
     */
    private TravelRequest mapToTravelRequest(Solicitacao solicitacao, Aereo aereo, AereoSeguimento segment) {
        TravelRequest request = new TravelRequest();

        // Set the properties of the TravelRequest object using the data from the response
        logger.debug("Mapping TravelRequest for Solicitation ID: {}", solicitacao.getIdSolicitacao());
        request.setRequestId(solicitacao.getIdSolicitacao());
        request.setPassengerName(solicitacao.getPassageiros().getPassageiro().get(0).getNomeCompleto());
        request.setAirline(aereo.getSource());
        request.setDepartureTime(DateUtils.convertXMLGregorianCalendarToLocalDateTime(segment.getDataSaida()));
        request.setArrivalTime(DateUtils.convertXMLGregorianCalendarToLocalDateTime(segment.getDataChegada()));
        request.setOriginCity(segment.getCidadeOrigem());
        request.setDestinationCity(segment.getCidadeDestino());

        return request;
    }
}
