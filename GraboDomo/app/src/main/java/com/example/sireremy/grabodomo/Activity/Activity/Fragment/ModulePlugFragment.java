package com.example.sireremy.grabodomo.Activity.Activity.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;
import com.example.sireremy.grabodomo.R;

/**
 * @author Sire Remy
 * @version 1
 * Fragment appellé dans la main activity
 */

public class ModulePlugFragment extends Fragment implements View.OnClickListener{

    /**
     * Création de lavue
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
    Plug plug;

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

                }
                else {
                    //aSwitch.setText("OFF");
                    Toast.makeText(getActivity(), "OFF", Toast.LENGTH_SHORT).show();
                    imageViewON.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}
