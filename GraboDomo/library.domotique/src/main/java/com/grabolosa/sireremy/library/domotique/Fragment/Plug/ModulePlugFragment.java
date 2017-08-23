package com.grabolosa.sireremy.library.domotique.Fragment.Plug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.grabolosa.sireremy.library.domotique.Fragment.DeviceFragment;
import com.grabolosa.sireremy.library.domotique.Model.Device;
import com.grabolosa.sireremy.library.domotique.Model.Plug;
import com.grabolosa.sireremy.library.domotique.R;


/**
 * @author Sire Remy
 * @version 1
 * Fragment appellé dans la main activity
 */

public class ModulePlugFragment extends DeviceFragment implements View.OnClickListener{

    /**
     * Création de la vue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_module_plug, null);
    }


    Switch aSwitch;
    ImageView imageViewON;
    ImageView imageViewOFF;

    protected Device device;
    protected Plug plug;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageViewON = (ImageView) view.findViewById(R.id.imageViewOn);
        imageViewOFF = (ImageView) view.findViewById(R.id.imageViewOFF);

        aSwitch = (Switch) view.findViewById(R.id.priseSwitch);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    //aSwitch.setText("ON");
                    Toast.makeText(getActivity(), "ON", Toast.LENGTH_SHORT).show();
                    imageViewON.setVisibility(View.VISIBLE);

                    onStart();

                }
                else {
                    //aSwitch.setText("OFF");
                    Toast.makeText(getActivity(), "OFF", Toast.LENGTH_SHORT).show();
                    imageViewON.setVisibility(View.INVISIBLE);

                    onStop();
                }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
