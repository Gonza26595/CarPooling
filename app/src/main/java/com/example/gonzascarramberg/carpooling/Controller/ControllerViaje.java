package com.example.gonzascarramberg.carpooling.Controller;

import com.example.gonzascarramberg.carpooling.DAO.DAOViaje;
import com.example.gonzascarramberg.carpooling.Model.Viaje;

import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/14/2018.
 */

public class ControllerViaje {

    DAOViaje daoViaje= new DAOViaje();

    public List<Viaje> traerViajesPorUniversidad(){


        List<Viaje> listaViajes= daoViaje.traerListaViajesPorUniversidad();

        return listaViajes;
    }


}
