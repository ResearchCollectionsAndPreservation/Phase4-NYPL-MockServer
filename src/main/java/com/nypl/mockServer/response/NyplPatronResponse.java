package com.nypl.mockServer.response;

import com.nypl.mockServer.NyplPatronData;

import java.util.List;

/**
 * Created by giris on 25/3/20.
 */
public class NyplPatronResponse {

    private List<NyplPatronData> data = null;
    private Integer count;
    private Integer statusCode;

    public NyplPatronResponse() {
    }

    public List<NyplPatronData> getData() {
        return data;
    }

    public void setData(List<NyplPatronData> data) {
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
