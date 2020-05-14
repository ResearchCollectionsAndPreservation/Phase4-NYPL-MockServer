package com.nypl.mockServer.response;


import com.nypl.mockServer.CheckinData;

public class CheckinResponse {

    private CheckinData data;
    private Integer count;
    private Integer statusCode;

    public CheckinData getData() {
        return data;
    }

    public void setData(CheckinData data) {
        this.data = data;
    }
}
