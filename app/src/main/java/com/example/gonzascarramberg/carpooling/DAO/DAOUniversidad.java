package com.example.gonzascarramberg.carpooling.DAO;

import com.example.gonzascarramberg.carpooling.Model.Universidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/14/2018.
 */

public class DAOUniversidad {


    public List<Universidad> traerListaUniversidades(){

        Universidad universidadDelSalvador= new Universidad();
        Universidad universidadAustral= new Universidad();
        Universidad universidad3= new Universidad();
        Universidad universidad4= new Universidad();
        Universidad universidad5= new Universidad();
        Universidad universidad6= new Universidad();
        Universidad universidad7= new Universidad();

        List<Universidad> listaUniversidades= new ArrayList<>();
        listaUniversidades.add(universidadDelSalvador);
        listaUniversidades.add(universidadAustral);
        listaUniversidades.add(universidad3);
        listaUniversidades.add(universidad4);
        listaUniversidades.add(universidad5);
        listaUniversidades.add(universidad6);
        listaUniversidades.add(universidad7);

         return listaUniversidades;

    }



}
