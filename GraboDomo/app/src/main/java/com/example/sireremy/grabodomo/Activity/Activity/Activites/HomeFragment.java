package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sireremy.grabodomo.R;
import com.grabolosa.sireremy.library.domotique.Fragment.Humidity.ModuleHumidityFragment;
import com.grabolosa.sireremy.library.domotique.Fragment.Plug.ModulePlugFragment;
import com.grabolosa.sireremy.library.domotique.Fragment.Speaker.ModuleSpeakerFragment;
import com.grabolosa.sireremy.library.domotique.Fragment.Temperature.ModuleTemperatureFragment;

/**
 * Created by SireRemy on 24/08/2017.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {

    /**
     * Methode qui constuit la vue du fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);
    }

    private Button buttonPlug;
    private Button buttonSpeaker;
    private Button buttonHumidity;
    private Button buttonTemperature;


    /**
     * Quand la vue est créée faire..
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        buttonPlug = (Button) view.findViewById(R.id.Plug);
        buttonSpeaker = (Button) view.findViewById(R.id.Speaker);
        buttonHumidity = (Button) view.findViewById(R.id.Humidite);
        buttonTemperature = (Button) view.findViewById(R.id.Temperature);

        buttonPlug.setOnClickListener(this);
        buttonSpeaker.setOnClickListener(this);
        buttonHumidity.setOnClickListener(this);
        buttonTemperature.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view==buttonPlug) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModulePlugFragment())
                    .commit();
        }
        if(view==buttonSpeaker) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleSpeakerFragment())
                    .commit();
        }
        if(view==buttonHumidity) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleHumidityFragment())
                    .commit();
        }
        else if(view==buttonTemperature) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleTemperatureFragment())
                    .commit();
        }

    }
}
