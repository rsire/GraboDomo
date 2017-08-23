package com.grabolosa.sireremy.library.domotique.Fragment.Speaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grabolosa.sireremy.library.domotique.Fragment.DeviceCollectionFragment;
import com.grabolosa.sireremy.library.domotique.Model.Device;
import com.grabolosa.sireremy.library.domotique.Model.Speaker;

/**
 * Created by SireRemy on 10/08/2017.
 */

public class ModuleSpeakerCollection extends DeviceCollectionFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_speaker_collection, null);
    }
    */

    private Device device;
    private Speaker speaker;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onClick(View view) {

    }
}
