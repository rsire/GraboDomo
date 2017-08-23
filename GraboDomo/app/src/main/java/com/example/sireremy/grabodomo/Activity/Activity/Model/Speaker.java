package com.example.sireremy.grabodomo.Activity.Activity.Model;

import org.json.JSONObject;

/**
 * Created by SireRemy on 04/08/2017.
 */

public class Speaker extends Device {

    private String speakerName;

    public Speaker(JSONObject json, String speakerName) {
        super(json);
        this.speakerName = speakerName;
    }

    public Speaker(int id, String name, DeviceStatus deviceStatus, String speakerName) {
        super(id, name, deviceStatus);
        this.speakerName = speakerName;
    }

    public Speaker(String speakerName) {
        this.speakerName = speakerName;
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public Speaker(JSONObject json) {
        super(json);
        speakerName = json.optString("SpeakerName");
    }
}