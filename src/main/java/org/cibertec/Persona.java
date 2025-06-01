package org.cibertec;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 

public class Persona {
	private String nombre, web;  
	private int edad;
	
	public Persona (String nombre, String web, int edad) {
		this.nombre = nombre;
		this.web = web ;
		this.edad = edad;
		
	}

}
