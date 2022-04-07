package com.elorrieta.clase;

public class Alumno {
	
	private int id;
	private String nombre;
	private String email;
	
	public Alumno() {
		super();
		this.id = 0;
		this.nombre  = "";
		this.email = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", email=" + email + "]";
	}
	

}
