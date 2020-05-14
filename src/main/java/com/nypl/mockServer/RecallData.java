package com.nypl.mockServer;

/**
 * Created by giris on 25/3/20.
 */
public class RecallData {

    private Integer id;

    private Object updatedDate;

    private String createdDate;

    private String jobId;

    private String owningInstitutionId;

    private String itemBarcode;

    public RecallData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Object updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getOwningInstitutionId() {
        return owningInstitutionId;
    }

    public void setOwningInstitutionId(String owningInstitutionId) {
        this.owningInstitutionId = owningInstitutionId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }
}
