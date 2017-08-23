package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Humidity.ModuleHumidityFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Plug.ModulePlugFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Speaker.ModuleSpeakerFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.Temperature.ModuleTemperatureFragment;
import com.example.sireremy.grabodomo.R;

/**
 * @author Sire Remy
 * @version 1
 * Classe gérant l'activité principale
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonPlug;
    private Button buttonSpeaker;
    private Button buttonHumidity;
    private Button buttonTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlug = (Button) findViewById(R.id.Plug);
        buttonSpeaker = (Button) findViewById(R.id.Speaker);
        buttonHumidity = (Button) findViewById(R.id.Humidite);
        buttonTemperature = (Button) findViewById(R.id.Temperature);

        buttonPlug.setOnClickListener(this);
        buttonSpeaker.setOnClickListener(this);
        buttonHumidity.setOnClickListener(this);
        buttonTemperature.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==buttonPlug) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModulePlugFragment())
                    .commit();
        }
        if(view==buttonSpeaker) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleSpeakerFragment())
                    .commit();
        }
        if(view==buttonHumidity) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleHumidityFragment())
                    .commit();
        }
        else if(view==buttonTemperature) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleTemperatureFragment())
                    .commit();
        }
    }
}
