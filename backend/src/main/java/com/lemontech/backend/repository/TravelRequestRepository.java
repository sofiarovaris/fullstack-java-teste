package com.lemontech.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lemontech.backend.model.TravelRequest;

public interface TravelRequestRepository extends JpaRepository<TravelRequest, Long> {

} 
