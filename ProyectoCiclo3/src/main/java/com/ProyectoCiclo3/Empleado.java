package com.ProyectoCiclo3;
//Sergio Andres Vargas
public class Empleado {
    public String nombre;
    public String correo;
    public String empresaEmpleado;
    public String rolEmpleado;

    public Empleado(String nombre, String correo, String empresaEmpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
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

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
