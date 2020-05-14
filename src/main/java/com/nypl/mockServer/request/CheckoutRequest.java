package com.nypl.mockServer.request;


public class CheckoutRequest {

    private String patronBarcode;
    private String itemBarcode;
    private String desiredDateDue;

    public String getPatronBarcode() {
        return patronBarcode;
    }

    public void setPatronBarcode(String patronBarcode) {
        this.patronBarcode = patronBarcode;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public String getDesiredDateDue() {
        return desiredDateDue;
    }

    public void setDesiredDateDue(String desiredDateDue) {
        this.desiredDateDue = desiredDateDue;
    }
}




