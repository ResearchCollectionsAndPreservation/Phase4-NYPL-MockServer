package com.nypl.mockServer.response;

/**
 * Created by giris on 25/3/20.
 */
public class ItemRefileResponse {

    private Integer requestId;

    private String jobId;

    public ItemRefileResponse() {
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
}
