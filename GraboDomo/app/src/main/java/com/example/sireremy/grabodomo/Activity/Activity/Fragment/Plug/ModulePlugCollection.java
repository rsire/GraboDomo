package com.example.sireremy.grabodomo.Activity.Activity.Fragment.Plug;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.sireremy.grabodomo.Activity.Activity.Adapter.PlugAdapter;
import com.example.sireremy.grabodomo.Activity.Activity.Clients.ClientPlug;
import com.example.sireremy.grabodomo.Activity.Activity.Fragment.DeviceCollectionFragment;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Device;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;
import com.example.sireremy.grabodomo.R;

import java.util.ArrayList;

/**
 * Created by SireRemy on 08/08/2017.
 */

public class  ModulePlugCollection extends DeviceCollectionFragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_plug_collection, null);
    }

    private Device device;
    private Plug plug;

    RecyclerView recyclerView;

    ArrayList<Plug> _plug;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        _plug = new ArrayList<Plug>();

        recyclerView = (RecyclerView) view.findViewById(R.id.plugCollection);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    public void onClick(View view) {

    }

    /**
     * Méthode qui récupère les nouvelles données s'il y en a
     */
    private void setupRefreshSwipe(){
    }

}
