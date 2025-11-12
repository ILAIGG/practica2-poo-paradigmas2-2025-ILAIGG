package com.mycompany.app;

public class Tarjeta {
    private String tipoTarjeta;

    public Tarjeta(String tipoTarjeta) {
        setTipoTarjeta(tipoTarjeta);
    }

    private void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }
}
