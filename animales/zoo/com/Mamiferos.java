package animales.zoo.com;

import interfaces.zoo.com.FormasDeDesplazarse;
import interfaces.zoo.com.MecanismoDeAtaque;
import interfaces.zoo.com.MecanismoDeDefensa;

public class Mamiferos extends Animal implements MecanismoDeAtaque, MecanismoDeDefensa, FormasDeDesplazarse {

	//Atributos o características del animal
	private int numeroDeDientes, numeroDePatas;
	private String cantidadDePelo;
	
	//Método Constructor (Sobrecarga de métodos)
	public Mamiferos() {
		super();
		}
	public Mamiferos(int edad, int peso, int numeroDePatas, String nombre, String tamaño,
			String medio, String genero, String alimentacion, String color, int numeroDeDientes, 
			boolean pelo, String cantidadDePelo) {
		
		super(edad, peso, numeroDePatas, nombre, tamaño, medio, genero, alimentacion, color, pelo);
	
	
		this.numeroDeDientes = numeroDeDientes;
		this.numeroDePatas = numeroDePatas;
		this.cantidadDePelo = cantidadDePelo;
	}
	
	//Getters y Setters
	public int getNumeroDeDientes() {
		return numeroDeDientes;
	}

	public void setNumeroDeDientes(int numeroDeDientes) {
		this.numeroDeDientes = numeroDeDientes;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCantidadDePelo() {
		return cantidadDePelo;
	}

	public void setCantidadDePelo(String cantidadDePelo) {
		this.cantidadDePelo = cantidadDePelo;
	}

	
	//Métodos heredados
	
	public void comer() {
		System.out.println("Come usando su mandibula");
	}
	
	public void dormir() {
		System.out.println("Duerme");
	}
	
	public void mover() {
		System.out.println("Se mueve");
	}
	
	public void procrear() {
		System.out.println("Se aparea");
	}
	
	public void respirar() {
		System.out.println("Respira");
	}
	
	/* Métodos: 
	 * Cuidan a sus crías
	 * Juegan
	 * Se adaptan a un determinado hábitat
	 * Se agrupan
	 * Dintintas formas de desplazarse (nadan, vuelan, corren, saltan, trepan, reptan o planean)
	 * */ 
	
	public void cuidarCrias() {
		System.out.println("Cuida a sus crías");
	}
	
	public void jugar() {
		System.out.println("Juega");
	}
	
	public void adaptacion() {
		System.out.println("Se adapta a distintos habitats");
	}
	
	public void agrupacion() {
		System.out.println("Van en manada");
	}
	
	//Métodos de la interfaz
	@Override
	public void defensa() {
		System.out.print("Se defiende cuando lo atacan: ");
	}
	
	@Override
	public void atacaDeRegreso() {
		System.out.println("Ataca de regreso");
	}
	
	public void espinas() {
		System.out.println("Suelta espinas");
	}

	@Override
	public void caza() {
		System.out.println("Caza a sus presas");
	}

	@Override
	public void caminar() {
		System.out.print("camina");
		
	}

	@Override
	public void volar() {
		System.out.print("vuela");
		
	}

	@Override
	public void nadar() {
		System.out.print("nada");
		
	}

	@Override
	public void saltar() {
		System.out.println("salta");
		
	}

	@Override
	public void trepar() {
		System.out.print("trepa");
		
	}

	@Override
	public void planear() {
		System.out.print("planea");
		
	}

	@Override
	public void correr() {
		System.out.print("corre");
		
	}

	@Override
	public void veneno() {
		// TODO Auto-generated method stub
		
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
