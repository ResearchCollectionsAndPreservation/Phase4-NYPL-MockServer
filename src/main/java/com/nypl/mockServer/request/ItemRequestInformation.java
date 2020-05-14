package com.nypl.mockServer.request;


import java.util.List;

public class ItemRequestInformation {

    private List<String> itemBarcodes;
    private String titleIdentifier;
    private String itemOwningInstitution = ""; // PUL, CUL, NYPL
    private String patronBarcode = "";
    private String emailAddress = "";
    private String requestingInstitution = ""; // PUL, CUL, NYPL
    private String requestType = ""; // Retrieval,EDD, Hold, Recall, Borrow Direct
    private String deliveryLocation = "";
    private String customerCode = "";
    private String requestNotes = "";
    private String trackingId; // NYPL - trackingId
    private String author; // NYPL - author
    private String callNumber; // NYPL - callNumber

    /**
     * EDD Request
     */
    private String startPage;
    private String endPage;
    private String chapterTitle = "";
    private String expirationDate;
    private String bibId = "";
    private String username;
    private String issue;
    private String volume;
    private String itemAuthor;
    private String itemVolume;
    private Integer requestId;
    private String pickupLocation;
    private String eddNotes;

    public boolean isOwningInstitutionItem() {
        boolean bSuccess;
        if (itemOwningInstitution.equalsIgnoreCase(requestingInstitution)) {
            bSuccess = true;
        } else {
            bSuccess = false;
        }
        return bSuccess;
    }

    public List<String> getItemBarcodes() {
        return itemBarcodes;
    }

    public void setItemBarcodes(List<String> itemBarcodes) {
        this.itemBarcodes = itemBarcodes;
    }

    public String getTitleIdentifier() {
        return titleIdentifier;
    }

    public void setTitleIdentifier(String titleIdentifier) {
        this.titleIdentifier = titleIdentifier;
    }

    public String getItemOwningInstitution() {
        return itemOwningInstitution;
    }

    public void setItemOwningInstitution(String itemOwningInstitution) {
        this.itemOwningInstitution = itemOwningInstitution;
    }

    public String getPatronBarcode() {
        return patronBarcode;
    }

    public void setPatronBarcode(String patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRequestingInstitution() {
        return requestingInstitution;
    }

    public void setRequestingInstitution(String requestingInstitution) {
        this.requestingInstitution = requestingInstitution;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getRequestNotes() {
        return requestNotes;
    }

    public void setRequestNotes(String requestNotes) {
        this.requestNotes = requestNotes;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public String getEndPage() {
        return endPage;
    }

    public void setEndPage(String endPage) {
        this.endPage = endPage;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBibId() {
        return bibId;
    }

    public void setBibId(String bibId) {
        this.bibId = bibId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getItemAuthor() {
        return itemAuthor;
    }

    public void setItemAuthor(String itemAuthor) {
        this.itemAuthor = itemAuthor;
    }

    public String getItemVolume() {
        return itemVolume;
    }

    public void setItemVolume(String itemVolume) {
        this.itemVolume = itemVolume;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getEddNotes() {
        return eddNotes;
    }

    public void setEddNotes(String eddNotes) {
        this.eddNotes = eddNotes;
    }
}