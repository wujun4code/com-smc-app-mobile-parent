package com.smc.app.mobile.core;


import java.io.Serializable;

/**
 * Created by wujun on 11/11/13.
 */
public class Room implements Serializable {
    private String Id;
    private String type;
    private String floor;
    private int status;
    private String statusText;
    private String serialNumber;
    private String lockedUserId;

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setLockedUserId(String lockedUserId) {
        this.lockedUserId = lockedUserId;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public String getFloor() {
        return floor;
    }

    public String getId() {
        return Id;
    }

    public String getLockedUserId() {
        return lockedUserId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getStatusText() {
        return statusText;
    }

    public String getType() {
        return type;
    }
}
