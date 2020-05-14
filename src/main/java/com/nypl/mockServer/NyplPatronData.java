package com.nypl.mockServer;

import java.util.List;

/**
 * Created by giris on 25/3/20.
 */
public class NyplPatronData {


    private String id;
    private String updatedDate;
    private String createdDate;
    private Object deletedDate;
    private Boolean deleted;
    private Boolean suppressed;
    private String expirationDate;
    private String homeLibraryCode;
    private String birthDate;

    public NyplPatronData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Object getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Object deletedDate) {
        this.deletedDate = deletedDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(Boolean suppressed) {
        this.suppressed = suppressed;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getHomeLibraryCode() {
        return homeLibraryCode;
    }

    public void setHomeLibraryCode(String homeLibraryCode) {
        this.homeLibraryCode = homeLibraryCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
