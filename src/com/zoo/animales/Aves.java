package com.zoo.animales;

import com.zoo.interfaces.FormasDeDesplazarse;
import com.zoo.interfaces.MecanismoDeAtaque;

public class Aves extends Animal implements MecanismoDeAtaque, FormasDeDesplazarse {

	//Atributos o características del animal
	private int numeroDePlumas;
	private String colorDePico;
	private boolean garras;
	
	//Método Constructor
	public Aves() {
		super();
		}
	public Aves(int edad, int peso, String nombre, String tamaño, 
			String medio, String genero, String alimentacion, String color,
			boolean pelo, int numeroDePlumas, String colorDePico, boolean garras) {
		
		super(edad, peso, nombre, tamaño, medio, genero, alimentacion, color, pelo);
		
		this.numeroDePlumas = numeroDePlumas;
		this.colorDePico = colorDePico;
		this.garras = garras;
	}
	
	
	//Getters y setters
	public int getNumeroDePlumas() {
		return numeroDePlumas;
	}

	public void setNumeroDePlumas(int numeroDePlumas) {
		this.numeroDePlumas = numeroDePlumas;
	}


	public String getColorDePico() {
		return colorDePico;
	}

	public void setColorDePico(String colorDePico) {
		this.colorDePico = colorDePico;
	}

	public boolean isGarras() {
		return garras;
	}

	public void setGarras(boolean garras) {
		this.garras = garras;
	}

	//Metodos heredados
	@Override
	public void dormir() {
		System.out.println("Duerme");
	}
	
	
                        	//EJEMPLOS DE SOBRE ESCRITURA
	@Override
	public void comer() {
		System.out.println("Come usando su pico");
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
		

	/* Métodos: 
	 * Migran
	 * Planear
	 * Volar
	 * Caminar
	 * Nadar
	 */
	
	public void migrar() {
		System.out.println("migran");
	}

	//Metodos de las interfaces
	@Override
	public void caminar() {
		System.out.println("camina");
		
	}


	@Override
	public void correr() {
		System.out.println("corre");
		
	}

	@Override
	public void nadar() {
		System.out.println("nada");
		
	}

	@Override
	public void saltar() {
		System.out.println("salta");
		
	}

	@Override
	public void trepar() {
		System.out.println("trepa");
		
	}

	@Override
	public void caza() {
		System.out.println("caza a sus presas con buena vision");
		
	}

	@Override
	public void volar() {
		System.out.println("Vuela");
		
	}

	@Override
	public void planear() {
		System.out.print("Planea");
		
	}


	@Override
	public void arrastrarse() {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
