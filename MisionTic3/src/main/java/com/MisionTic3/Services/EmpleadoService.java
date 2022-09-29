package com.MisionTic3.Services;

import com.MisionTic3.Entities.Empleado;
import com.MisionTic3.Repository.EmpleadoRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EmpleadoService {

    private EmpleadoRepository empleadoRepo;

    public EmpleadoService(EmpleadoRepository empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }

    public List<Empleado> ListEmpleado(){
        return this.empleadoRepo.findAll();
    }

    public Empleado CrearEmpleado(Empleado empleado){
        return this.empleadoRepo.save(empleado);
    }

    public Empleado UpdateEmpleado(@PathVariable Long id, @RequestBody Empleado empleado){
        Empleado empleadoActual = this.empleadoRepo.findById(id).orElseThrow();
        empleadoActual.setCorreo(empleado.getCorreo());
        empleadoActual.setNombre(empleado.getNombre());
        empleadoActual.setRolEmpleado(empleado.getRolEmpleado());
        empleadoActual.setEmpresaEmpleadoP(empleado.getEmpresaEmpleadoP());

        return this.empleadoRepo.save(empleadoActual);
    }

    public Empleado DeleteEmpleado(Long id){
        Empleado empleadoActual = this.empleadoRepo.findById(id).orElseThrow();
        this.empleadoRepo.deleteById(id);

        return empleadoActual;
    }

    public Empleado getEmpleado(Long id){
        return this.empleadoRepo.findById(id).orElseThrow();
    }
}
