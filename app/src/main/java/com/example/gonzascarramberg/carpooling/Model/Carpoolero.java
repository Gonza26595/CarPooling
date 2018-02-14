package com.example.gonzascarramberg.carpooling.Model;

/**
 * Created by Gonza Scarramberg on 2/10/2018.
 */

public abstract class Carpoolero {


    private String nombre;
    private Universidad universidad;
    private Integer edad;
    private String carnetEstudiante;


    //GETTERS
    public String getNombre() {return nombre;}
    public Universidad getUniversidad() {return universidad;}
    public Integer getEdad() {return edad;}
    public String getCarnetEstudiante() {return carnetEstudiante;}


    //SETTERS
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setUniversidad(Universidad universidad) {this.universidad = universidad;}
    public void setEdad(Integer edad) {this.edad = edad;}
    public void setCarnetEstudiante(String carnetEstudiante) {this.carnetEstudiante = carnetEstudiante;}
}
