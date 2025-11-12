package com.mycompany.app;

public abstract class IntegranteDelVar extends ArbitroBase {
    private String tipoAsistente;

    public IntegranteDelVar(String nombre, String tipoAsistente) {
        super(nombre);
        setTipoAsistente(tipoAsistente);
    }

    private void setTipoAsistente(String tipoAsistente) {
        this.tipoAsistente = tipoAsistente;
    }

    public String getTipoAsistente() { return tipoAsistente; }
}
