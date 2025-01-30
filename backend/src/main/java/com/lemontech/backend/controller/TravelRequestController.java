package com.lemontech.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lemontech.backend.model.TravelRequest;
import com.lemontech.backend.service.TravelRequestService;
import java.util.List;

/**
 * This controller handles requests related to travel requests.
 */
@RestController
@RequestMapping("/api/travel-requests")
@CrossOrigin(origins = "${cors.allowed-origins}") 
public class TravelRequestController {

    private static final Logger logger = LoggerFactory.getLogger(TravelRequestController.class);

    @Autowired
    private TravelRequestService travelService;

    /**
     * Fetches travel requests from the last three months and returns them.
     * @return a list of travel requests from the last three months, or an error message if something goes wrong.
     */
    @GetMapping("/last-three-months")
    public List<TravelRequest> fetchFlights() {
        logger.info("Fetching travel requests from the last three months");

        try {
            List<TravelRequest> travelRequests = travelService.getTravelRequestsFromLastThreeMonths();
            logger.info("Successfully fetched {} travel requests", travelRequests.size());
            return travelRequests;
        } catch (Exception e) {
            logger.error("Error fetching travel requests data: {}", e.getMessage(), e);
            throw new RuntimeException("Error fetching travel requests data: " + e.getMessage());
        }
    }
}
