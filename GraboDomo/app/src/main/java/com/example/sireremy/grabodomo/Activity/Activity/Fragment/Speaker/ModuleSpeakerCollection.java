package com.example.sireremy.grabodomo.Activity.Activity.Fragment.Speaker;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sireremy.grabodomo.Activity.Activity.Fragment.DeviceCollectionFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Device;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Speaker;
import com.example.sireremy.grabodomo.R;

import java.util.ArrayList;

/**
 * Created by SireRemy on 10/08/2017.
 */

public class ModuleSpeakerCollection extends DeviceCollectionFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_speaker_collection, null);
    }

    private Device device;
    private Speaker speaker;


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onClick(View view) {

    }
}
