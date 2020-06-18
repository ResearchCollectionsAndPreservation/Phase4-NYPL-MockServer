package com.nypl.mockServer.response;

import javax.persistence.Column;
import java.util.Date;

public class PatronInformationResponse {

    private Integer id;

     
    private String language;

     
    private Date transactionDate;

     
    private Integer holdItemsCount;

     
    private Integer overdueItemsCount;

     
    private Integer chargedItemsCount;

     
    private Integer fineItemsCount;

     
    private Integer recallItemsCount;

     
    private Integer unavailableHoldsCount;

     
    private String institutionId;

     
    private String patronIdentifier;

     
    private String personName;

     
    private Integer holdItemsLimit;

     
    private Integer overdueItemsLimit;

     
    private Integer chargedItemsLimit;

     
    private Integer validPatron;

     
    private Integer validPatronPassword;

     
    private String currencyType;

     
    private String feeAmount;

     
    private String feeLimit;

     
    private String homeAddress;

     
    private String emailAddress;

     
    private String homePhoneNumber;

     
    private String screenMessage;

     
    private String printLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getHoldItemsCount() {
        return holdItemsCount;
    }

    public void setHoldItemsCount(Integer holdItemsCount) {
        this.holdItemsCount = holdItemsCount;
    }

    public Integer getOverdueItemsCount() {
        return overdueItemsCount;
    }

    public void setOverdueItemsCount(Integer overdueItemsCount) {
        this.overdueItemsCount = overdueItemsCount;
    }

    public Integer getChargedItemsCount() {
        return chargedItemsCount;
    }

    public void setChargedItemsCount(Integer chargedItemsCount) {
        this.chargedItemsCount = chargedItemsCount;
    }

    public Integer getFineItemsCount() {
        return fineItemsCount;
    }

    public void setFineItemsCount(Integer fineItemsCount) {
        this.fineItemsCount = fineItemsCount;
    }

    public Integer getRecallItemsCount() {
        return recallItemsCount;
    }

    public void setRecallItemsCount(Integer recallItemsCount) {
        this.recallItemsCount = recallItemsCount;
    }

    public Integer getUnavailableHoldsCount() {
        return unavailableHoldsCount;
    }

    public void setUnavailableHoldsCount(Integer unavailableHoldsCount) {
        this.unavailableHoldsCount = unavailableHoldsCount;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getPatronIdentifier() {
        return patronIdentifier;
    }

    public void setPatronIdentifier(String patronIdentifier) {
        this.patronIdentifier = patronIdentifier;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getHoldItemsLimit() {
        return holdItemsLimit;
    }

    public void setHoldItemsLimit(Integer holdItemsLimit) {
        this.holdItemsLimit = holdItemsLimit;
    }

    public Integer getOverdueItemsLimit() {
        return overdueItemsLimit;
    }

    public void setOverdueItemsLimit(Integer overdueItemsLimit) {
        this.overdueItemsLimit = overdueItemsLimit;
    }

    public Integer getChargedItemsLimit() {
        return chargedItemsLimit;
    }

    public void setChargedItemsLimit(Integer chargedItemsLimit) {
        this.chargedItemsLimit = chargedItemsLimit;
    }

    public Integer getValidPatron() {
        return validPatron;
    }

    public void setValidPatron(Integer validPatron) {
        this.validPatron = validPatron;
    }

    public Integer getValidPatronPassword() {
        return validPatronPassword;
    }

    public void setValidPatronPassword(Integer validPatronPassword) {
        this.validPatronPassword = validPatronPassword;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeLimit() {
        return feeLimit;
    }

    public void setFeeLimit(String feeLimit) {
        this.feeLimit = feeLimit;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getScreenMessage() {
        return screenMessage;
    }

    public void setScreenMessage(String screenMessage) {
        this.screenMessage = screenMessage;
    }

    public String getPrintLine() {
        return printLine;
    }

    public void setPrintLine(String printLine) {
        this.printLine = printLine;
    }
}
