package com.example.sireremy.grabodomo.Activity.Activity.Activites;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.EdgeEffectCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sireremy.grabodomo.R;

/**
 * Created by SireRemy on 24/08/2017.
 */

public class SettingFragment extends Fragment {

    /**
     * Methode qui constuit la vue du fragment
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_setting, null);
    }

    private Switch aSwitch;
    private EditText urlHTTP;
    private Button validURL;
    TextView about, reset;

    /**
     * Quand la vue est créée faire..
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        about = (TextView) view.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertNotImplemented();
            }
        });
        reset = (TextView) view.findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertNotImplemented();
            }
        });

        aSwitch = (Switch) view.findViewById(R.id.switch_sync);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getActivity(), ("Sync ..."), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), ("Off"), Toast.LENGTH_SHORT).show();
                }
            }
        });

        urlHTTP = (EditText) view.findViewById(R.id.et_http) ;

        //Bouton valider la nouvelle adresse HTTP
        validURL = (Button) view.findViewById(R.id.bt_valid);
        validURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (urlHTTP.getText().toString().isEmpty()) {
                    Toast.makeText(getActivity(), ("Erreur"), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), ("Loading..."), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private void showAlertNotImplemented(){
        new AlertDialog.Builder(getActivity())
                .setTitle("Warning")
                .setMessage("This fonctionnality comme son")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }
}
