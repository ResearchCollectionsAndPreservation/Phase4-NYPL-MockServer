package com.nypl.mockServer.request;

import java.util.List;

/**
 * Created by giris on 25/3/20.
 */
public class ItemRefileRequest {
    private List<String> itemBarcodes;

    private List<Integer> requestIds;

    public ItemRefileRequest() {
    }

    public List<String> getItemBarcodes() {
        return itemBarcodes;
    }

    public void setItemBarcodes(List<String> itemBarcodes) {
        this.itemBarcodes = itemBarcodes;
    }

    public List<Integer> getRequestIds() {
        return requestIds;
    }

    public void setRequestIds(List<Integer> requestIds) {
        this.requestIds = requestIds;
    }
}
