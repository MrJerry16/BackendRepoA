package org.example.crud.service;

import org.example.crud.dao.JobDao;
import org.example.crud.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobDao jobDao;

    // Save a job
    public Job save(Job job) {
        return jobDao.save(job);
    }

    // Get all jobs
    public List<Job> getAllJobs() {
        List<Job> jobs = new ArrayList<>();
        jobDao.findAll().forEach(jobs::add);
        return jobs;
    }

    // Get a job by ID
    public Job getJobById(Long jobId) {
        return jobDao.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));
    }

    // Delete a job by ID
    public void deleteJobById(Long jobId) {
        jobDao.deleteById(jobId);
    }

    // Update a job
    public Job updateJob(Job job) {
        jobDao.findById(job.getJobid())
                .orElseThrow(() -> new RuntimeException("Job not found with ID: " + job.getJobid()));
        return jobDao.save(job);
    }

}
