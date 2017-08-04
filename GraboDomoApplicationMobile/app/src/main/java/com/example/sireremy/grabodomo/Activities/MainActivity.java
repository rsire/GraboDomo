package com.example.sireremy.grabodomo.Activities;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sireremy.grabodomo.Fragments.HomeListFragment;
import com.example.sireremy.grabodomo.Fragments.SenarioListFragment;
import com.example.sireremy.grabodomo.Fragments.SettingFragment;
import com.example.sireremy.grabodomo.R;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

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

        mToolbar.inflateMenu(R.menu.main_menu);
        mToolbar.setTitle(getResources().getText(R.string.tab_home));
        mToolbar.setTitleTextColor(Color.WHITE);


        /**
         * Gestion des actions de la bottom bar, appel des fragments en fonction de l'onglet selectionné
         */
        //Initialisation de la vue principale + Mise en place des éléments du menu
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_home) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentHome, new HomeListFragment())
                            .commit();
                    mToolbar.setTitle(getResources().getText(R.string.tab_home));
                }
                if (tabId == R.id.tab_senario) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentHome, new SenarioListFragment())
                            .commit();
                    mToolbar.setTitle(getResources().getText(R.string.tab_senario));
                }
                if (tabId == R.id.tab_setting) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentHome, new SettingFragment())
                            .commit();
                    mToolbar.setTitle(getResources().getText(R.string.tab_settings));
                }
            }

        });

    }
    /**
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Sync:
                //deconnexion();
                return true;
            case R.id.Quitter:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
