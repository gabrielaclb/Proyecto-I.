package main.zoo.com;

import javax.swing.JOptionPane;

import acciones.zoo.com.AgregarOMostrar;

public class Main {

	public static void main(String[] args) {
	
		AgregarOMostrar action = new AgregarOMostrar();
		
			int volver = 1;
			
			do { 
				
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO AL ZOOLÓGICO! \n\n"
				
					+"Seleccione la clasificacion de animales para ver o seleccione agregar un nuevo animal: \n\n"
					+ "1. Mamiferos \n"
					+ "2. Aves \n"
					+ "3. Peces \n"
					+ "4. Anfibios \n"
					+ "5. Reptiles \n"
					+ "6. Agregar animal \n\n"));
					
			switch(tipo) {
	
			case 1: 
				
				action.mostrarMamiferos();
				
				break;
					
			case 2: 
				
				action.mostrarAves();
					
					break;
					
			case 3: 
			
				action.mostrarPeces();
			
		
					break;
			
			case 4: 
				
				action.mostrarAnfibios();
				
				
					break;
					
			case 5: 

				action.mostrarReptiles();
				
				
			break;
			
			
			case 6: 

				int tipo2 = Integer.parseInt(JOptionPane.showInputDialog(
					"Seleccione la clasificacion del animal a agregar: \n\n"
					+ "1. Mamiferos \n"
					+ "2. Aves \n"
					+ "3. Peces \n"
					+ "4. Anfibios \n"
					+ "5. Reptiles \n\n"));
			
			switch(tipo2) {
	
			case 1: 
				
				action.agregarMamifero();
				
				break;
					
			case 2: 
				
				action.agregarAves();
					
					break;
					
			case 3: 
			
				action.agregarPeces();
			
		
					break;
			
			case 4: 
				
				action.agregarAnfibio();
				
				
					break;
					
			case 5: 

				action.agregarReptiles();
				
				
			break;
			
			}
						
			}
			
						
			 volver = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas salir o volver a inicio?"
			 		+ "\n\n1. Salir"
			 		+ "\n2. Volver a inicio"));
			 
					}while(volver == 2);

}
}
	

