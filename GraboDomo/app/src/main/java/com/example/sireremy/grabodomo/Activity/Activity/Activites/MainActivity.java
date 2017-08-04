package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.ModulePlugFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.ModuleSonFragment;
import com.example.sireremy.grabodomo.R;

/**
 * @author Sire Remy
 * @version 1
 * Classe gérant l'activité principale
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonPlug;
    private Button buttonSon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlug = (Button) findViewById(R.id.Plug);
        buttonSon = (Button) findViewById(R.id.Son);

        buttonPlug.setOnClickListener(this);
        buttonSon.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==buttonPlug) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModulePlugFragment())
                    .commit();
        }
        else if(view==buttonSon) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new ModuleSonFragment())
                    .commit();
        }
    }
}
