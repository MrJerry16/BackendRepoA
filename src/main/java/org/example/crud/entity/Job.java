package org.example.crud.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="Job")

public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Jobid;
    @JsonProperty("JobTitle")
    private String JobTitle;
    @JsonProperty("JobDescription")
    private String JobDescription;
    @JsonProperty("JobType")
    private String JobType;
    @JsonProperty("JobLocation")
    private String JobLocation;

    public Long getJobid() {
        return Jobid;
    }

    public void setJobid(Long jobid) {
        Jobid = jobid;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String jobType) {
        JobType = jobType;
    }

    public String getJobLocation() {
        return JobLocation;
    }

    public void setJobLocation(String jobLocation) {
        JobLocation = jobLocation;
    }

    public Job(){

    }
}
