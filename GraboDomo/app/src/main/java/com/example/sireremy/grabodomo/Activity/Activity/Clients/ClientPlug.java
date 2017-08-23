package com.example.sireremy.grabodomo.Activity.Activity.Clients;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.sireremy.grabodomo.Activity.Activity.Adapter.PlugAdapter;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Sire Rémy
 * @version 1
 * Classe gérant les appels serveurs pour la table documents de la BDD
 */

public class ClientPlug {

    private static ClientPlug instance;

    private Context context;
    private RequestQueue queue;

    private ArrayList<Plug> plugs;
    private HashMap<Integer, Plug> plugHash;

    /**
     * Methode permettant de créer l'instance de la classe
     * @param appContext
     */
    public static void createInstance(Context appContext){
        instance = new ClientPlug(appContext);
    }

    /**
     * Methode permettant de récuperer l'instance de la classe
     * @return
     */
    public static ClientPlug getInstance() {
        return instance;
    }

    /**
     * Cosntructeur de la classe
     * recupere le contexte de l'app et construit une volley request à partir de celui ci
     * @param context
     */
    private ClientPlug(Context context) {
        this.context = context;

        queue = Volley.newRequestQueue(context);
        queue.start();

        plugHash = new HashMap<>();
    }

    /**
     * Methode qui envoie la http request au serveur
     * Il recupère le resultat sous forme de json et le convertit en un tableau d'objets Plugs
     * @param listener
     */
    /*
    public void requestPlugs(final OnPlugsListListener listener, String url) {

        String apiUrl = "url";
        JsonObjectRequest request = new JsonObjectRequest(
                apiUrl, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            plugs = new ArrayList<>();
                            JSONArray plugsJSON = response.getJSONArray("Plug");

                            for(int i = 0; i < plugsJSON.length(); i++) {
                                JSONObject plugJSON = plugsJSON.getJSONObject(i);
                                Plug plug = new Plug(plugJSON);
                                plugs.add(plug);
                                plugHash.put(plug.getPlugId(), plug);
                                Log.d("Plug", "id : "+plug.getPlugId());

                            }
                            listener.onPlugsReceived(plugs);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            listener.onPlugsFailed("Erreur inconnue");
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onPlugsFailed(error.toString());
                    }
                });
        queue.add(request);
    }
    */

    /**
     * Methode permettant de recuperer toutes les plugs
     *
     * @return
     */
    public ArrayList<Plug> getPlugs() {
        return null;
    }

    /**
     * Methode permettant de recuperer un plug par rapport a son id
     * @param id
     * @return
     */
    public Plug getPlug(int id) {
        return plugHash.get(id);
    }

    public void requestPlugs(PlugAdapter plugAdapter) {
    }

    /**
     * Interface de gestion pour listenner
     */
    public interface OnPlugsListListener {
        void onPlugsReceived(ArrayList<Plug> Plugs);
        void onPlugsFailed(String error);
    }

}
