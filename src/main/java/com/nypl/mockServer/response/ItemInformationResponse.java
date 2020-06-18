package com.nypl.mockServer.response;

import javax.persistence.Column;
import java.util.Date;

public class ItemInformationResponse {
    private int id;

      
    private String circulationStatus;

      
    private String securityMarker;

      
    private String feeType;

      
    private Date transactionDate;

      
    private String holdQueueLength;

      
    private Date dueDate;

      
    private Date recalDate;

      
    private Date holdPickupDate;

      
    private String itemIdentifier;

      
    private String titleIdentifier;

      
    private String mediaType;

      
    private String permanentLocation;

      
    private String currentLocation;

      
    private String itemProperties;

      
    private String screenMessage;

      
    private String prineLine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCirculationStatus() {
        return circulationStatus;
    }

    public void setCirculationStatus(String circulationStatus) {
        this.circulationStatus = circulationStatus;
    }

    public String getSecurityMarker() {
        return securityMarker;
    }

    public void setSecurityMarker(String securityMarker) {
        this.securityMarker = securityMarker;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getHoldQueueLength() {
        return holdQueueLength;
    }

    public void setHoldQueueLength(String holdQueueLength) {
        this.holdQueueLength = holdQueueLength;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getRecalDate() {
        return recalDate;
    }

    public void setRecalDate(Date recalDate) {
        this.recalDate = recalDate;
    }

    public Date getHoldPickupDate() {
        return holdPickupDate;
    }

    public void setHoldPickupDate(Date holdPickupDate) {
        this.holdPickupDate = holdPickupDate;
    }

    public String getItemIdentifier() {
        return itemIdentifier;
    }

    public void setItemIdentifier(String itemIdentifier) {
        this.itemIdentifier = itemIdentifier;
    }

    public String getTitleIdentifier() {
        return titleIdentifier;
    }

    public void setTitleIdentifier(String titleIdentifier) {
        this.titleIdentifier = titleIdentifier;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getPermanentLocation() {
        return permanentLocation;
    }

    public void setPermanentLocation(String permanentLocation) {
        this.permanentLocation = permanentLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getItemProperties() {
        return itemProperties;
    }

    public void setItemProperties(String itemProperties) {
        this.itemProperties = itemProperties;
    }

    public String getScreenMessage() {
        return screenMessage;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public String getPrineLine() {
        return prineLine;
    }

    public void setPrineLine(String prineLine) {
        this.prineLine = prineLine;
    }
}
