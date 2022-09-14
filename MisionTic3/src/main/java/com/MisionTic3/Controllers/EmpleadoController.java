package com.MisionTic3.Controllers;

import com.MisionTic3.Entities.Empleado;
import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Services.EmpleadoService;
import com.MisionTic3.Services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmpleadoController {
    EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService=empleadoService;
    }

    @GetMapping("/empleado")
    public List<Empleado> getListEmpleado(){
        return this.empleadoService.ListEmpleado();
    }

    @PostMapping("/empleado")
    public Empleado InsertEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.CrearEmpleado(empleado);
    }

    @PutMapping("/empleado/{id}")
    public Empleado UpdateEmpleado(@PathVariable Long id, @RequestBody Empleado empleado){
        return this.empleadoService.UpdateEmpleado(id, empleado);
    }

    @DeleteMapping("/empleado/{id}")
    public Empleado EliminarEmpleado(@PathVariable(value = "id")Long id){
        return this.empleadoService.DeleteEmpleado(id);
    }

}
