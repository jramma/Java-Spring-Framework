package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final String template = "Hola, %s . Estás ejecutando un proyecto Maven.";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/HelloWorld")
	public Saluda saluda(@RequestParam(value = "nombre", defaultValue = "UNKNOWN") String nombre) {
		return new Saluda(counter.incrementAndGet(), String.format(template, nombre));
	}
	
	@GetMapping("/HelloWorld2")
	public Saluda saluda2(@PathVariable(value = "nombre") String nombre) {
		return new Saluda(counter.incrementAndGet(), String.format(template, nombre));
	}

}
