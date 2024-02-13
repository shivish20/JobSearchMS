package com.shivish20.review_ms.service;

import com.shivish20.review_ms.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

    Review getReview(Long reviewId);

    boolean updateReview(Long reviewId, Review updateReview);

    boolean deleteReview(Long reviewId);
}
