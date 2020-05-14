package com.nypl.mockServer.response;

import com.nypl.mockServer.NYPLHoldData;

/**
 * Created by giris on 25/3/20.
 */
public class NYPLHoldResponse {

    private NYPLHoldData data;
    private Integer count;
    private Integer statusCode;

    public NYPLHoldData getData() {
        return data;
    }

    public void setData(NYPLHoldData data) {
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
