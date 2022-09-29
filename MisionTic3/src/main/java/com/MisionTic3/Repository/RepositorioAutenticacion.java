package com.MisionTic3.Repository;

import com.MisionTic3.Entities.Autenticacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAutenticacion extends JpaRepository<Autenticacion, Long> {
    Autenticacion findByEmail(String email);
}