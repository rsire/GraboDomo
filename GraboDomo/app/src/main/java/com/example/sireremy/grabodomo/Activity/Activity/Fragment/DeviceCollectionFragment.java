package com.example.sireremy.grabodomo.Activity.Activity.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.sireremy.grabodomo.Activity.Activity.Adapter.PlugAdapter;
import com.example.sireremy.grabodomo.Activity.Activity.Clients.ClientPlug;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Humidity.ModuleHumidityFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Plug.ModulePlugCollection;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Plug.ModulePlugFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Speaker.ModuleSpeakerCollection;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Speaker.ModuleSpeakerFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Temperature.ModuleTemperatureFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Device;
import com.example.sireremy.grabodomo.R;

import java.util.ArrayList;

/**
 * Created by SireRemy on 07/08/2017.
 */

public class DeviceCollectionFragment extends DeviceFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_device_collection_fragment, null);
    }

    protected DeviceFragment deviceFragment;
    protected Device device;

    /**
     * Create a new instance of DeviceCollectionFragment, initialized to 'index'.
     */
    public static DeviceCollectionFragment newInstance(int index) {
        DeviceCollectionFragment collectionFragment = new DeviceCollectionFragment();

        return collectionFragment;
    }

    RecyclerView recyclerView;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
    }

    @Override
    public void onClick(View view) {

    }

    //Composition de DeviceFragment
    public DeviceCollectionFragment(){
        this.deviceFragment=new DeviceFragment();
    }
}