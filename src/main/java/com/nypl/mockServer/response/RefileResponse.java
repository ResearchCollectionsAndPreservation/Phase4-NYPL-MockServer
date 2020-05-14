package com.nypl.mockServer.response;

import com.nypl.mockServer.RefileData;

/**
 * Created by giris on 25/3/20.
 */
public class RefileResponse {

    private RefileData data;

    private Integer count;

    private Integer statusCode;

    public RefileResponse() {
    }

    public RefileData getData() {
        return data;
    }

    public void setData(RefileData data) {
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
