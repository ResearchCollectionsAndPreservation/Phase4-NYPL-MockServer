package com.nypl.mockServer.model;


import javax.persistence.*;

/**
 * Created by giris on 30/3/20.
 */
@Entity
@Table(name = "job")
public class Job {

    @Id
    @Column
    private String jobId;

    @Column
    private String message;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
