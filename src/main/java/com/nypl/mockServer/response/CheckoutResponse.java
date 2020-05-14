package com.nypl.mockServer.response;

import com.nypl.mockServer.model.CheckoutData;

public class CheckoutResponse {

    private CheckoutData data;
    private Integer count;
    private Integer statusCode;

    public CheckoutData getData() {
        return data;
    }

    public void setData(CheckoutData data) {
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
