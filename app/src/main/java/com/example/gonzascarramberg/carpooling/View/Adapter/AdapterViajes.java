package com.example.gonzascarramberg.carpooling.View.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gonzascarramberg.carpooling.Model.Viaje;
import com.example.gonzascarramberg.carpooling.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/14/2018.
 */

public class AdapterViajes extends RecyclerView.Adapter {

    private List<Viaje> listaViajes;
    private Context context;

    public AdapterViajes(Context context) {
        this.context = context;
        listaViajes= new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.estetica_adapter_viajes,parent,false);
        Holder holder= new Holder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         Viaje viaje = listaViajes.get(position);
         Holder holder1= (Holder) holder;
         holder1.cargarDatos(viaje);

    }

    @Override
    public int getItemCount() {
        return listaViajes.size();
    }


    public class Holder extends RecyclerView.ViewHolder {

        private TextView viajes;

        public Holder(View itemView) {
            super(itemView);
            viajes = (TextView) itemView.findViewById(R.id.textViewViajes);
        }

        public void cargarDatos(Viaje viaje) {
            viajes.setText(viaje.getOrigen().toString());
        }


    }


    public void setListaViajes(List<Viaje> listaViajes) {this.listaViajes = listaViajes;}
}
