package com.example.gonzascarramberg.carpooling.DAO;

import com.example.gonzascarramberg.carpooling.Model.Universidad;
import com.example.gonzascarramberg.carpooling.Model.Viaje;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/14/2018.
 */

public class DAOViaje {

    public List<Viaje> traerListaViajesPorUniversidad(){

        Viaje viaje1= new Viaje(null,null,50.0,new Universidad(),"nuñez","austral");
        Viaje viaje2= new Viaje(null,null,50.0,new Universidad(),"belgrano","USAL");
        Viaje viaje3= new Viaje(null,null,50.0,new Universidad(),"devoto","10:00");
        Viaje viaje4= new Viaje(null,null,50.0,new Universidad(),"la boca","7:00");
        Viaje viaje5= new Viaje(null,null,50.0,new Universidad(),"urquiza","5:00");
        Viaje viaje6= new Viaje(null,null,50.0,new Universidad(),"paternal","10:00");
        Viaje viaje7= new Viaje(null,null,50.0,new Universidad(),"nuñez","8:00");
        Viaje viaje8= new Viaje(null,null,50.0,new Universidad(),"liniers","7:00");

        List<Viaje> listaViajesPorUniversidad= new ArrayList<>();

        viaje1.getDestino().setNombre("austral");
        viaje2.getDestino().setNombre("USAL");
        viaje3.getDestino().setNombre("San Andres");
        viaje4.getDestino().setNombre("UBA");
        viaje5.getDestino().setNombre("UCES");
        viaje6.getDestino().setNombre("USAL");
        viaje7.getDestino().setNombre("Di Tella");
        viaje8.getDestino().setNombre("San Andres");

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
