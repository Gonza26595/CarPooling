package com.example.gonzascarramberg.carpooling.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gonzascarramberg.carpooling.Controller.ControllerViaje;
import com.example.gonzascarramberg.carpooling.Model.Viaje;
import com.example.gonzascarramberg.carpooling.R;
import com.example.gonzascarramberg.carpooling.View.Adapter.AdapterViajes;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMisViajes extends Fragment {


    private List<Viaje> listaViajes;
    private RecyclerView recyclerView;
    private TextView textViewViaje;
    private AdapterViajes adapterViajes;
    private ControllerViaje controllerViaje;

    public FragmentMisViajes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);


        controllerViaje= new ControllerViaje();
        listaViajes= controllerViaje.traerViajesPorUniversidad();
        adapterViajes= new AdapterViajes(getContext());
        recyclerView= (RecyclerView) view.findViewById(R.id.listaViajesPrincipal);
        textViewViaje= (TextView) view.findViewById(R.id.textViewFragmentPrincipal);
        adapterViajes.setListaViajes(listaViajes);

        recyclerView.setAdapter(adapterViajes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        if(!listaViajes.isEmpty() || listaViajes == null){

            textViewViaje.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);

        }





        return view;
    }

}
