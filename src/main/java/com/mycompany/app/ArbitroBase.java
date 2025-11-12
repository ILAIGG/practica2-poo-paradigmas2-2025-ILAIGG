package com.mycompany.app;

public abstract class ArbitroBase {
    private String nombre;

    public ArbitroBase(String nombre) {
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
}
