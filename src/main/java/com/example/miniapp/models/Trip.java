package com.example.miniapp.models;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime tripDate;
    private String origin;
    private String Destination;
    private double tripCost;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "captain_id",referencedColumnName = "id")
    private Captain user;



    public Trip() {
    }

    public Trip(LocalDateTime tripDate, String origin, String destination, double tripCost) {
        this.tripDate = tripDate;
        this.origin = origin;
        Destination = destination;
        this.tripCost = tripCost;
    }

    public Trip(long id, LocalDateTime tripDate, String origin, String destination, double tripCost) {
        this.id = id;
        this.tripDate = tripDate;
        this.origin = origin;
        Destination = destination;
        this.tripCost = tripCost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTripDate() {
        return tripDate;
    }

    public void setTripDate(LocalDateTime tripDate) {
        this.tripDate = tripDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Captain getUser() {
        return user;
    }

    public void setUser(Captain user) {
        this.user = user;
    }

    
}
