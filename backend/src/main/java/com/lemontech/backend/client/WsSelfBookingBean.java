package com.lemontech.backend.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;

/**
 * Configuration class for defining Spring Beans
 */
@Configuration
public class WsSelfBookingBean {

    /**
     * Creates and returns an instance of WsSelfBookingService.
     * This service can be injected into other components via Spring's dependency injection.
     * 
     * @return an instance of WsSelfBookingService.
     */
    @Bean
    public WsSelfBookingService wsSelfBookingService() {
        return new WsSelfBookingService();
    }
}
