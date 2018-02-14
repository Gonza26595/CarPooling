package com.example.gonzascarramberg.carpooling.Model;

import java.util.List;

/**
 * Created by Gonza Scarramberg on 2/10/2018.
 */

public class Viaje {

    private Conductor conductor;
    private List<Pasajero> listaPasajeros;
    private Double tramo;
    private Universidad destino;
    private String origen;
    private String hora;

    //GETTERS
    public Conductor getConductor() {return conductor;}
    public List<Pasajero> getListaPasajeros() {return listaPasajeros;}
    public Double getTramo() {return tramo;}
    public Universidad getDestino() {return destino;}
    public String getOrigen() {return origen;}
    public String getHora() {return hora;}

    //SETTERS
    public void setConductor(Conductor conductor) {this.conductor = conductor;}
    public void setListaPasajeros(List<Pasajero> listaPasajeros) {this.listaPasajeros = listaPasajeros;}
    public void setTramo(Double tramo) {this.tramo = tramo;}
    public void setDestino(Universidad destino) {this.destino = destino;}
    public void setOrigen(String origen) {this.origen = origen;}
    public void setHora(String hora) {this.hora = hora;}
}
