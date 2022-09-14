package com.MisionTic3.Services;

import com.MisionTic3.Entities.Empleado;
import com.MisionTic3.Entities.Empresa;
import com.MisionTic3.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmpresaService {
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository=empresaRepository;
    }

    public List<Empresa> getRepositorio(){
        return this.empresaRepository.findAll();
    }

    public Empresa crearRegistro(Empresa empresa){
        return this.empresaRepository.save(empresa);
    }

    public Empresa ActualizarEmpresa(@PathVariable Long id, @RequestBody Empresa empresa){
        Empresa empresaActual = this.empresaRepository.findById(id).orElseThrow();
        empresaActual.setNombre(empresa.getNombre());
        empresaActual.setDireccion(empresa.getDireccion());
        empresaActual.setTelefono(empresa.getTelefono());
        empresaActual.setNit(empresa.getNit());
        return this.empresaRepository.save(empresaActual);
    }

    public Empresa EliminarEmpresa(Long id){
        Empresa empresa = this.empresaRepository.findById(id).orElseThrow();
        this.empresaRepository.deleteById(id);
        return empresa;
    }
}
