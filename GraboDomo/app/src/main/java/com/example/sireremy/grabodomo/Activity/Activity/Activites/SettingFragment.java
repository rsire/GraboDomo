package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sireremy.grabodomo.R;

/**
 * Created by SireRemy on 24/08/2017.
 */

public class SettingFragment extends Fragment {

    /**
     * Methode qui constuit la vue du fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting, null);
    }


    /**
     * Quand la vue est créée faire..
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
