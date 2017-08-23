package com.example.sireremy.grabodomo.Activity.Activity.Model;

import org.json.JSONObject;

/**
 * Created by SireRemy on 22/08/2017.
 */

public class Device {

    private int id;
    private String name;

    protected DeviceStatus deviceStatus;

    /**
     *
     * @param json
     */
    public Device(JSONObject json) {
        id = json.optInt("Id");
        name = json.optString("Name");
    }

    public Device(int id, String name, DeviceStatus deviceStatus) {
        this.id = id;
        this.name = name;
        this.deviceStatus = deviceStatus;
    }

    public Device() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceStatus getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus;
    }
}