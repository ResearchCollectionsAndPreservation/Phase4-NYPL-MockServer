package com.nypl.mockServer;

/**
 * Created by giris on 25/3/20.
 */
public class CreateHoldData {

    private Integer id;

    private Object updatedDate;

    private String createdDate;

    private String trackingId;

    private String owningInstitutionId;

    private String itemBarcode;

    private String patronBarcode;

    private Description description;

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

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
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

    public String getPatronBarcode() {
        return patronBarcode;
    }

    public void setPatronBarcode(String patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
