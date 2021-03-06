package acciones.zoo.com;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import animales.zoo.com.Anfibios;
import animales.zoo.com.Aves;
import animales.zoo.com.Mamiferos;
import animales.zoo.com.Peces;
import animales.zoo.com.Reptiles;

public class AgregarOMostrar {
	
	
	//Mamiferos del Zoo
	static ArrayList<Mamiferos> listaMamiferos = new ArrayList<Mamiferos>();
	Mamiferos leon = new Mamiferos(9, 190, 4, "Leon","Grande", "Terrestre", "Macho", "Carnivoro",
			"amarillo", 30, true,"abundante");  
	Mamiferos ballena = new Mamiferos(30, 23000, 0, "Ballena","Grande", "Marino", "Macho", "Herbivoro",
			"gris", 600, true, "leve");
	Mamiferos caballo = new Mamiferos(10, 450, 4, "Caballo","Grande", "Terrestre", "Macho", "Herbivoro",
			"marron", 30, true,"abundante");
	
	
	//Anfibios del Zoo
	ArrayList<Anfibios> listaAnfibios = new ArrayList<Anfibios>();
	Anfibios sapo = new Anfibios(3, 10, 4, "Sapo", "muy pequeño", "acuatico y terrestre", 
			"macho", "insectivoro", "verde oscuro", 
			false, false, "cutanea y pulmonar");
	Anfibios salamandra = new Anfibios(15, 28, 4, "Salamandra", "muy pequeña", "acuatico y terrestre", 
			"macho", "crustaceos y gusanos", "negro con amarillo", 
			false, true, "branquial");
	Anfibios triton = new Anfibios(12, 61, 4, "Triton", "muy pequeño", "acuatico y terrestre", 
			"macho", "insectivoro", "marron", 
			false, true, "cutanea");
	
	
	//Aves del Zoo
	ArrayList<Aves> listaAves = new ArrayList<Aves>();
	Aves aguila = new Aves(15, 5, 2, "Águila", "mediano", "aereo", "macho",
			"carnivoro", "marron con blanco", false, 20000, "gris", true);
	Aves colibri = new Aves(2, 1, 2, "Colibrí", "muy pequeño", "aereo", "hembra", 
			"herbivoro", "verde esmeralda", false, 100, "negro", true);
	Aves lechuza = new Aves(20, 2, 2, "Lechuza", "mediano", "aereo", "macho",
			"carnivoro (micromamiferos)", "blanco", false, 11000, "blanco", true);
	
	
	
	//Peces del Zoo
	ArrayList<Peces> listaPeces = new ArrayList<Peces>();
	Peces tiburon = new Peces(25, 1005, 0, "Tiburon", "Grande", "acuatico", "hembra", "carnivoro", 
			"gris con blanco", false, 8, 5, true, false, true);
	Peces espada = new Peces(6, 120, 0, "Pez espada", "Grande", "acuatico", "macho", 
			"carnivoro", "gris oscuro", false, 5, 4, true, false, true);
	Peces anguila = new Peces(9, 3, 0, "Anguila", "pequeño", "acuatico", "macho", "carnivoro", 
			"marron rojizo", false, 0, 1, true, false, true);
	
	
	//Reptiles del Zoo
	ArrayList<Reptiles> listaReptiles = new ArrayList<Reptiles>();
	Reptiles tortuga = new Reptiles(20, 290, 4, "Tortuga", "Muy grande", "acuatico", "hembra",
			"omnivoro", "verde orcuro", false, true, true, false, 0);
	Reptiles serpiente = new Reptiles(5, 12, 0, "Serpiente", "grande (largo)", "terrestre", "macho", 
			"carnivoro", "marron claro", false, false, false, true, 2);
	Reptiles cocodrilo = new Reptiles(58, 450, 4, "Cocodrilo americano", "Muy grande", "terrestre", "macho", 
			"carnivoro", "Verde oscuro", false, false, true, true, 80);
	
	
	
	public AgregarOMostrar(){
		//Agregar los mamiferos a la lista
		listaMamiferos.add(leon);
		listaMamiferos.add(ballena);
		listaMamiferos.add(caballo);
		
		//Agregar los Anfibios a la lista
		listaAnfibios.add(sapo);
		listaAnfibios.add(salamandra);
		listaAnfibios.add(triton);
				
		//Agregar los Aves a la lista
		listaAves.add(aguila);
		listaAves.add(colibri);
		listaAves.add(lechuza);
				
		//Agregar los Peces a la lista
		listaPeces.add(tiburon);
		listaPeces.add(espada);
		listaPeces.add(anguila);
				
		//Agregar los Reptiles a la lista
		listaReptiles.add(tortuga);
		listaReptiles.add(serpiente);
		listaReptiles.add(cocodrilo);
		
	}
	
	
	//Mostrar y agregar mamíferos
	public void mostrarMamiferos(){

		
		for (int i = 0; i < listaMamiferos.size(); i++) {
		
		System.out.println("\n\nCARACTERÍSTICAS:"
				+ "\nNombre: " + listaMamiferos.get(i).getNombre() 
				+ "\nEdad: " + listaMamiferos.get(i).getEdad() + " años"
				+ "\nPeso: " + listaMamiferos.get(i).getPeso() + " kg"
				+ "\nTamaño: " + listaMamiferos.get(i).getTamaño()
				+ "\nMedio (entorno): " + listaMamiferos.get(i).getMedio()
				+ "\nGenero: " + listaMamiferos.get(i).getGenero()
				+ "\nAlimentación: " + listaMamiferos.get(i).getAlimentacion()
				+ "\nColor: " + listaMamiferos.get(i).getColor()
				+ "\nNumero de dientes: " + listaMamiferos.get(i).getNumeroDePatas()
				+ "\nNumero de patas: " + listaMamiferos.get(i).getNumeroDePatas()
				+ "\nPelo: " + listaMamiferos.get(i).isPelo()
				+ "\nCantidad de pelo: " + listaMamiferos.get(i).getCantidadDePelo()
				
				+ "\n\nCOMPORTMAIENTO: ");
			listaMamiferos.get(i).comer();
			listaMamiferos.get(i).dormir();
			listaMamiferos.get(i).mover();
			listaMamiferos.get(i).procrear();
			listaMamiferos.get(i).respirar();
			if (i == 2) {
			listaMamiferos.get(i).cuidarCrias();
			listaMamiferos.get(i).adaptacion();
			listaMamiferos.get(i).defensa();
			} else if(i == 1) {
				listaMamiferos.get(i).cuidarCrias();
				listaMamiferos.get(i).agrupacion();
				listaMamiferos.get(i).caza();
				listaMamiferos.get(i).nadar();
			} else if (i == 0) {
				listaMamiferos.get(i).cuidarCrias();
				listaMamiferos.get(i).jugar();
				listaMamiferos.get(i).agrupacion();
				listaMamiferos.get(i).caza();
				listaMamiferos.get(i).defensa();
				listaMamiferos.get(i).atacaDeRegreso();
				listaMamiferos.get(i).caminar();
				listaMamiferos.get(i).saltar();
				listaMamiferos.get(i).correr();
			}
		}	
	}
	
	public void agregarMamifero() {
			
			String nombre = JOptionPane.showInputDialog("Nombre del animal: ");
			int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (años): "));
			int nPatas = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
			String tamaño = JOptionPane.showInputDialog("Tamaño: ");
			String medio = JOptionPane.showInputDialog("medio: ");
			String genero = JOptionPane.showInputDialog("genero: ");
			String alimentacion = JOptionPane.showInputDialog("alimentacion: ");
			String color = JOptionPane.showInputDialog("color: ");
			int nDientes = Integer.parseInt(JOptionPane.showInputDialog("Numero de dientes: "));
			boolean pelo2 = true;
			String pelo = JOptionPane.showInputDialog("¿Tiene pelo? (Responder: si, no, true o false): ");
			if (pelo == "true" || pelo == "si") {pelo2 = true;} else if (pelo == "false" || pelo == "no") {pelo2 = false;} else {System.out.println("error escribiedo el pelo");}
			String cantidadDePelo = JOptionPane.showInputDialog("Cantidad De Pelo: ");
			
			Mamiferos newMam = new Mamiferos(edad, peso, nPatas, nombre, tamaño, medio, genero, alimentacion, color, nDientes, pelo2, cantidadDePelo);
			listaMamiferos.add(newMam);
			
			JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
			
		}
		
	//Mostrar y agregar anfibios
	public void mostrarAnfibios(){

			
			for (int i = 0; i < listaAnfibios.size(); i++) {
			
			System.out.println("\n\nCARACTERÍSTICAS:"
					+ "\nNombre: " + listaAnfibios.get(i).getNombre() 
					+ "\nEdad: " + listaAnfibios.get(i).getEdad() + " años"
					+ "\nPeso: " + listaAnfibios.get(i).getPeso() + " kg"
					+ "\nTamaño: " + listaAnfibios.get(i).getTamaño()
					+ "\nMedio (entorno): " + listaAnfibios.get(i).getMedio()
					+ "\nGenero: " + listaAnfibios.get(i).getGenero()
					+ "\nAlimentación: " + listaAnfibios.get(i).getAlimentacion()
					+ "\nColor: " + listaAnfibios.get(i).getColor()
					+ "\nPelo: " + listaAnfibios.get(i).isPelo()
					+ "\nCola: " + listaAnfibios.get(i).isCola()
					+ "\nTipo de respiracion: " + listaAnfibios.get(i).getTipoDeRespiracion()
					
					+ "\n\nCOMPORTAMIENTO: ");
			listaAnfibios.get(i).comer();
			listaAnfibios.get(i).dormir();
			listaAnfibios.get(i).mover();
			listaAnfibios.get(i).respirar();
			if (i == 0) {
			listaAnfibios.get(i).saltar();
			listaAnfibios.get(i).caza();
			} else if(i == 1) {
				listaAnfibios.get(i).trepar();
			} else if (i == 2) {
				listaAnfibios.get(i).trepar();
				}
			}	
		}
		
	public void agregarAnfibio() {
				
				String nombre = JOptionPane.showInputDialog("Nombre del animal: ");
				int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
				int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (años): "));
				int nPatas = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
				String tamaño = JOptionPane.showInputDialog("Tamaño: ");
				String medio = JOptionPane.showInputDialog("medio: ");
				String genero = JOptionPane.showInputDialog("genero: ");
				String alimentacion = JOptionPane.showInputDialog("alimentacion: ");
				String color = JOptionPane.showInputDialog("color: ");
				boolean pelo2 = true;
				String pelo = JOptionPane.showInputDialog("¿Tiene pelo? (Responder: si, no, true o false): ");
				if (pelo == "true" || pelo == "si") {pelo2 = true;} else if (pelo == "false" || pelo == "no") {pelo2 = false;} else {System.out.println("error escribiedo el pelo");}
				boolean cola = true;
				String cola2 = JOptionPane.showInputDialog("¿Tiene cola? (Responder: si, no, true o false): ");
				if (cola2 == "true" || cola2 == "si") {cola = true;} else if (cola2 == "false" || cola2 == "no") {cola = false;} else {System.out.println("error escribiedo el pelo");}
				String respiracion = JOptionPane.showInputDialog("Tipo de respiracion: ");
				
				Anfibios newAnfb = new Anfibios(edad, peso, nPatas, nombre, tamaño, medio, genero, alimentacion, color, pelo2, cola, respiracion);
				listaAnfibios.add(newAnfb);
				
				JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
				
			}
	
	//Mostrar y agregar Aves
	public void mostrarAves(){

			
			for (int i = 0; i < listaAves.size(); i++) {
			
			System.out.println("\n\nCARACTERÍSTICAS:"
					+ "\nNombre: " + listaAves.get(i).getNombre() 
					+ "\nEdad: " + listaAves.get(i).getEdad() + " años"
					+ "\nPeso: " + listaAves.get(i).getPeso() + " kg"
					+ "\nTamaño: " + listaAves.get(i).getTamaño()
					+ "\nMedio (entorno): " + listaAves.get(i).getMedio()
					+ "\nGenero: " + listaAves.get(i).getGenero()
					+ "\nAlimentación: " + listaAves.get(i).getAlimentacion()
					+ "\nColor: " + listaAves.get(i).getColor()
					+ "\nPelo: " + listaAves.get(i).isPelo()
					+ "\nNumero de plumas: " + listaAves.get(i).getNumeroDePlumas()
					+ "\nColor de pico: " + listaAves.get(i).getColorDePico()
					+ "\nGarras: " + listaAves.get(i).isGarras()
					
					+ "\n\nCOMPORTAMIENTO: ");
			listaAves.get(i).comer();
			listaAves.get(i).dormir();
			listaAves.get(i).mover();
			listaAves.get(i).volar();
			listaAves.get(i).respirar();
			listaAves.get(i).reproducir();
			listaAves.get(i).migrar();
			if (i == 0) {
				listaAves.get(i).caza();
				listaAves.get(i).planear();
				} 
			}	
		}
		
	public void agregarAves() {
				
				String nombre = JOptionPane.showInputDialog("Nombre del animal: ");
				int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
				int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (años): "));
				int nPatas = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
				String tamaño = JOptionPane.showInputDialog("Tamaño: ");
				String medio = JOptionPane.showInputDialog("medio: ");
				String genero = JOptionPane.showInputDialog("genero: ");
				String alimentacion = JOptionPane.showInputDialog("alimentacion: ");
				String color = JOptionPane.showInputDialog("color: ");
				boolean pelo2 = true;
				String pelo = JOptionPane.showInputDialog("¿Tiene pelo? (Responder: si, no, true o false): ");
				if (pelo == "true" || pelo == "si") {pelo2 = true;} else if (pelo == "false" || pelo == "no") {pelo2 = false;} else {System.out.println("error escribiedo el pelo");}
				int nPlumas = Integer.parseInt(JOptionPane.showInputDialog("Numero de plumas: "));
				String cPico = JOptionPane.showInputDialog("Color de pico: ");
				boolean garras = true;
				String garras2 = JOptionPane.showInputDialog("¿Tiene garras? (Responder: si, no, true o false): ");
				if (garras2 == "true" || garras2 == "si") {garras = true;} else if (garras2 == "false" || garras2 == "no") {garras = false;} else {System.out.println("error escribiedo el pelo");}
				
				
				Aves newAv = new Aves(edad, peso, nPatas, nombre, tamaño, medio, genero, alimentacion, color, pelo2, nPlumas, cPico, garras);
				listaAves.add(newAv);
				
				JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
				
			}
	
	//Mostrar y agregar Peces
	public void mostrarPeces(){
				
				for (int i = 0; i < listaPeces.size(); i++) {
				
				System.out.println("CARACTERÍSTICAS:"
						+ "\nNombre: " + listaPeces.get(i).getNombre() 
						+ "\nEdad: " + listaPeces.get(i).getEdad() + " años"
						+ "\nPeso: " + listaPeces.get(i).getPeso() + " kg"
						+ "\nTamaño: " + listaPeces.get(i).getTamaño()
						+ "\nMedio (entorno): " + listaPeces.get(i).getMedio()
						+ "\nGenero: " + listaPeces.get(i).getGenero()
						+ "\nAlimentación: " + listaPeces.get(i).getAlimentacion()
						+ "\nColor: " + listaPeces.get(i).getColor()
						+ "\nPelo: " + listaPeces.get(i).isPelo()
						+ "\nNumero de aletas: " + listaPeces.get(i).getNumeroDeAletas()
						+ "\nNumero de branquias: " + listaPeces.get(i).getNumeroDeBranquias()
						+ "\nCartilaginoso: " + listaPeces.get(i).isCartilaginoso()
						+ "\nOseo: " + listaPeces.get(i).isOseo()
						+ "\nEscamas: " + listaPeces.get(i).isEscamas()
						
						+ "\n\nCOMPORTAMIENTO: ");
				listaPeces.get(i).comer();
				listaPeces.get(i).dormir();
				listaPeces.get(i).mover();
				listaPeces.get(i).nadar();
				listaPeces.get(i).respirar();
				listaPeces.get(i).reproducir();
				if (i == 0) {
					listaPeces.get(i).defensa();
					listaPeces.get(i).caza();
				} else if(i == 1) {
					listaPeces.get(i).defensa();
					listaPeces.get(i).caza();
				} else if (i == 2) {
					listaPeces.get(i).defensa();
					listaPeces.get(i).caza();
					}
				}	
			}
			
	public void agregarPeces() {
					
					String nombre = JOptionPane.showInputDialog("Nombre del animal: ");
					int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
					int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (años): "));
					int nPatas = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
					String tamaño = JOptionPane.showInputDialog("Tamaño: ");
					String medio = JOptionPane.showInputDialog("medio: ");
					String genero = JOptionPane.showInputDialog("genero: ");
					String alimentacion = JOptionPane.showInputDialog("alimentacion: ");
					String color = JOptionPane.showInputDialog("color: ");
					boolean pelo2 = true;
					String pelo = JOptionPane.showInputDialog("¿Tiene pelo? (Responder: si, no, true o false): ");
					if (pelo == "true" || pelo == "si") {pelo2 = true;} else if (pelo == "false" || pelo == "no") {pelo2 = false;} else {System.out.println("error escribiedo el pelo");}
					int nAletas = Integer.parseInt(JOptionPane.showInputDialog("Numero de aletas: "));
					int nBranquias = Integer.parseInt(JOptionPane.showInputDialog("Numero de branquias: "));
					boolean cartilaginoso = true;
					String cartilaginoso2 = JOptionPane.showInputDialog("¿Es cartilaginoso? (Responder: si, no, true o false): ");
					if (cartilaginoso2 == "true" || cartilaginoso2 == "si") {cartilaginoso = true;} else if (cartilaginoso2 == "false" || cartilaginoso2 == "no") {cartilaginoso = false;} else {System.out.println("error escribiedo");}
					boolean oseo = true;
					String oseo2 = JOptionPane.showInputDialog("¿Es cartilaginoso? (Responder: si, no, true o false): ");
					if (oseo2 == "true" || oseo2 == "si") {oseo = true;} else if (oseo2 == "false" || oseo2 == "no") {oseo = false;} else {System.out.println("error escribiedo");}
					boolean escamas = true;
					String escamas2 = JOptionPane.showInputDialog("¿Es cartilaginoso? (Responder: si, no, true o false): ");
					if (escamas2 == "true" || escamas2 == "si") {escamas = true;} else if (escamas2 == "false" || escamas2 == "no") {escamas = false;} else {System.out.println("error escribiedo");}
					
					
					Peces newPez = new Peces(edad, peso, nPatas, nombre, tamaño, medio, genero, alimentacion, color, pelo2, nAletas, nBranquias, cartilaginoso, oseo, escamas);
					listaPeces.add(newPez);
					
					JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
					
				}

	//Mostrar y agregar Reptiles 
	public void mostrarReptiles(){
					
					for (int i = 0; i < listaReptiles.size(); i++) {
					
					System.out.println("CARACTERÍSTICAS:"
							+ "\nNombre: " + listaReptiles.get(i).getNombre() 
							+ "\nEdad: " + listaReptiles.get(i).getEdad() + " años"
							+ "\nPeso: " + listaReptiles.get(i).getPeso() + " kg"
							+ "\nTamaño: " + listaReptiles.get(i).getTamaño()
							+ "\nMedio (entorno): " + listaReptiles.get(i).getMedio()
							+ "\nGenero: " + listaReptiles.get(i).getGenero()
							+ "\nAlimentación: " + listaReptiles.get(i).getAlimentacion()
							+ "\nColor: " + listaReptiles.get(i).getColor()
							+ "\nPelo: " + listaReptiles.get(i).isPelo()
							+ "\nCaparazon: " + listaReptiles.get(i).isCaparazon()
							+ "\nExtremidades: " + listaReptiles.get(i).isExtremidades()
							+ "\nDientes: " + listaReptiles.get(i).isDientes()
							+ "\nNumero de dientes: " + listaReptiles.get(i).getNumeroDeDientes()
							
							
							+ "\n\nCOMPORTAMIENTO: ");
					listaReptiles.get(i).comer();
					listaReptiles.get(i).dormir();
					listaReptiles.get(i).mover();
					listaReptiles.get(i).nadar();
					listaReptiles.get(i).respirar();
					listaReptiles.get(i).reproducir();
					if (i == 0) {
						listaReptiles.get(i).caminar();
						listaReptiles.get(i).caza();
					} else if(i == 1) {
						listaReptiles.get(i).arrastrarse();
						listaReptiles.get(i).defensa();
						listaReptiles.get(i).caparazon();
					} else if (i == 2) {
						listaReptiles.get(i).nadar();
						listaReptiles.get(i).caza();
						}
					}	
				}
				
	public void agregarReptiles() {
						
						String nombre = JOptionPane.showInputDialog("Nombre del animal: ");
						int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso (kg): "));
						int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad (años): "));
						int nPatas = Integer.parseInt(JOptionPane.showInputDialog("Numero de patas: "));
						String tamaño = JOptionPane.showInputDialog("Tamaño: ");
						String medio = JOptionPane.showInputDialog("medio: ");
						String genero = JOptionPane.showInputDialog("genero: ");
						String alimentacion = JOptionPane.showInputDialog("alimentacion: ");
						String color = JOptionPane.showInputDialog("color: ");
						boolean pelo2 = true;
						String pelo = JOptionPane.showInputDialog("¿Tiene pelo? (Responder: si, no, true o false): ");
						if (pelo == "true" || pelo == "si") {pelo2 = true;} else if (pelo == "false" || pelo == "no") {pelo2 = false;} else {System.out.println("error escribiedo el pelo");}
						boolean caparazon = true;
						String caparazon2 = JOptionPane.showInputDialog("¿Tiene caparazon? (Responder: si, no, true o false): ");
						if (caparazon2 == "true" || caparazon2 == "si") {caparazon = true;} else if (caparazon2 == "false" || caparazon2 == "no") {caparazon = false;} else {System.out.println("error escribiedo");}
						boolean extremidades = true;
						String extremidades2 = JOptionPane.showInputDialog("¿Tiene extremidades? (Responder: si, no, true o false): ");
						if (extremidades2 == "true" || extremidades2 == "si") {extremidades = true;} else if (extremidades2 == "false" || extremidades2 == "no") {extremidades = false;} else {System.out.println("error escribiedo");}
						boolean dientes = true;
						String dientes2 = JOptionPane.showInputDialog("¿Tiene dientes? (Responder: si, no, true o false): ");
						if (dientes2 == "true" || dientes2 == "si") {dientes = true;} else if (dientes2 == "false" || dientes2 == "no") {dientes = false;} else {System.out.println("error escribiedo");}
						int nDientes = Integer.parseInt(JOptionPane.showInputDialog("Numero de dientes: "));
						
						Reptiles newRep = new Reptiles(edad, peso, nPatas, nombre, tamaño, medio, genero, alimentacion, color, pelo2, caparazon, extremidades, dientes, nDientes);
						listaReptiles.add(newRep);
						
						JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
						
					}

		
}
