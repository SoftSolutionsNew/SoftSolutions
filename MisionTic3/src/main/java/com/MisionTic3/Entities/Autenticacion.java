package com.MisionTic3.Entities;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Autenticacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "nameUser")
    private String nameUser;
    @Column(name = "idAuth", unique = true)
    private String idAuth;

    public Autenticacion(){
    }

    public Autenticacion(String email, String imagen, String nameUser, String idAuth) {
        this.email = email;
        this.imagen = imagen;
        this.nameUser = nameUser;
        this.idAuth = idAuth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getIdAuth() {
        return idAuth;
    }

    public void setIdAuth(String idAuth) {
        this.idAuth = idAuth;
    }
}
