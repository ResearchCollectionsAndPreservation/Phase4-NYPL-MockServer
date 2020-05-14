package com.nypl.mockServer.model;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table
public class CheckoutData {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private String jobId;

    @Transient
    private Boolean processed;

    @Transient
    private Boolean success;

    @Transient
    private Object updatedDate;
    @Column(name="transaction_date",columnDefinition = "CREATEDDATE")
    private String createdDate;
    @Column(name = "patron_barcode",columnDefinition = "PATRONBARCODE")
    private String patronBarcode;
    @Column(name = "item_barcode",columnDefinition = "ITEMBARCODE")
    private String itemBarcode;
    @Column(name = "due_date",columnDefinition = "DUEDATE")
    private String desiredDateDue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPatronBarcode() {
        return patronBarcode;
    }

    public void setPatronBarcode(String patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public String getDesiredDateDue() {
        return desiredDateDue;
    }

    public void setDesiredDateDue(String desiredDateDue) {
        this.desiredDateDue = desiredDateDue;
    }
}

