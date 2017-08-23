package com.example.sireremy.grabodomo.Activity.Activity.Utils;

import android.app.Application;

import com.example.sireremy.grabodomo.Activity.Activity.Clients.ClientPlug;
import com.example.sireremy.grabodomo.Activity.Activity.Clients.ClientSpeaker;


/**
 * Created by SireRemy on 10/08/2017.
 */

public class App extends Application {

     /**
     * Créée les instances des classes de client HTTP
     */
    public void onCreate() {
        super.onCreate();

        //Create instances
        ClientPlug.createInstance(this);
    }

}
