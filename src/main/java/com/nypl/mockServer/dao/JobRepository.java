package com.nypl.mockServer.dao;

import com.nypl.mockServer.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by giris on 30/3/20.
 */
public interface JobRepository extends JpaRepository<Job,String> {

    Job findByJobId(String jobId);

}
