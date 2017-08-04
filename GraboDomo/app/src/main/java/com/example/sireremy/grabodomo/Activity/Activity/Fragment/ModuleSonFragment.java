package com.example.sireremy.grabodomo.Activity.Activity.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sireremy.grabodomo.R;

/**
 * Created by SireRemy on 04/08/2017.
 */

public class ModuleSonFragment extends Fragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_module_son, null);
    }

    Switch aSwitch;

    private SeekBar seekBar;
    private TextView textView;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        aSwitch = (Switch) view.findViewById(R.id.sonSwitch);
        seekBar = (SeekBar) view.findViewById(R.id.seekBar1);
        textView = (TextView) view.findViewById(R.id.textView1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(getActivity(), "ON", Toast.LENGTH_SHORT).show();
                    seekBar.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);

                    // Initialize the textview with '0'
                    textView.setText(seekBar.getProgress() + "%");
                    seekBar.setOnSeekBarChangeListener(

                            new SeekBar.OnSeekBarChangeListener() {
                                int progress = 0;
                                @Override
                                public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                                    progress = progresValue;
                                }

                                @Override
                                public void onStartTrackingTouch(SeekBar seekBar) {
                                    // Do something here,

                                    //if you want to do anything at the start of
                                    // touching the seekbar
                                }

                                @Override
                                public void onStopTrackingTouch(SeekBar seekBar) {
                                    // Display the value in textview
                                    textView.setText(progress + "%");
                                }
                            });


                }
                else {
                    Toast.makeText(getActivity(), "OFF", Toast.LENGTH_SHORT).show();
                    seekBar.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);

                }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}
