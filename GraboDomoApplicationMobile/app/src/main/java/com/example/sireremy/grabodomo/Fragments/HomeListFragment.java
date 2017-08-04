package com.example.sireremy.grabodomo.Fragments;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sireremy.grabodomo.R;

/**
 * Created by SireRemy on 20/07/2017.
 */

public class HomeListFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    /**
     * Création de lavue
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_list, null);
    }


    RecyclerView objetsList;
    private CardView cardView;


    @Override
    public void onClick(View view) {

    }
}
