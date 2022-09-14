package com.MisionTic3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "empresaEmpleadoP")
    private String empresaEmpleadoP;
    @Column(name = "rolEmpleado")
    private String rolEmpleado;

    @Transient
    MovimientoDinero movimientoDinero;

    public Empleado(){}

    public Empleado(String nombre, String correo, String empresaEmpleadoP, String rolEmpleado, MovimientoDinero movimientoDinero) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleadoP = empresaEmpleadoP;
        this.rolEmpleado = rolEmpleado;
        this.movimientoDinero = movimientoDinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleadoP() {
        return empresaEmpleadoP;
    }

    public void setEmpresaEmpleadoP(String empresaEmpleadoP) {
        this.empresaEmpleadoP = empresaEmpleadoP;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaEmpleadoP='" + empresaEmpleadoP + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", movimientoDinero=" + this.movimientoDinero +
                '}';
    }
}
