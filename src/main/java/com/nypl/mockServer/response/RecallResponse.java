package com.nypl.mockServer.response;

import com.nypl.mockServer.RecallData;

/**
 * Created by giris on 25/3/20.
 */
public class RecallResponse {

    private RecallData data;

    private Integer count;

    private Integer statusCode;

    public RecallResponse() {
    }

    public RecallData getData() {
        return data;
    }

    public void setData(RecallData data) {
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
