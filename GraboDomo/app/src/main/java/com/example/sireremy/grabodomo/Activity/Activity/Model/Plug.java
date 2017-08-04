package com.example.sireremy.grabodomo.Activity.Activity.Model;

import org.json.JSONObject;

/**
 * @author Sire Remy
 * @version 1
 * Modèle objet de Plug avec ses getters et setters Il se construit directement a partir d'un JSONObject
 */

public class Plug {

    private int plugId;
    private boolean etat;
    private String puissance;
    private String consommation;

    /**
     *
     * @param json
     */
    public Plug(JSONObject json) {
        plugId = json.optInt("PriseId");
        etat = json.optBoolean("Etat");
        puissance = json.optString("Puissance");
        consommation = json.optString("Consommation");
    }

    public int getPlugId() {
        return plugId;
    }

    public void setPlugId(int plugId) {
        this.plugId = plugId;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getConsommation() {
        return consommation;
    }

    public void setConsommation(String consommation) {
        this.consommation = consommation;
    }
}
