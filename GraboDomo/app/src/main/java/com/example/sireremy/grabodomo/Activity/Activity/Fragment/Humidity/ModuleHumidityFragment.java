package com.example.sireremy.grabodomo.Activity.Activity.Fragment.Humidity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.DeviceFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Device;
import com.example.sireremy.grabodomo.R;

/**
 * Created by SireRemy on 11/08/2017.
 */

public class ModuleHumidityFragment extends DeviceFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_module_humidity, null);
    }

    protected Device device;

    private TextView humidity;
    private ImageButton refreshButton;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        humidity = (TextView) view.findViewById(R.id.tv_humidity);
        refreshButton = (ImageButton) view.findViewById(R.id.ib_refresh);
        refreshButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Toast.makeText(getActivity(), "Reload data...", Toast.LENGTH_SHORT).show();

    }
}
