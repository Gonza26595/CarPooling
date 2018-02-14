package com.example.gonzascarramberg.carpooling.Model;

import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/10/2018.
 */

public class Universidad {


    private String nombre;
    private String direccion;
    private List<Carpoolero> listaCarpooleros;


    //GETTERS
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public List<Carpoolero> getListaCarpooleros() {return listaCarpooleros;}

    //SETTERS
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setListaCarpooleros(List<Carpoolero> listaCarpooleros) {this.listaCarpooleros = listaCarpooleros;}
}
