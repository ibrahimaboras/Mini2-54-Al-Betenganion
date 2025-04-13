package com.example.miniapp.repositories;

import com.example.miniapp.models.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {

    // Find ratings for a specific entity type and ID
    List<Rating> findByEntityIdAndEntityType(Long entityId, String entityType);

    // Retrieve ratings with a score above a given value
    List<Rating> findByScoreGreaterThan(int minScore);
}
