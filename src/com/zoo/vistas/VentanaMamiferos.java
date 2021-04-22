package com.zoo.vistas;

import java.awt.EventQueue;





import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;


import java.awt.Color;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.Action;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.zoo.animales.Mamiferos;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;


public class VentanaMamiferos {

	private JFrame frmVentanaMamiferos;
	private final Action action = new SwingAction();
	static JTextField txtNombre;
	static JTextField txtEdad;
	static JTextField txtPeso;
	static JTextField txtPatas;
	static JTextField txtTamaño;
	static JTextField txtMedio;
	static JTextField txtGenero;
	static JTextField txtAlimentacion;
	static JTextField txtColor;
	static JTextField txtPelo;
	static JTextField txtCantPelo;
	static JTextField txtNDientes;
	
	private JTable table;
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	
	
	//Variables para borrar
	String edad = "";
	String peso = "";
	String nombre = " ";
	String tamaño = "";
	String medio = "";
	String genero = "";
	String alimentacion = "";
	String color = "";
	String pelo = "";
	String numeroDeDientes = "";
	String numeroDePatas = "";
	String cantidadDePelo = "";

	
	//Mamiferos del Zoo
		static ArrayList<Mamiferos> listaMamiferos = new ArrayList<Mamiferos>();
		
		/* Mamiferos leon = new Mamiferos(9, 190, 4, "Leon","Grande", "Terrestre", "Macho", "Carnivoro",
				"amarillo", 30, true,"abundante");  
		Mamiferos ballena = new Mamiferos(30, 23000, 0, "Ballena","Grande", "Marino", "Macho", "Herbivoro",
				"gris", 600, true, "leve");
		Mamiferos caballo = new Mamiferos(10, 450, 4, "Caballo","Grande", "Terrestre", "Macho", "Herbivoro",
				"marron", 30, true,"abundante");
		private final Action action_4 = new SwingAction_4();
		*/
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMamiferos window = new VentanaMamiferos();
					window.frmVentanaMamiferos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaMamiferos() {

	/*	listaMamiferos.add(leon);
		listaMamiferos.add(ballena);
		listaMamiferos.add(caballo); */
		initialize(); 
		
		table.addMouseListener(new MouseAdapter() {
			DefaultTableModel model = new DefaultTableModel();
			
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				nombre = (table.getValueAt(i, 0).toString());
				edad = (table.getValueAt(i, 1).toString());
				peso = (table.getValueAt(i, 2).toString());
				numeroDePatas = (table.getValueAt(i, 3).toString());
				tamaño = (table.getValueAt(i, 4).toString());
				medio = (table.getValueAt(i, 5).toString());
				genero = (table.getValueAt(i, 6).toString());
				alimentacion = (table.getValueAt(i, 7).toString());
				color = (table.getValueAt(i, 8).toString());
				pelo = (table.getValueAt(i, 9).toString());
				cantidadDePelo = (table.getValueAt(i, 10).toString());
				numeroDeDientes = (table.getValueAt(i, 11).toString());
				
				txtNombre.setText(nombre);
				txtEdad.setText(edad);
				txtPeso.setText(peso);
				txtPatas.setText(numeroDePatas);
				txtTamaño.setText(tamaño);
				txtMedio.setText(medio);
				txtGenero.setText(genero);
				txtAlimentacion.setText(alimentacion);
				txtColor.setText(color);
				txtPelo.setText(pelo);
				txtNDientes.setText(numeroDeDientes);
				txtCantPelo.setText(cantidadDePelo);
				
				
				}});
		
			
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaMamiferos = new JFrame();
		frmVentanaMamiferos.setTitle("Ventana Mamiferos");
		frmVentanaMamiferos.setBounds(100, 100, 481, 626);
		frmVentanaMamiferos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaMamiferos.getContentPane().setLayout(new BoxLayout(frmVentanaMamiferos.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaMamiferos.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 446, 173);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Edad", "Peso", "# Patas", "Tama\u00F1o", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.getColumnModel().getColumn(0).setMinWidth(81);
		table.getColumnModel().getColumn(1).setPreferredWidth(81);
		table.getColumnModel().getColumn(1).setMinWidth(81);
		table.getColumnModel().getColumn(2).setPreferredWidth(81);
		table.getColumnModel().getColumn(2).setMinWidth(81);
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		table.getColumnModel().getColumn(3).setMinWidth(81);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(4).setMinWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setMinWidth(81);
		table.getColumnModel().getColumn(6).setPreferredWidth(81);
		table.getColumnModel().getColumn(6).setMinWidth(81);
		table.getColumnModel().getColumn(7).setPreferredWidth(81);
		table.getColumnModel().getColumn(7).setMinWidth(81);
		table.getColumnModel().getColumn(8).setPreferredWidth(81);
		table.getColumnModel().getColumn(8).setMinWidth(81);
		table.getColumnModel().getColumn(9).setPreferredWidth(81);
		table.getColumnModel().getColumn(9).setMinWidth(81);
		scrollPane.setViewportView(table);
		
		JLabel Titulo = new JLabel("Mam\u00EDferos");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(200, 11, 95, 14);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(76, 506, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(56, 318, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(56, 343, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(131, 315, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setText("int");
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setColumns(10);
		txtEdad.setBounds(131, 340, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(56, 370, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1_2 = new JLabel("N\u00B0de Patas: ");
		lblNewLabel_1_2_4_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_2.setBounds(57, 398, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_2);
		
		txtPeso = new JTextField();
		txtPeso.setText("int");
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(131, 367, 86, 20);
		panel.add(txtPeso);
		
		txtPatas = new JTextField();
		txtPatas.setText("int");
		txtPatas.setDropMode(DropMode.INSERT);
		txtPatas.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPatas.setForeground(Color.GRAY);
		txtPatas.setColumns(10);
		txtPatas.setBounds(131, 392, 86, 20);
		panel.add(txtPatas);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(56, 419, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(56, 444, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(131, 416, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(131, 441, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(227, 318, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(227, 343, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(302, 315, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(302, 340, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(227, 366, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(227, 391, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(302, 363, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("String");
		txtPelo.setColumns(10);
		txtPelo.setBounds(302, 388, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("Cantidad pelo: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(227, 414, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("N\u00B0 dientes: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(227, 439, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtCantPelo = new JTextField();
		txtCantPelo.setDropMode(DropMode.INSERT);
		txtCantPelo.setForeground(Color.GRAY);
		txtCantPelo.setText("String");
		txtCantPelo.setColumns(10);
		txtCantPelo.setBounds(302, 411, 86, 20);
		panel.add(txtCantPelo);
		
		txtNDientes = new JTextField();
		txtNDientes.setText("int");
		txtNDientes.setDropMode(DropMode.INSERT);
		txtNDientes.setForeground(Color.GRAY);
		txtNDientes.setColumns(10);
		txtNDientes.setBounds(302, 436, 86, 20);
		panel.add(txtNDientes);
		
		JButton btnNewButton = new JButton("Mostrar Mamiferos");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(87, 230, 144, 23);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("New button");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(244, 230, 144, 23);
		panel.add(btnEliminar);
		
		JButton btnModificar = new JButton("New button");
		btnModificar.setAction(action_3);
		btnModificar.setBounds(244, 506, 155, 23);
		panel.add(btnModificar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		//btnNewButton_1.setAction();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(76, 553, 323, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblAgregarOModificar = new JLabel("Agregar o modificar mam\u00EDfero");
		lblAgregarOModificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarOModificar.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAgregarOModificar.setBounds(10, 275, 446, 23);
		panel.add(lblAgregarOModificar);
		}
		
	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar mamifero");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			try {
				
				//Datos
				String edad = VentanaMamiferos.txtEdad.getText();
				String peso = VentanaMamiferos.txtPeso.getText();
				String patas = VentanaMamiferos.txtPatas.getText();
				String nombre = VentanaMamiferos.txtNombre.getText();
				String tamaño = VentanaMamiferos.txtTamaño.getText();
				String medio =  VentanaMamiferos.txtMedio.getText();
				String genero = VentanaMamiferos.txtGenero.getText();
				String alimentacion = VentanaMamiferos.txtAlimentacion.getText();
				String color = VentanaMamiferos.txtColor.getText();
				String ndientes = VentanaMamiferos.txtNDientes.getText();
				String pelo = "true";
				String cantpelo = VentanaMamiferos.txtCantPelo.getText();
				

				
				Mamiferos newMam = new Mamiferos(Integer.parseInt(edad), Integer.parseInt(peso), 
						Integer.parseInt(patas), nombre, tamaño, medio, 
						genero, alimentacion, color, 
						Integer.parseInt(ndientes), true, cantpelo);
				listaMamiferos.add(newMam);
				
				final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    	    final String user = "postgres";
	    	    final String password = "17camarones";
	    	    
	    	    Connection conn = null;
	    	    
	    	    try {
	    	    	conn = DriverManager.getConnection(url, user, password);
	    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a agregar los datos del mamifero a la DB");
	    	    	Statement st = conn.createStatement();
	    	    	st.executeUpdate("INSERT INTO mamiferos(nombre, edad, peso, patas, \"tamaño\", medio, genero, alimientacion, color, pelo, cantpelo, ndientes)VALUES"
	    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tamaño+"','"+medio+"',"
	    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo+"', '"+cantpelo+"','"+ndientes+"')");
	    	    	JOptionPane.showMessageDialog(null, "Se agregaron los datos en la DB con éxito");
	    	    	conn.close();
	    	    }
	    	    catch(SQLException e1) {
	    	    	System.out.println(e1.getMessage());
	    	    	JOptionPane.showMessageDialog(null, "Error en la conexión");
	    	    	}
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Animal no se pudo agregar: \n" + e2);
				System.out.println(e2);
			}
			
			
			  
			mostrar();
			
			}
		
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Actualiar Mamiferos");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			mostrar();
			
		}
		
		
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Eliminar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
			final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
    	    final String user = "postgres";
    	    final String password = "17camarones";
    	    
    	    Connection conn = null;
    	    
    	    try {
    	    	conn = DriverManager.getConnection(url, user, password);
    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a borrar el animal de la DB");
    	    	Statement st = conn.createStatement();
    	    	
    	    	for (int i = 0; i< listaMamiferos.size(); i++) {
    	    		System.out.println(nombre);
    				//if(nombre==listaMamiferos.get(i).getNombre()) {
    					try {
    						st.executeUpdate("DELETE FROM public.mamiferos\n"
        	    	    			+ "	WHERE nombre='"+nombre+"'");
        					JOptionPane.showMessageDialog(null, "Se borro el animal");
						} catch (SQLException e2) {
							System.out.println(e2);
						}System.out.println("holas");
    					
    					//listaMamiferos.remove(i);
    				
    			}
    	    	
    	    	
    	    	conn.close();
    	    }
    	    catch(SQLException e1) {
    	    	System.out.println(e1.getMessage());
    	    	JOptionPane.showMessageDialog(null, "Error en la conexión");
    	    	}
			
    	    
			
			//Actualizar (funcion mostrar)
			mostrar();
			clearFields();
		}
		
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Modificar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//Modificar elemento del arraylist
			/*
			for (int i = 0; i< listaMamiferos.size(); i++) {
				if(nombre==listaMamiferos.get(i).getNombre()) {
					listaMamiferos.get(i).setNombre(VentanaMamiferos.txtNombre.getText());
					listaMamiferos.get(i).setEdad(Integer.parseInt(VentanaMamiferos.txtEdad.getText()));
					listaMamiferos.get(i).setPeso(Integer.parseInt(VentanaMamiferos.txtPeso.getText()));
					listaMamiferos.get(i).setNumeroDePatas(Integer.parseInt(VentanaMamiferos.txtPatas.getText()));
					listaMamiferos.get(i).setTamaño(VentanaMamiferos.txtTamaño.getText());
					listaMamiferos.get(i).setMedio(VentanaMamiferos.txtMedio.getText());
					listaMamiferos.get(i).setGenero(VentanaMamiferos.txtGenero.getText());
					listaMamiferos.get(i).setAlimentacion(VentanaMamiferos.txtAlimentacion.getText());
					listaMamiferos.get(i).setColor(VentanaMamiferos.txtColor.getText());
					listaMamiferos.get(i).setNumeroDeDientes(Integer.parseInt(VentanaMamiferos.txtNDientes.getText()));
					listaMamiferos.get(i).setPelo(true);
					listaMamiferos.get(i).setCantidadDePelo(VentanaMamiferos.txtCantPelo.getText());
					
				}
			} */
			final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
    	    final String user = "postgres";
    	    final String password = "17camarones";
    	    
    	    Connection conn = null;
    	    
    	    try {
    	    	conn = DriverManager.getConnection(url, user, password);
    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a modifica el animal");
    	    	Statement st = conn.createStatement();
    	    	try {
    	    		st.executeUpdate("UPDATE public.mamiferos" +
        	    			"SET nombre="+VentanaMamiferos.txtNombre.getText()+", edad='"+VentanaMamiferos.txtEdad.getText()+"', peso='"+VentanaMamiferos.txtPeso.getText()+"', patas='"+VentanaMamiferos.txtPatas.getText()+"', "
        	    					+ "\"tamaño\"='"+VentanaMamiferos.txtTamaño.getText()+"', medio='"+VentanaMamiferos.txtMedio.getText()+"', genero='"+VentanaMamiferos.txtGenero.getText()+"', alimientacion='"+VentanaMamiferos.txtAlimentacion.getText()+"', "
        	    							+ "color='"+VentanaMamiferos.txtColor.getText()+"', pelo='true', cantpelo='"+VentanaMamiferos.txtCantPelo.getText()+"', ndientes='"+VentanaMamiferos.txtNDientes.getText()+"' " +
        	    					"WHERE nombre='"+VentanaMamiferos.txtNombre.getText()+"';");
        	    	JOptionPane.showMessageDialog(null, "Se modofico el animal con exito");
				} catch (SQLException e2) {
					System.out.println(e2);
				}
    	    	conn.close();
    	    }
    	    catch(SQLException e1) {
    	    	System.out.println(e1.getMessage());
    	    	JOptionPane.showMessageDialog(null, "Error en la conexión");
    	    	}
			
		
		
		
		  
		mostrar();
			clearFields();
		}
	}
	
	
	public void mostrar() {
	/*	String matriz [][] = new String[listaMamiferos.size()][12];
		
		for (int i = 0; i < listaMamiferos.size(); i++) {
			
			matriz[i][0]=listaMamiferos.get(i).getNombre();
			matriz[i][1]=Integer.toString(listaMamiferos.get(i).getEdad());
			matriz[i][2]=Integer.toString(listaMamiferos.get(i).getPeso());
			matriz[i][3]=Integer.toString(listaMamiferos.get(i).getNumeroDePatas());
			matriz[i][4]=listaMamiferos.get(i).getTamaño();
			matriz[i][5]=listaMamiferos.get(i).getMedio();
			matriz[i][6]=listaMamiferos.get(i).getGenero();
			matriz[i][7]=listaMamiferos.get(i).getAlimentacion();
			matriz[i][8]=listaMamiferos.get(i).getColor();
			matriz[i][9]=Boolean.toString(listaMamiferos.get(i).isPelo()); //pelo
			matriz[i][10]=listaMamiferos.get(i).getCantidadDePelo(); 
			matriz[i][11]=Integer.toString(listaMamiferos.get(i).getNumeroDeDientes());
			} 												
		table.setModel(new DefaultTableModel(
				matriz,
				new String[] {
						"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes"
				}
			));
		
*/
		final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    final String user = "postgres";
	    final String password = "17camarones";
	    
	    Connection conn = null;
	    
	    try {
	    	conn = DriverManager.getConnection(url, user, password);
	    	
	    
	    }
	    catch(SQLException e1) {
	    	System.out.println(e1.getMessage());
	    	JOptionPane.showMessageDialog(null, "Error en la conexión");
	    	}
	    
	    DefaultTableModel model;
		String [] nColumnas = {"Nombre", "Edad", "Peso", "# Patas", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cantidad Pelo", "# Dientes"};
		model = new DefaultTableModel(null, nColumnas);
		
		String sentencia = "SELECT * FROM mamiferos";
		String [] filas = new String[12];
		Statement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sentencia);
			while(rs.next()) {
				for (int i = 0; i < 12; i++) {
					filas[i] = rs.getString(i+1);
				}
				model.addRow(filas);
			}
			table.setModel(model);
		} catch (Exception err) {
			System.out.println("No se pudo mostrar los datos");
			System.out.println(err);
		}
		}
		
	

	public void clearFields(){
		txtNombre.setText("String");
		txtEdad.setText("Int");
		txtPeso.setText("Int");
		txtPatas.setText("Int");
		txtTamaño.setText("String");
		txtMedio.setText("String");
		txtGenero.setText("String");
		txtAlimentacion.setText("String");
		txtColor.setText("String");
		txtPelo.setText("String");
		txtNDientes.setText("Int");
		txtCantPelo.setText("String");
		
	}
	
	
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Volver al menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			frmVentanaMamiferos.setDefaultCloseOperation(0);
			MenuPrincipal.main(null);
		}
	}
}