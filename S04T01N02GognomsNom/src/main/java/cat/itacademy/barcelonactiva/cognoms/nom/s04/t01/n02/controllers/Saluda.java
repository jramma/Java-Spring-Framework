package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.controllers;


public class Saluda {
	private final long id;
	private final String texto;
	
	
	public Saluda(long id, String texto) {
		this.id = id;
		this.texto = texto;
	}
	public long getId() {
		return id;
	}
	public String getNombre() {
		return texto;
	}
	
	
}
