package com.MisionTic3.Repository;

import com.MisionTic3.Entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero,Long> {

}
