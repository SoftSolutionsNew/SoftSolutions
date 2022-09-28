package com.MisionTic3;

import com.MisionTic3.Entities.MovimientoDinero;
import com.MisionTic3.Repository.MovimientoDineroRepository;
import com.MisionTic3.Services.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MisionTic3Application {

	public static void main(String[] args) {
		SpringApplication.run(MisionTic3Application.class, args);

		MovimientoDinero empresa1 =new MovimientoDinero(15621, "pago");

		MovimientoDinero empresa2 =new MovimientoDinero(45621, "pago 2");

		empresa1.setConceptoMovimiento("pago");
		empresa1.setMontoMovimiento(15621);

		//MovimientoDineroRepository repositorio = 0;

		//repositorio.save(empresa1);

		



		empresa2.setConceptoMovimiento("pago 3");
		empresa2.setMontoMovimiento(1562174);

		System.out.println("\n WebApi SoftSolutions");
	}

}
