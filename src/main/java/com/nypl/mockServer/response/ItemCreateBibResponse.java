package com.nypl.mockServer.response;

/**
 * Created by giris on 25/3/20.
 */
public class ItemCreateBibResponse extends AbstractResponseItem{
    private String bibId;
    private String ItemId;

    public ItemCreateBibResponse() {
    }

    public String getBibId() {
        return bibId;
    }

    public void setBibId(String bibId) {
        this.bibId = bibId;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }
}
