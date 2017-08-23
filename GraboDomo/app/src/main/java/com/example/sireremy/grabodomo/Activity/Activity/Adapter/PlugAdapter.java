package com.example.sireremy.grabodomo.Activity.Activity.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sireremy.grabodomo.Activity.Activity.Clients.ClientPlug;
import com.example.sireremy.grabodomo.Activity.Activity.Model.Plug;
import com.example.sireremy.grabodomo.R;

import java.util.ArrayList;

/**
 * @author Sire Rémy
 * @version 1
 * Classe gérant l'adapteur des données
 */

public class PlugAdapter extends RecyclerView.Adapter<PlugAdapter.PlugViewHolder> implements ClientPlug.OnPlugsListListener {

    private ArrayList<Plug> plugs;
    CardView cardView;
    private OnPlugClickListener listener;
    Plug plug;


    public PlugAdapter(ArrayList<Plug> plugs, OnPlugClickListener listener) {
        this.plugs = plugs;
        this.listener = listener;
        ClientPlug.getInstance().requestPlugs(this);
    }

    @Override
    public PlugViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_module_plug, parent, false);
        return new PlugViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlugViewHolder holder, int position) {
        holder.update(plugs.get(position));
    }

    @Override
    public int getItemCount() {
        return plugs.size();
    }

    @Override
    public void onPlugsReceived(ArrayList<Plug> Plugs) {

    }

    @Override
    public void onPlugsFailed(String error) {

    }

    public class PlugViewHolder extends RecyclerView.ViewHolder {

        TextView plugId;

        Plug plug;

        public PlugViewHolder(View itemView) {
            super(itemView);
            cardView    =   (CardView) itemView.findViewById(R.id.cardView_plug);
            plugId      =   (TextView) itemView.findViewById(R.id.PlugNumber);

        }

        public void update(final Plug mPlug) {
            plug = mPlug;

            /*
            plug = ClientPlug.getInstance().getPlug(plug.getPlugId());
            plugId.setText("N°"+plug.getPlugId());
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    listener.onPlugClicked(mPlug);
                }
            });
            */

        }
    }

    /**
     * Interface pour savoir quand une prise est cliqué
     */
    public interface OnPlugClickListener {
        void onPlugClicked(Plug plug);
    }
}
