package com.shivish20.jobs_ms.dto;

import com.shivish20.jobs_ms.external.Company;
import com.shivish20.jobs_ms.external.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JobDTO {
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    private Company company;
    private List<Review> reviews;
}
