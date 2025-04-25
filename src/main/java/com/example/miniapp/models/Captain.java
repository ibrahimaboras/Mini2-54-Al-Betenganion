package com.example.miniapp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "captains")
public class Captain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String licenseNumber;
    private double avgRatingScore;

    @OneToMany(mappedBy = "captain", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Trip> trips;

    public Captain() {
    }

    public Captain(String name, String licenseNumber, double avgRatingScore) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.avgRatingScore = avgRatingScore;
    }

    public Captain(long id, String name, String licenseNumber, double avgRatingScore) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.avgRatingScore = avgRatingScore;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense_number() {
        return licenseNumber;
    }

    public void setLicense_number(String license_number) {
        this.licenseNumber = license_number;
    }

    public double getAvgRatingScore() {
        return avgRatingScore;
    }

    public void setAvgRatingScore(double avgRatingScore) {
        this.avgRatingScore = avgRatingScore;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }   

    
}
