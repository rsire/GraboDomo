package com.example.sireremy.grabodomo.Activity.Activity.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;

/**
 * @author Sire Rémy
 * @version 1
 * Classe gérant l'adapteur des données
 */

public class PlugAdapter extends RecyclerView.Adapter<PlugAdapter.PlugViewHolder> {


    @Override
    public PlugViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PlugViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class PlugViewHolder extends RecyclerView.ViewHolder {

        Plug plug;

        public PlugViewHolder(View itemView) {
            super(itemView);
        }
    }
}
