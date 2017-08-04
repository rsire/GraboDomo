package com.example.sireremy.grabodomo.Activity.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.ModulePlugFragment;
import com.example.sireremy.grabodomo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, new ModulePlugFragment())
                .commit();

    }
}
