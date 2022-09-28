package com.MisionTic3.Controllers;

import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Services.MovimientoDineroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

    MovimientoDineroService movimientoDineroService;

    public FrontController (MovimientoDineroService movimientoDineroService){
        this.movimientoDineroService = movimientoDineroService;
    }

    @GetMapping("/")
    public String index () {
        return "index";
    }

    @GetMapping("/movimientos")
    public String  movimientos (Model model){

        List<MovimientoDinero> movimientos=this.movimientoDineroService.getListMovimientos();
        model.addAttribute("movimientos", movimientos);
        return "movimientos";
    }
}
