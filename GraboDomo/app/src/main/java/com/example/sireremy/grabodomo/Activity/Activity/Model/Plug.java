package com.example.sireremy.grabodomo.Activity.Activity.Model;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.DeviceFragment;

import org.json.JSONObject;

/**
 * @author Sire Remy
 * @version 1
 * Modèle objet de Plug avec ses getters et setters Il se construit directement a partir d'un JSONObject
 */

public class Plug extends Device {

    private String power;
    private String powerConsumption;

    public Plug(JSONObject json, String power, String powerConsumption) {
        super(json);
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    public Plug(int id, String name, DeviceStatus deviceStatus, String power, String powerConsumption) {
        super(id, name, deviceStatus);
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    public Plug(String power, String powerConsumption) {
        this.power = power;
        this.powerConsumption = powerConsumption;
    }

    public Plug(JSONObject json) {
        super(json);
            power = json.optString("Puissance");
            powerConsumption = json.optString("Consommation");
        }


    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
