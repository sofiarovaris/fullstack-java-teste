package com.lemontech.backend.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lemontech.backend.client.TravelApiService;
import com.lemontech.backend.model.TravelRequest;
import com.lemontech.backend.repository.TravelRequestRepository;

/**
 * Service class responsible for handling business logic related to travel requests.
 */
@Service
public class TravelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(TravelRequestService.class);

    @Autowired
    private TravelApiService travelApiService;

    @Autowired
    private TravelRequestRepository travelRequestRepository;

    /**
     * Retrieves travel requests from the last three months, saves them to the repository,
     * and returns the list of travel requests.
     * 
     * @return a list of travel requests from the last three months.
     */
    public List<TravelRequest> getTravelRequestsFromLastThreeMonths() {
        // Defines the date range: from three months ago to the current date
        LocalDateTime endDate = LocalDateTime.now();
        LocalDateTime startDate = endDate.minusMonths(3);

        // Fetches travel requests from an external API
        List<TravelRequest> travelRequests = travelApiService.fetchTravelRequests(startDate, endDate);

        // Saves the fetched travel requests to the repository
        if (!travelRequests.isEmpty()) {
            travelRequestRepository.saveAll(travelRequests);
            logger.info("Successfully saved {} travel requests to the repository", travelRequests.size());
        } else {
            logger.warn("No travel requests found to save");
        }

        return travelRequests;
    }
}
