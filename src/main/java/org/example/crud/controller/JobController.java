package org.example.crud.controller;

import org.example.crud.entity.Job;
import org.example.crud.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/job")

@CrossOrigin(origins = "http://localhost:4200")
public class JobController {

    private static final Logger log = LoggerFactory.getLogger(JobController.class);
    @Autowired
    private JobService jobService;


    @PostMapping("/save")
    public Job saveJob(@RequestBody Job job) {
        return jobService.save(job);
    }


    @GetMapping("/all")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }


    @GetMapping("/get/{jobid}")
    public Job getJobById(@PathVariable("jobid") Long jobId) {
        return jobService.getJobById(jobId);
    }


    @DeleteMapping("/{jobid}")
    public void deleteJob(@PathVariable("jobid") Long jobId) {
        jobService.deleteJobById(jobId);
    }

    @PutMapping("/update/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {
        log.info("Received request to update job with ID {}: {}", id, job);
        job.setJobid(id);
        return jobService.updateJob(job);
    }

}
