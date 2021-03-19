package com.zoo.animales;

import com.zoo.interfaces.FormasDeDesplazarse;
import com.zoo.interfaces.MecanismoDeAtaque;
import com.zoo.interfaces.MecanismoDeDefensa;

public class Anfibios extends Animal implements MecanismoDeDefensa, MecanismoDeAtaque, FormasDeDesplazarse{
	
	//Atributos o características del animal
	private boolean cola;
	private String tipoDeRespiracion;
	
	//Método Constructor
	public Anfibios() {
	super();
	}
	
	public Anfibios(int edad, int peso, 
			String nombre, String tamaño, String medio, String genero,
			String alimentacion, String color, boolean pelo, boolean cola, String tipoDeRespiracion) {
		
		super(edad, peso, nombre, tamaño, medio, genero, alimentacion, color, pelo);
		
		this.cola = cola;
		this.tipoDeRespiracion = tipoDeRespiracion;
	}
	
	//Getters y Setters
	public boolean isCola() {
		return cola;
	}


	public void setCola(boolean cola) {
		this.cola = cola;
	}


	public String getTipoDeRespiracion() {
		return tipoDeRespiracion;
	}


	public void setTipoDeRespiracion(String tipoDeRespiracion) {
		this.tipoDeRespiracion = tipoDeRespiracion;
	}
	
	/* Métodos:
	 * Saltan
	 * Capturan presas con su lengua
	 * Se defienden
	 * 
	 */

	@Override
	public void dormir() {
		System.out.println("Duerme");
	}
	
	@Override
	public void comer() {
		System.out.println("Come");
		
	}

	@Override
	public void mover() {
		System.out.println("Se mueve ");
		
	}


	@Override
	public void respirar() {
		System.out.println("Respiran");
		
	}

	@Override
	public void caminar() {

		System.out.print("Camina");
		
	}

	@Override
	public void correr() {

		System.out.print("Corre");
		
	}

	@Override
	public void volar() {
		System.out.println("");
		
	}

	@Override
	public void nadar() {
		System.out.println("");
		
	}

	@Override
	public void saltar() {
		System.out.println("Salta fuertemente");
		
	}

	@Override
	public void trepar() {
		System.out.println("Trepa");
		
	}

	@Override
	public void planear() {
		System.out.println("");
		
	}

	@Override
	public void caza() {
		System.out.println("Caza presas con su lengua");
		
	}

	@Override
	public void defensa() {
		System.out.println("Se defiende: ");
		
	}

	@Override
	public void atacaDeRegreso() {
		System.out.println("");
		
	}

	@Override
	public void espinas() {
		System.out.println("");
		
	}

	@Override
	public void veneno() {

		System.out.print("con veneno");
	}

	@Override
	public void arrastrarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caparazon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		
	}

	
}
