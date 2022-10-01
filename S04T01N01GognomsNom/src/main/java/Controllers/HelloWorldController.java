package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.controllers;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
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
	
	
// https://www.baeldung.com/spring-optional-path-variables	
	@GetMapping(value={"/HelloWorld2","/HelloWorld2/{nombre}"})
	public Saluda saluda2(@PathVariable Optional <String> nombre, Model model) {
		if(nombre.isEmpty())
			nombre=Optional.of("UNKNOW");
		return new Saluda(counter.incrementAndGet(), String.format(template, nombre));
	}

}
