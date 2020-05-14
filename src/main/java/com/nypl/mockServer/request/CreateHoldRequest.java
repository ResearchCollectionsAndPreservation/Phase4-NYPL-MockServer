package com.nypl.mockServer.request;

import com.nypl.mockServer.Description;

public class CreateHoldRequest {

    private String trackingId;
    private String owningInstitutionId;
    private String itemBarcode;
    private String patronBarcode;
    private Description description;

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
