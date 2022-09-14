package com.MisionTic3.Services;

import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Repository.MovimientoDineroRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MovimientoDineroService {

    MovimientoDineroRepository movimientoDineroRep;

    public MovimientoDineroService(MovimientoDineroRepository movimientoDineroRep) {
        this.movimientoDineroRep = movimientoDineroRep;
    }

    public List<MovimientoDinero> getListMovimientos(){
        return this.movimientoDineroRep.findAll();
    }

    public MovimientoDinero CrearMovimiento(MovimientoDinero movimientoDin){
        return this.movimientoDineroRep.save(movimientoDin);
    }

    public MovimientoDinero UpdateMovimiento(@PathVariable Long id, @RequestBody MovimientoDinero movimientoDin){
        MovimientoDinero movimientoDinero = this.movimientoDineroRep.findById(id).orElseThrow();
        movimientoDinero.setConceptoMovimiento(movimientoDin.getConceptoMovimiento());
        movimientoDinero.setMontoMovimiento(movimientoDinero.getMontoMovimiento());

        return  this.movimientoDineroRep.save(movimientoDinero);
    }

    public MovimientoDinero DeleteMovimiento(Long id){
        MovimientoDinero movimientoDinero = this.movimientoDineroRep.findById(id).orElseThrow();
        this.movimientoDineroRep.deleteById(id);

        return movimientoDinero;
    }

}
