package com.grabolosa.sireremy.library.domotique.Clients;

/**
 * Created by SireRemy on 23/08/2017.
 */

public class DataSource {

    protected ClientPlug clientPlug;


    private static DataSource instance;


    private String status;


    /**
     * Retourne la reponse HTTP ("HTTP/1.1 200 OK")
     */
    public String getStatus() {
        return status;
    }

    public DataSource setResponseCode(int code) {
        String reason = "DataSource Response";
        if (code >= 100 && code < 200) {
            reason = "Informational";
        } else if (code >= 200 && code < 300) {
            reason = "OK";
        } else if (code >= 300 && code < 400) {
            reason = "Redirection";
        } else if (code >= 400 && code < 500) {
            reason = "Client Error";
        } else if (code >= 500 && code < 600) {
            reason = "Server Error";
        }
        return setStatus("HTTP/1.1 " + code + " " + reason);

    }

    public DataSource setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override public String toString() {
        return status;
    }
}


