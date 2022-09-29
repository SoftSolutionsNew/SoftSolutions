package com.MisionTic3.Controllers;

import com.MisionTic3.Entities.Autenticacion;
import com.MisionTic3.Entities.Empleado;
import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Services.EmpleadoService;
import com.MisionTic3.Services.MovimientoDineroService;
import com.MisionTic3.Services.ServicioAutenticacion;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UsuarioController {
    ServicioAutenticacion servicioAutenticacion;
    MovimientoDineroService movimientoDineroService;
    EmpleadoService empleadoService;

    public UsuarioController(ServicioAutenticacion servicioAutenticacion, MovimientoDineroService movimientoDineroService, EmpleadoService empleadoService) {
        this.servicioAutenticacion = servicioAutenticacion;
        this.movimientoDineroService = movimientoDineroService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser oidcUser){
        if(oidcUser != null){
            System.out.println(oidcUser.getClaims());
            Autenticacion autenticacion = this.servicioAutenticacion.validAuth(oidcUser.getClaims());
            model.addAttribute("auth", autenticacion);
        }
        return "index";
    }

    @GetMapping("/user")
    public String informacion(Model model){
        List<Empleado> listEmpleados = this.empleadoService.ListEmpleado();
        List<MovimientoDinero> listMovimientos = this.movimientoDineroService.getListMovimientos();
        model.addAttribute("listaDeEmpleados", listEmpleados);
        model.addAttribute("listaDeMovimientos", listMovimientos);
        return "usuarios";
    }

    @GetMapping("/user/new")
    public String newEmpleado(Model model){
        model.addAttribute("newEmpleado", new Empleado());
        return "newUsuario";
    }

    @GetMapping("/user/{id}")
    public String updateEmpleado(@PathVariable Long id, Model model){
        Empleado empleado = this.empleadoService.getEmpleado(id);
        model.addAttribute( "updateEmpleado", empleado);
        return "actualizarUsuario";
    }

    @GetMapping("/user/movimiento")
    public String newMovimiento(Model model){
        model.addAttribute("newMovimiento", new MovimientoDinero());
        return "nuevoMovimiento";
    }
}
