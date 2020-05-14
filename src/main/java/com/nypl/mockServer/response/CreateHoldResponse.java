package com.nypl.mockServer.response;

import com.nypl.mockServer.model.HoldData;

/**
 * Created by giris on 25/3/20.
 */
public class CreateHoldResponse {

    private HoldData data;

    private Integer count;

    private Integer statusCode;

    public CreateHoldResponse() {
    }

    public HoldData getData() {
        return data;
    }

    public void setData(HoldData data) {
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
