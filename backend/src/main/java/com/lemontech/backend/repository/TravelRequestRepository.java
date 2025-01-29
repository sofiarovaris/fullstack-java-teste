package com.lemontech.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lemontech.backend.model.TravelRequest;

/**
 * This interface extends JpaRepository, providing CRUD operations for the TravelRequest entity.
 */
public interface TravelRequestRepository extends JpaRepository<TravelRequest, Long> {}
