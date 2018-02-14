package com.example.gonzascarramberg.carpooling.Model;

import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/10/2018.
 */

public class Grupo {


    private List<Carpoolero> listaCarpooleros;
    private String nombre;
    private Integer cantidadPasajeros;


    //GETTERS
    public List<Carpoolero> getListaCarpooleros() {return listaCarpooleros;}
    public String getNombre() {return nombre;}
    public Integer getCantidadPasajeros() {return cantidadPasajeros;}

    //SETTERS
    public void setListaCarpooleros(List<Carpoolero> listaCarpooleros) {this.listaCarpooleros = listaCarpooleros;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCantidadPasajeros(Integer cantidadPasajeros) {this.cantidadPasajeros = cantidadPasajeros;}
}
