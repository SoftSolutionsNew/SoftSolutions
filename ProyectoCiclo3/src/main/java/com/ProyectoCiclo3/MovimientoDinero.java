package com.ProyectoCiclo3;

public class MovimientoDinero {
    /* juan
    *
    *
    * */

    public float monto;
    public String concepto;

    public MovimientoDinero(float monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
    }

    public double Montos (){
        return -1;
    }

    public String UsuarioEncargado(){
        return "-1";
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
