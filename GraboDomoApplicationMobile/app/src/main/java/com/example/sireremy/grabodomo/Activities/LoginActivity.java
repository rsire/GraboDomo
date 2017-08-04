package com.example.sireremy.grabodomo.Activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.sireremy.grabodomo.R;

public class LoginActivity extends AppCompatActivity {

    //Toolbar
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Toolbar
        mToolbar = (Toolbar) findViewById(R.id.customToolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle(getResources().getText(R.string.app_name));
        mToolbar.setTitleTextColor(Color.WHITE);
    }
}
