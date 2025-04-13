package com.example.miniapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "captains")
public class Captain {
    @Id
    private long id;
    private String name;
    private String license_number;
    private double avgRatingScore;
}
