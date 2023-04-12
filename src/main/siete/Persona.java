package main.siete;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String apellido;
	@SuppressWarnings("unused")
	private Float edad;
	@SuppressWarnings("unused")
	private LocalDate fechaAlta;

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaAlta = LocalDate.now();
	};

	public String getNameCompleto() {
		return this.nombre + " " + this.apellido;
	};

	public void setEdad(Float edad) {
		this.edad = edad;
	}
};