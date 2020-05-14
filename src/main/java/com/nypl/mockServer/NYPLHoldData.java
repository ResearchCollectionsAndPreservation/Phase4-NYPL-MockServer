package com.nypl.mockServer;

/**
 * Created by giris on 25/3/20.
 */
public class NYPLHoldData {

    private Integer id;

    private String patron;

    private String jobId;

    private Boolean processed;

    private Boolean success;

    private String updatedDate;

    private String createdDate;

    private String recordType;

    private String record;

    private String nyplSource;

    private String pickupLocation;

    private String neededBy;

    private Integer numberOfCopies;

    public NYPLHoldData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getNyplSource() {
        return nyplSource;
    }

    public void setNyplSource(String nyplSource) {
        this.nyplSource = nyplSource;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getNeededBy() {
        return neededBy;
    }

    public void setNeededBy(String neededBy) {
        this.neededBy = neededBy;
    }

    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}
