package com.MisionTic3.Services;

import com.MisionTic3.Entities.Autenticacion;
import com.MisionTic3.Repository.RepositorioAutenticacion;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServicioAutenticacion {
    private RepositorioAutenticacion repositorioAutenticacion;

    public ServicioAutenticacion(RepositorioAutenticacion repositorioAutenticacion){
        this.repositorioAutenticacion = repositorioAutenticacion;
    }

    public RepositorioAutenticacion getRepositorioAutenticacion() {
        return repositorioAutenticacion;
    }

    public void setRepositorioAutenticacion(RepositorioAutenticacion repositorioAutenticacion) {
        this.repositorioAutenticacion = repositorioAutenticacion;
    }

    public Autenticacion searchEmail(String email){
        return this.repositorioAutenticacion.findByEmail(email);
    }

    public Autenticacion newCredencial(Autenticacion autenticacion){
        return this.repositorioAutenticacion.save(autenticacion);
    }

    public Autenticacion validAuth(Map<String, Object> DatosAuth){
        String email = DatosAuth.get("email").toString();
        Autenticacion autenticacion = searchEmail(email);
        if(autenticacion == null){
            String nameUser = DatosAuth.get("nameUser").toString();
            String imagen = DatosAuth.get("imagen").toString();
            String idAuth = DatosAuth.get("idAuth").toString();

            Autenticacion newAutenticacion = new Autenticacion(email = email, imagen = imagen,
                    idAuth = idAuth, nameUser = nameUser);
            return newCredencial(newAutenticacion);
        }
        return autenticacion;
    }

}
