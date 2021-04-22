package com.zoo.vistas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
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
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.zoo.animales.Mamiferos;
import com.zoo.animales.Reptiles;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class VentanaReptiles {

	private JFrame frmVentanaReptiles;
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
	static JTextField txtCaparazon;
	static JTextField txtExtremidades;

	private JTextField txtDientes;
	private static JTextField txtNDientes;

	private JTable table;
	private final Action action_1 = new SwingAction_1();
	
	//Variables para borrar
			String edad = "";
			String peso = "";
			String numeroDePatas = "";
			String nombre = " ";
			String tamaño = "";
			String medio = "";
			String genero = "";
			String alimentacion = "";
			String color = "";
			String pelo = "";
			String caparazon = " ";
			String extremidades = " ";
			String dientes = " ";
			String numeroDeDientes = " ";
	
	
			//Reptiles del Zoo
			ArrayList<Reptiles> listaReptiles = new ArrayList<Reptiles>();
			Reptiles tortuga = new Reptiles(20, 290, 4, "Tortuga", "Muy grande", "acuatico", "hembra",
					"omnivoro", "verde orcuro", false, true, true, false, 0);
			Reptiles serpiente = new Reptiles(5, 12, 0, "Serpiente", "grande (largo)", "terrestre", "macho", 
					"carnivoro", "marron claro", false, false, false, true, 2);
			Reptiles cocodrilo = new Reptiles(58, 450, 4, "Cocodrilo americano", "Muy grande", "terrestre", "macho", 
					"carnivoro", "Verde oscuro", false, false, true, true, 80);
			
			
			private final Action action_2 = new SwingAction_2();
			private final Action action_3 = new SwingAction_3();
			private final Action action_4 = new SwingAction_4();
			
			
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReptiles window = new VentanaReptiles();
					window.frmVentanaReptiles.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaReptiles() {
		listaReptiles.add(tortuga);
		 listaReptiles.add(serpiente);
		 listaReptiles.add(cocodrilo);
		initialize();
		
		table.addMouseListener(new MouseAdapter() {
			DefaultTableModel model = new DefaultTableModel();
			
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				nombre = (table.getValueAt(i, 0).toString());
				edad = (table.getValueAt(i, 1).toString());
				peso = (table.getValueAt(i, 2).toString());
				tamaño = (table.getValueAt(i, 3).toString());
				medio = (table.getValueAt(i, 4).toString());
				genero = (table.getValueAt(i, 5).toString());
				alimentacion = (table.getValueAt(i, 6).toString());
				color = (table.getValueAt(i, 7).toString());
				pelo = (table.getValueAt(i, 8).toString());
				caparazon = (table.getValueAt(i, 9).toString());
				extremidades = (table.getValueAt(i, 10).toString());
				dientes = (table.getValueAt(i, 11).toString());
				numeroDeDientes = (table.getValueAt(i, 12).toString());
				
				
				txtNombre.setText(nombre);
				txtEdad.setText(edad);
				txtPeso.setText(peso);
				txtTamaño.setText(tamaño);
				txtMedio.setText(medio);
				txtGenero.setText(genero);
				txtAlimentacion.setText(alimentacion);
				txtColor.setText(color);
				txtPelo.setText(pelo);
				txtCaparazon.setText(caparazon);
				txtExtremidades.setText(extremidades);
				txtDientes.setText(dientes);
				txtNDientes.setText(numeroDeDientes);
				
				
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaReptiles = new JFrame();
		frmVentanaReptiles.setTitle("Ventana Reptiles");
		frmVentanaReptiles.setBounds(100, 100, 407, 623);
		frmVentanaReptiles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaReptiles.getContentPane().setLayout(new BoxLayout(frmVentanaReptiles.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaReptiles.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 33, 340, 203);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"Nombre", "Edad", "Peso", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Caparazon", "Extremidades", "Dientes", "# Dientes"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(81);
		table.getColumnModel().getColumn(0).setMinWidth(81);
		scrollPane.setViewportView(table);
		
		JLabel Titulo = new JLabel("Reptiles");
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(146, 0, 86, 30);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton(" Agregar -anfibio");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(26, 515, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(20, 328, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(20, 353, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(95, 325, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setText("Int");
		txtEdad.setColumns(10);
		txtEdad.setBounds(95, 350, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(20, 380, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1_2 = new JLabel("N\u00B0de Patas: ");
		lblNewLabel_1_2_4_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_2.setBounds(21, 408, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setText("Int");
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(95, 377, 86, 20);
		panel.add(txtPeso);
		
		txtPatas = new JTextField();
		txtPatas.setDropMode(DropMode.INSERT);
		txtPatas.setText("Int");
		txtPatas.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPatas.setForeground(Color.GRAY);
		txtPatas.setColumns(10);
		txtPatas.setBounds(95, 402, 86, 20);
		panel.add(txtPatas);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(20, 429, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(20, 454, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(95, 426, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(95, 451, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(20, 477, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(201, 324, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(95, 474, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(276, 321, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(201, 347, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(201, 372, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(276, 344, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("boolean");
		txtPelo.setColumns(10);
		txtPelo.setBounds(276, 369, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("Caparazon: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(201, 395, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("Extremidades: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(191, 420, 84, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtCaparazon = new JTextField();
		txtCaparazon.setDropMode(DropMode.INSERT);
		txtCaparazon.setForeground(Color.GRAY);
		txtCaparazon.setText("boolean");
		txtCaparazon.setColumns(10);
		txtCaparazon.setBounds(276, 392, 86, 20);
		panel.add(txtCaparazon);
		
		txtExtremidades = new JTextField();
		txtExtremidades.setDropMode(DropMode.INSERT);
		txtExtremidades.setForeground(Color.GRAY);
		txtExtremidades.setText("boolean");
		txtExtremidades.setColumns(10);
		txtExtremidades.setBounds(276, 417, 86, 20);
		panel.add(txtExtremidades);
		
		JButton btnNewButton = new JButton("Mostrar Peces");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(47, 259, 144, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5_1 = new JLabel("Dientes: ");
		lblNewLabel_1_2_4_1_1_1_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5_1.setBounds(201, 452, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5_1);
		
		txtDientes = new JTextField();
		txtDientes.setText("boolean");
		txtDientes.setForeground(Color.GRAY);
		txtDientes.setDropMode(DropMode.INSERT);
		txtDientes.setColumns(10);
		txtDientes.setBounds(276, 449, 86, 20);
		panel.add(txtDientes);
		
		JLabel lblNewLabel_1_2_4_1_2_7_1 = new JLabel("N\u00B0 de Dientes: ");
		lblNewLabel_1_2_4_1_2_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7_1.setBounds(201, 475, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7_1);
		
		txtNDientes = new JTextField();
		txtNDientes.setText("Int");
		txtNDientes.setForeground(Color.GRAY);
		txtNDientes.setDropMode(DropMode.INSERT);
		txtNDientes.setColumns(10);
		txtNDientes.setBounds(276, 472, 86, 20);
		panel.add(txtNDientes);
		
		JButton btnEliminar = new JButton("Eliminar Reptil");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(201, 259, 144, 23);
		panel.add(btnEliminar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setAction(action_3);
		btnNewButton_1.setBounds(190, 515, 155, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_4);
		btnNewButton_2.setBounds(93, 549, 192, 23);
		panel.add(btnNewButton_2);
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar Reptil");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Reptiles rp = new Reptiles(Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtPeso.getText()), 
					Integer.parseInt(txtPatas.getText()), txtNombre.getText(), txtTamaño.getText(), txtMedio.getText(), 
					txtGenero.getText(), txtAlimentacion.getText(), txtColor.getText(), false, false, true, true,
					Integer.parseInt(txtNDientes.getText()));
			listaReptiles.add(rp);

				
				//Datos
				String edad = VentanaReptiles.txtEdad.getText();
				String peso = VentanaReptiles.txtPeso.getText();
				String patas = VentanaReptiles.txtPatas.getText();
				String nombre = VentanaReptiles.txtNombre.getText();
				String tamaño = VentanaReptiles.txtTamaño.getText();
				String medio =  VentanaReptiles.txtMedio.getText();
				String genero = VentanaReptiles.txtGenero.getText();
				String alimentacion = VentanaReptiles.txtAlimentacion.getText();
				String color = VentanaReptiles.txtColor.getText();
				String pelo1 = "false";String pelo2 = "false";String pelo3 = "true";String pelo4 = "true";
				String ndientes = VentanaReptiles.txtNDientes.getText();
				
				
				

				
				final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    	    final String user = "postgres";
	    	    final String password = "17camarones";
	    	    
	    	    Connection conn = null;
	    	    
	    	    try {
	    	    	conn = DriverManager.getConnection(url, user, password);
	    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a agregar los datos del mamifero a la DB");
	    	    	Statement st = conn.createStatement();
	    	    	st.executeUpdate("INSERT INTO reptiles(nombre, edad, peso, patas, \"tamaño\", medio, genero, alimientacion, color, pelo, caparazon, extremidades, dientes, ndientes)VALUES"
	    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tamaño+"','"+medio+"',"
	    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo1+"', '"+pelo2+"', '"+pelo3+"', '"+pelo4+"','"+ndientes+"')");
	    	    	JOptionPane.showMessageDialog(null, "Se agregaron los datos en la DB con éxito");
	    	    	conn.close();
	    	    }
	    	    catch(SQLException e1) {
	    	    	System.out.println(e1.getMessage());
	    	    	JOptionPane.showMessageDialog(null, "Error en la conexión");
	    	    	}
				
		
			
			  
			mostrar();
			
		}
		
	}
		
		public void mostrar() {
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
			String [] nColumnas = {"Nombre", "Edad", "Peso", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Caparazon", "Extremidades", "Dientes", "# Dientes"};
			model = new DefaultTableModel(null, nColumnas);
			
			String sentencia = "SELECT * FROM reptiles";
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
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Reptiles");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
String matriz [][] = new String[14][listaReptiles.size()];
			mostrar();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Eliminar Reptil");
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
    	    	
    	    	for (int i = 0; i< listaReptiles.size(); i++) {
    	    		System.out.println(nombre);
    				
    					try {
    						st.executeUpdate("DELETE FROM public.reptiles\n"
        	    	    			+ "	WHERE nombre='"+nombre+"'");
        					JOptionPane.showMessageDialog(null, "Se borro el animal");
						} catch (SQLException e2) {
							System.out.println(e2);
						}
    				
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
			putValue(NAME, "Modificar Reptiles");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i< listaReptiles.size(); i++) {
				if(nombre==listaReptiles.get(i).getNombre()) {
					listaReptiles.get(i).setNombre(VentanaReptiles.txtNombre.getText());
					listaReptiles.get(i).setEdad(Integer.parseInt(VentanaReptiles.txtEdad.getText()));
					listaReptiles.get(i).setPeso(Integer.parseInt(VentanaReptiles.txtPeso.getText()));
					listaReptiles.get(i).setTamaño(VentanaReptiles.txtTamaño.getText());
					listaReptiles.get(i).setMedio(VentanaReptiles.txtMedio.getText());
					listaReptiles.get(i).setGenero(VentanaReptiles.txtGenero.getText());
					listaReptiles.get(i).setAlimentacion(VentanaReptiles.txtAlimentacion.getText());
					listaReptiles.get(i).setColor(VentanaReptiles.txtColor.getText());
					listaReptiles.get(i).setPelo(Boolean.parseBoolean(txtPelo.getText()));
					listaReptiles.get(i).setCaparazon(Boolean.parseBoolean(txtCaparazon.getText()));
					listaReptiles.get(i).setExtremidades(Boolean.parseBoolean(txtExtremidades.getText()));
					listaReptiles.get(i).setDientes(Boolean.parseBoolean(txtDientes.getText()));
					listaReptiles.get(i).setNumeroDeDientes(Integer.parseInt(txtNDientes.getText()));
					
				}
			}
			
			mostrar();
			clearFields();
		}
	}
	
	
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.main(null);
		}
	}

	public void clearFields() {
		txtNombre.setText("String");
		txtEdad.setText("Int");
		txtPeso.setText("Int");
		txtTamaño.setText("String");
		txtMedio.setText("String");
		txtGenero.setText("String");
		txtAlimentacion.setText("String");
		txtColor.setText("String");
		txtPelo.setText("Boolean");
		txtCaparazon.setText("Boolean");
		txtExtremidades.setText("Boolean");
		txtDientes.setText("Boolean");
		txtNDientes.setText("Int");
		
	}
}
