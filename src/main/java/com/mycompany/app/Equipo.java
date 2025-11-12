package com.mycompany.app;

import java.util.ArrayList;

public class Equipo {
    
    private String nombre;
    private ArrayList<Tarjeta> tarjetas;

    public Equipo(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        this.tarjetas.add(tarjeta);
    }
}
