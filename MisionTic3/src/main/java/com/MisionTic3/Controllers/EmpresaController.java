package com.MisionTic3.Controllers;

import com.MisionTic3.Entities.Empresa;
import com.MisionTic3.Services.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {
    EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService=empresaService;
    }

    @GetMapping("/enterprice")
    public List<Empresa> informacion(){
        return this.empresaService.getRepositorio();
    }

    @PostMapping("/enterprice")
    public Empresa InsertEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.crearRegistro(empresa);
    }

    @PutMapping("/enterprice/{id}")
    public Empresa UpdateEmpresa(@PathVariable Long id, @RequestBody Empresa empresa){
        return this.empresaService.ActualizarEmpresa(id, empresa);
    }

    @DeleteMapping("/enterpice/{id}")
    public Empresa EliminarEmpresa(@PathVariable(value = "id")Long id){
        return this.empresaService.EliminarEmpresa(id);
    }
}
