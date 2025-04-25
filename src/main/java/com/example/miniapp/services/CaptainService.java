package com.example.miniapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.miniapp.models.Captain;
import com.example.miniapp.repositories.CaptainRepository;

@Service
public class CaptainService {

    private final CaptainRepository captainRepository;

    public CaptainService(CaptainRepository captainRepository) {
        this.captainRepository = captainRepository;
    }

    // Add new captain
    public Captain addCaptain(Captain captain){
        return captainRepository.save(captain);
    }

    // Retrieve all captains
    public List<Captain> getAllCaptains(){
        return captainRepository.findAll();
    }

    //  Get Captain By ID
    public Captain getCaptainById(long id){
        return captainRepository.findById(id).orElse(null);
    }

    // Filter by Rating
    public List<Captain> getCaptainsByRating(Double ratingThreshold){
        return captainRepository.findByAvgRatingScoreGreaterThan(ratingThreshold);
    }

    // Filter by License Number
    public Captain getCaptainByLicenseNumber(String licenseNumber){
        return captainRepository.findByLicenseNumber(licenseNumber);
    }
    
}

