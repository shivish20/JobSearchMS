package com.shivish20.jobs_ms.service;

import com.shivish20.jobs_ms.model.Job;

import java.util.List;

public interface JobService {
    List<Job> findAllJobs();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updateJob);
}
