package com.nypl.mockServer.response;

import com.nypl.mockServer.CancelHoldData;

public class CancelHoldResponse {


    private CancelHoldData data;
    private Integer count;
    private Integer statusCode;

    public CancelHoldData getData() {
        return data;
    }

    public void setData(CancelHoldData data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
