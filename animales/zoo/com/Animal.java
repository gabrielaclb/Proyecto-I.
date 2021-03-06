package animales.zoo.com;

public abstract class Animal {

	/*
	 Esta es la clase padre, de aqu� heredaran los otros tipos de animales
	 a su vez, es la clase abstracta.
	  */
	
	//Atributos animales
	private int edad, peso;
	private String nombre, tama�o, medio, genero, alimentacion, color;
	boolean pelo;
	
	//M�todos:
	
	//M�todos constructores
	public Animal() {
		this.edad = 3; //a�os
		this.peso = 2; //kg     
		this.nombre = "perro";
		this.tama�o = "peque�o";
		this.medio = "terrestre";
		this.genero = "hembra";
		this.alimentacion = "omnivoro";
		this.color = "blanco";         // Sobrecarga de m�todos constructores
		this.pelo = true;
	}
	
	public Animal(int edad, int peso, int numeroDePatas, String nombre, String tama�o, 
			String medio, String genero, String alimentacion,  String color,
			boolean pelo) {
		
		this.edad = edad;
		this.peso = peso;
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.medio = medio;
		this.genero = genero;
		this.alimentacion = alimentacion;
		this.color = color;
		this.pelo = pelo;
	}
	
	//Getters y Setters
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//M�todos: dormir, comer, mover, reproducir, respirar

	public abstract void dormir();
	
	public abstract void comer();
	
	public abstract void mover();
	
	public abstract void reproducir();
	
	public abstract void respirar();
	
	
	
}
