/*
Code by prem singh daksha 09/12/2020
*/
package com.premsinghdaksha.deviceinformationlibrary.deviceinfo.ads;

public class Ad {

    private String advertisingId;
    private boolean adDoNotTrack;

    public String getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(String advertisingId) {
        this.advertisingId = advertisingId;
    }

    public boolean isAdDoNotTrack() {
        return adDoNotTrack;
    }

    public void setAdDoNotTrack(boolean adDoNotTrack) {
        this.adDoNotTrack = adDoNotTrack;
    }
}
