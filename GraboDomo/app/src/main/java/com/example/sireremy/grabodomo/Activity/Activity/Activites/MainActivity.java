package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.sireremy.grabodomo.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import static com.example.sireremy.grabodomo.R.id.tab_home;
import static com.example.sireremy.grabodomo.R.id.tab_notif;
import static com.example.sireremy.grabodomo.R.id.tab_setting;

/**
 * @author Sire Remy
 * @version 1
 * Classe gérant l'activité principale
 */

public class MainActivity extends AppCompatActivity{

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar
        mToolbar = (Toolbar) findViewById(R.id.customToolbar);
        setSupportActionBar(mToolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(false);

        mToolbar.setTitle("Home");
        mToolbar.setTitleTextColor(Color.WHITE);


        /**
         * Gestion des actions de la bottom bar, appel des fragments en fonction de l'onglet selectionné
         */
        //Initialisation de la vue principale + Mise en place des éléments du menu
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if(tabId==tab_notif) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentMain, new AlertFragment())
                            .commit();
                    mToolbar.setTitle("Notifications");
                }
                if(tabId==tab_home) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentMain, new HomeFragment())
                            .commit();
                    mToolbar.setTitle("Home");
                }
                else if(tabId==tab_setting) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentMain, new SettingFragment())
                            .commit();
                    mToolbar.setTitle("Settings");
                }
            }
        });
    }
}
