package com.nypl.mockServer;


import java.util.List;


public class JobData {


    private String jobId;

    private Boolean started;

    private Boolean finished;

    private Boolean success;


    private List<Notice> notices = null;

    private String successRedirectUrl;
    private String startCallbackUrl;
    private String successCallbackUrl;
    private String failureCallbackUrl;
    private String updateCallbackUrl;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Notice> getNotices() {
        return notices;
    }

    public void setNotices(List<Notice> notices) {
        this.notices = notices;
    }

    public String getSuccessRedirectUrl() {
        return successRedirectUrl;
    }

    public void setSuccessRedirectUrl(String successRedirectUrl) {
        this.successRedirectUrl = successRedirectUrl;
    }

    public String getStartCallbackUrl() {
        return startCallbackUrl;
    }

    public void setStartCallbackUrl(String startCallbackUrl) {
        this.startCallbackUrl = startCallbackUrl;
    }

    public String getSuccessCallbackUrl() {
        return successCallbackUrl;
    }

    public void setSuccessCallbackUrl(String successCallbackUrl) {
        this.successCallbackUrl = successCallbackUrl;
    }

    public String getFailureCallbackUrl() {
        return failureCallbackUrl;
    }

    public void setFailureCallbackUrl(String failureCallbackUrl) {
        this.failureCallbackUrl = failureCallbackUrl;
    }

    public String getUpdateCallbackUrl() {
        return updateCallbackUrl;
    }

    public void setUpdateCallbackUrl(String updateCallbackUrl) {
        this.updateCallbackUrl = updateCallbackUrl;
    }
}
