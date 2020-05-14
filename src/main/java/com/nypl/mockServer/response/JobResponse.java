package com.nypl.mockServer.response;

/**
 * Created by rajeshbabuk on 9/12/16.
 */


import com.nypl.mockServer.JobData;

/**
 * The type Job response.
 */

public class JobResponse {

    private JobData data;
    private Integer count;
    private Integer statusCode;
    private String statusMessage;

    public JobData getData() {
        return data;
    }

    public void setData(JobData data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
