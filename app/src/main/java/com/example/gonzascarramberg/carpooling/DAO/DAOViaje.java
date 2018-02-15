package com.example.gonzascarramberg.carpooling.DAO;

import com.example.gonzascarramberg.carpooling.Model.Viaje;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/14/2018.
 */

public class DAOViaje {

    public List<Viaje> traerListaViajesPorUniversidad(){

        Viaje viaje1= new Viaje("viaje1");
        Viaje viaje2= new Viaje("viaje2");
        Viaje viaje3= new Viaje("viaje3");
        Viaje viaje4= new Viaje("viaje4");
        Viaje viaje5= new Viaje("viaje5");
        Viaje viaje6= new Viaje("viaje6");
        Viaje viaje7= new Viaje("viaje7");
        Viaje viaje8= new Viaje("viaje8");

        List<Viaje> listaViajesPorUniversidad= new ArrayList<>();

        listaViajesPorUniversidad.add(viaje1);
        listaViajesPorUniversidad.add(viaje2);
        listaViajesPorUniversidad.add(viaje3);
        listaViajesPorUniversidad.add(viaje4);
        listaViajesPorUniversidad.add(viaje5);
        listaViajesPorUniversidad.add(viaje6);
        listaViajesPorUniversidad.add(viaje7);
        listaViajesPorUniversidad.add(viaje8);

        return listaViajesPorUniversidad;
    }



}
