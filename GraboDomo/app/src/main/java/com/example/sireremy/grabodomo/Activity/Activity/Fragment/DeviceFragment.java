package com.example.sireremy.grabodomo.Activity.Activity.Fragment;

import android.support.v4.app.Fragment;
import android.view.View;

import com.example.sireremy.grabodomo.Activity.Activity.Clients.DataSource;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Humidity.ModuleHumidityFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Plug.ModulePlugFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Speaker.ModuleSpeakerFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Temperature.ModuleTemperatureFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Device;
import com.example.sireremy.grabodomo.Activity.Activity.Model.DeviceStatus;

/**
 * Created by SireRemy on 07/08/2017.
 */

public class DeviceFragment extends Fragment implements View.OnClickListener {

    private Device device;
    private DeviceStatus deviceStatus;

    //URL du serveur URL 10.0.2.2 localServeur Emulateur
    private String SERVER_URL = "url";

    /**
     * Create a new instance of DeviceFragment.
     */
    public static DeviceFragment newInstance() {
        return new DeviceFragment();
    }

    @Override
    public void onClick(View view) {

    }

    public void deviceStatus(){
        switch (deviceStatus){
            case OFFLINE:

                break;
            case POWERED:

                break;
            case NOTFOUND:

                break;
            default:
        }
    }


}
