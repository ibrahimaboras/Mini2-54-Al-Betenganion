package com.example.miniapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.miniapp.models.Captain;
import com.example.miniapp.services.CaptainService;

@RestController
@RequestMapping("/captains")
public class CaptainController {

    private final CaptainService captainService;

    @Autowired
    public CaptainController(CaptainService captainService) {
        this.captainService = captainService;
    }

    // Add Captain
    @PostMapping("/addCaptain")
    public Captain addCaptain(@RequestBody Captain captain) {
        return captainService.addCaptain(captain);
    }
    
    // Get All Captains
    @GetMapping("/allCaptains")
    public List<Captain> getAllCaptains() {
        return captainService.getAllCaptains();
    }

    // Get Captain By ID
    @GetMapping("/{id}")
    public Captain getCaptainById(@PathVariable Long id) {
        return captainService.getCaptainById(id);
    }

    // Filter by Rating
    @GetMapping("/filterByRating")
    public List<Captain> getCaptainsByRating(@RequestParam Double ratingThreshold) {
        return captainService.getCaptainsByRating(ratingThreshold);
    }

    // Filter by License Number
    @GetMapping("/filterByLicenseNumber")
    public Captain getCaptainByLicenseNumber(@RequestParam String licenseNumber) {
        return captainService.getCaptainByLicenseNumber(licenseNumber);
    }

}
