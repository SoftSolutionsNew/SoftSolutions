package com.MisionTic3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "montoMovimiento")
    private double montoMovimiento;
    @Column(name = "conceptoMovimiento")
    private String conceptoMovimiento;

    public MovimientoDinero(){}

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public double crearMonto(){
        return -1;
    }

    public String UsuarioEncargadoRegistro(){
        return "-1";
    }
}
