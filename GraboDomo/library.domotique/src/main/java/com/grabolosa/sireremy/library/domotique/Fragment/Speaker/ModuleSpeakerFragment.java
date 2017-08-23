package com.grabolosa.sireremy.library.domotique.Fragment.Speaker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.grabolosa.sireremy.library.domotique.Fragment.DeviceFragment;
import com.grabolosa.sireremy.library.domotique.Model.Device;
import com.grabolosa.sireremy.library.domotique.Model.EqualizerSetting;
import com.grabolosa.sireremy.library.domotique.Model.Speaker;
import com.grabolosa.sireremy.library.domotique.R;

/**
 * Created by SireRemy on 04/08/2017.
 */

public class ModuleSpeakerFragment extends DeviceFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_module_speaker, null);
    }

    //REPETITION
    protected Device device;
    protected Speaker speaker;
    protected EqualizerSetting equalizerSetting;


    Switch aSwitch;

    private SeekBar seekBar;
    private TextView number100, plugName;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        aSwitch = (Switch) view.findViewById(R.id.sonSwitch);
        seekBar = (SeekBar) view.findViewById(R.id.seekBar1);
        number100 = (TextView) view.findViewById(R.id.textView1);
        plugName = (TextView) view.findViewById(R.id.PlugName);

        //plugName.setText(speaker.getSpeakerName());

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(getActivity(), "ON", Toast.LENGTH_SHORT).show();
                    seekBar.setVisibility(View.VISIBLE);
                    number100.setVisibility(View.VISIBLE);

                    // Initialize the textview with '0'
                    number100.setText(seekBar.getProgress() + "%");
                    seekBar.setOnSeekBarChangeListener(

                            new SeekBar.OnSeekBarChangeListener() {
                                int progress = 0;
                                @Override
                                public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                                    progress = progresValue;

                                }

                                @Override
                                public void onStartTrackingTouch(SeekBar seekBar) {

                                }

                                @Override
                                public void onStopTrackingTouch(SeekBar seekBar) {
                                    // Display the value in textview
                                    number100.setText(progress + "%");

                                }
                            });
                }
                else {
                    Toast.makeText(getActivity(), "OFF", Toast.LENGTH_SHORT).show();
                    seekBar.setVisibility(View.INVISIBLE);
                    number100.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    @Override
    public void onClick(View view) {

    }

    public void equalizerSettings(){
        switch (equalizerSetting ){
            case NORMAL:

                break;
            case AUTO:

                break;
            case POP:

                break;
            case CLASSICAL:

                break;
            case JAZZ:

                break;
            case ROCK:

                break;
            default:
        }
    }

}
