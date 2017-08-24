package com.grabolosa.sireremy.library.domotique.Clients;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.grabolosa.sireremy.library.domotique.Model.Plug;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SireRemy on 24/08/2017.
 */

public class ClientPlug extends DataSource {

    private static ClientPlug instance;

    private Context context;
    private RequestQueue queue;

    private ArrayList<Plug> plugs;
    private HashMap<Integer, Plug> plugHashMap;

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

        plugHashMap = new HashMap<>();
    }

    /**
     * Methode qui envoie la http request au serveur
     * Il recupère le resultat sous forme de json et le convertit en un tableau d'objets Plugs
     * @param listener
     */
    public void requestPlugs(final OnPlugsListListener listener, String url) {

        String apiUrl = url;
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
                                plugHashMap.put(plug.getId(), plug);
                                Log.d("Plug", "id : "+plug.getId());

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

    /**
     * Methode permettant de recuperer tous les plugs
     * @return
     */
    public ArrayList<Plug> getPlugs() {
        return plugs;
    }

    /**
     * Methode permettant de recuperer un plug par rapport a son id
     * @param id
     * @return
     */
    public Plug getPlug(int id) {
        return plugHashMap.get(id);
    }

    /**
     * Methode envoyant une requete HTTP DELETE au serveur supprimant un plug en fonction de son id
     * @param id
     */
    public void DELETEPlug(int id) {
        //String apiUrl = "http://10.0.2.2:5000/.../" + id;
        String apiUrl = "" + id;
        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest stringRequest = new StringRequest(Request.Method.DELETE, apiUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //Response
                    }}, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
            }
        }){
        };
        queue.add(stringRequest);
        queue.start();
    }

    /**
     * Interface de gestion pour listenner
     */
    public interface OnPlugsListListener {
        void onPlugsReceived(ArrayList<Plug> plugs);
        void onPlugsFailed(String error);
    }

}