package com.mycompany.app;

public class Partido {
    private Arbitro arbitro;
    private Arbitro arbitroLinea1;
    private Arbitro arbitroLinea2;
    private Arbitro abritroAsistente;
    
    public Partido(Arbitro aribitro, Arbitro arbitroLinea1, Arbitro arbitroLinea2, Arbitro arbitroAsistente) {
        setArbitro(arbitro);
        setArbitroLinea1(arbitroLinea1);
        setArbitroLinea2(arbitroLinea2);
        setArbitroLAsistente(arbitroAsistente);
    }

    private void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Arbitro getAribitro() { return arbitro; }

    private void setArbitroLinea1(Arbitro arbitroLinea1) {
        this.arbitroLinea1 = arbitroLinea1;
    }

    public Arbitro getAribitroLinea1() { return arbitroLinea1; }

    private void setArbitroLinea2(Arbitro arbitroLinea2) {
        this.arbitroLinea2 = arbitroLinea2;
    }

    public Arbitro getAribitroLinea2() { return arbitroLinea2; }

    private void setArbitroLAsistente(Arbitro abritroAsistente) {
        this.abritroAsistente = abritroAsistente;
    }

    public Arbitro getAribitroAsistente() { return abritroAsistente; }

}
