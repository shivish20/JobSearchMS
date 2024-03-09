package com.shivish20.jobs_ms.service;

import com.shivish20.jobs_ms.model.Job;
import com.shivish20.jobs_ms.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAllJobs();

    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updateJob);
}
