package com.MisionTic3.Controllers;

import com.MisionTic3.Entities.Empresa;
import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Services.MovimientoDineroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MovimintoDineroController {

    MovimientoDineroService movimientoDineroService;

    public MovimintoDineroController(MovimientoDineroService movimientoDineroService) {
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping("/movimiento")
    public List<MovimientoDinero> getListMovimiento(){
        return this.movimientoDineroService.getListMovimientos();
    }

    @PostMapping("/movimiento")
    public MovimientoDinero InsertMovimiento(@RequestBody MovimientoDinero movimientoD){
        return this.movimientoDineroService.CrearMovimiento(movimientoD);
    }

    @PutMapping("/movimiento/{id}")
    public MovimientoDinero UpdateMovimiento(@PathVariable Long id, @RequestBody MovimientoDinero movimientoD){
        return this.movimientoDineroService.UpdateMovimiento(id, movimientoD);
    }

    @DeleteMapping("/movimiento/{id}")
    public MovimientoDinero EliminarMovimiento(@PathVariable(value = "id")Long id){
        return this.movimientoDineroService.DeleteMovimiento(id);
    }
}
