package com.zoo.animales;

import com.zoo.interfaces.FormasDeDesplazarse;
import com.zoo.interfaces.MecanismoDeAtaque;
import com.zoo.interfaces.MecanismoDeDefensa;

public class Reptiles extends Animal implements MecanismoDeAtaque, MecanismoDeDefensa, FormasDeDesplazarse{
	
	//Atributos o características del animal
	private boolean caparazon, extremidades, dientes;
	private int numeroDeDientes;

	//Métodos Constructores
	public Reptiles() {
		super();
		}
	public Reptiles(int edad, int peso, int numeroDePatas, 
			String nombre, String tamaño, String medio, String genero,
			String alimentacion, String color, boolean pelo, boolean caparazon, 
			boolean extremidades, boolean dientes, int numeroDeDientes) {
		
		super(edad, peso, nombre, tamaño, medio, genero, alimentacion, color, pelo);
		
		this.caparazon = caparazon;
		this.extremidades = extremidades;
		this.dientes = dientes;
		this.numeroDeDientes = numeroDeDientes;
	}
	
	//Getters y Setters
	public boolean isCaparazon() {
		return caparazon;
	}

	public void setCaparazon(boolean caparazon) {
		this.caparazon = caparazon;
	}



	public boolean isExtremidades() {
		return extremidades;
	}



	public void setExtremidades(boolean extremidades) {
		this.extremidades = extremidades;
	}



	public boolean isDientes() {
		return dientes;
	}



	public void setDientes(boolean dientes) {
		this.dientes = dientes;
	}
	
	
	public int getNumeroDeDientes() {
		return numeroDeDientes;
	}

	public void setNumeroDeDientes(int numeroDeDientes) {
		this.numeroDeDientes = numeroDeDientes;
	}

	//Métodos
	
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

		System.out.println("Se mueve: ");
		
	}

	@Override
	public void reproducir() {
		System.out.println("Se aparea");
		
	}

	@Override
	public void respirar() {
		System.out.println("Respira");
		
	}

	@Override
	public void caminar() {
		System.out.println("Camina lentamente");
		
	}

	@Override
	public void correr() {
		System.out.println("");
		
	}

	@Override
	public void volar() {
		System.out.println("");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nada");
		
	}

	@Override
	public void saltar() {
		System.out.println("");
		
	}

	@Override
	public void trepar() {
		System.out.println("");
		
	}

	@Override
	public void planear() {
		System.out.println("");
		
	}

	@Override
	public void arrastrarse() {
		System.out.println("Se arrastra por el suelo");
	}

	@Override
	public void defensa() {
		System.out.print("Se defiende: ");
	}

	@Override
	public void atacaDeRegreso() {
		System.out.println("Ataca");
		
	}

	@Override
	public void espinas() {
		System.out.println("");
		
	}

	@Override
	public void veneno() {
		System.out.println("");
		
	}

	@Override
	public void caparazon() {
		System.out.println("Se protege con un caparazon");
		
	}

	@Override
	public void caza() {
		System.out.println("Caza a sus presas");
		
	}
	
	

}
