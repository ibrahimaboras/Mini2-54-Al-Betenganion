package com.example.miniapp.repositories;

import com.example.miniapp.models.Captain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CaptainRepository extends JpaRepository<Captain, Long> {

    // Find all captains with a rating above a certain threshold
    List<Captain> findByAvgRatingScoreGreaterThan(Double ratingThreshold);

    // Find a captain by their license number
    Captain findByLicenseNumber(String licenseNumber);
}
