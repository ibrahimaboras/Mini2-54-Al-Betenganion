package com.example.miniapp.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miniapp.models.Trip;
import com.example.miniapp.repositories.TripRepository;

@Service
public class TripService {
    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Trip addTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Trip getTripById(Long id) {
        return tripRepository.findById(id).orElse(null);
    }

    public Trip updateTrip(Long id, Trip tripDetails) {
        Trip trip = getTripById(id);
        if (trip != null) {
            trip.setCaptain(tripDetails.getCaptain());
            trip.setCustomer(tripDetails.getCustomer());
            trip.setPayment(tripDetails.getPayment());
            trip.setTripDate(tripDetails.getTripDate());
            trip.setTripCost(tripDetails.getTripCost());
            trip.setOrigin(tripDetails.getOrigin());
            trip.setDestination(tripDetails.getDestination());
        }
        return tripRepository.save(trip);
    }

    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }

    public List<Trip> findTripsWithinDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return tripRepository.findByTripDateBetween(startDate, endDate);
    }

    public List<Trip> findTripsByCaptainId(Long captainId) {
        return tripRepository.findByCaptainId(captainId);
    }
}
