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

import com.zoo.animales.Aves;
import com.zoo.animales.Mamiferos;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;

public class VentanaAves {

	private JFrame frmVentanaAves;
	private final Action action = new SwingAction();
	
	static JTextField txtGarras;
	static JTextField txtNombre;
	static JTextField txtEdad;
	static JTextField txtPeso;
	static JTextField txtTama�o;
	static JTextField txtMedio;
	static JTextField txtGenero;
	static JTextField txtAlimentacion;
	static JTextField txtColor;
	static JTextField txtPelo;
	static JTextField txtNPlumas;
	static JTextField txtPico;
	private JTextField txtCPico;
	
	private JTable table;
	
	//Variables para borrar
		String edad = "";
		String peso = "";
		String numeroDePatas = "";
		String nombre = " ";
		String tama�o = "";
		String medio = "";
		String genero = "";
		String alimentacion = "";
		String color = "";
		String pelo = "";
		String numeroDePlumas = "";
		String colorDePico = "";
		String garras = "";
		
	
	
		//Aves del Zoo
		ArrayList<Aves> listaAves = new ArrayList<Aves>();
	/*	Aves aguila = new Aves(15, 5, "�guila", "mediano", "aereo", "macho",
				"carnivoro", "marron con blanco", false, 20000, "gris", true);
		Aves colibri = new Aves(2, 1, "Colibr�", "muy peque�o", "aereo", "hembra", 
				"herbivoro", "verde esmeralda", false, 100, "negro", true);
		Aves lechuza = new Aves(20, 2, "Lechuza", "mediano", "aereo", "macho",
				"carnivoro (micromamiferos)", "blanco", false, 11000, "blanco", true);*/
		
		
		private final Action action_1 = new SwingAction_2();
		private final Action action_2 = new SwingAction_6();
		private final Action action_3 = new SwingAction_7();
		private final Action action_4 = new SwingAction_8();
		private final Action action_5 = new SwingAction_9();
	
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAves window = new VentanaAves();
					window.frmVentanaAves.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaAves() {


		/*listaAves.add(aguila);
		listaAves.add(colibri);
		listaAves.add(lechuza);*/
		initialize();
		
		table.addMouseListener(new MouseAdapter() {

			DefaultTableModel model = new DefaultTableModel();
			
			public void mouseClicked(MouseEvent e) {

				int i = table.getSelectedRow();
				nombre = (table.getValueAt(i, 0).toString());
				edad = (table.getValueAt(i, 1).toString());
				peso = (table.getValueAt(i, 2).toString());
				tama�o = (table.getValueAt(i, 3).toString());
				medio = (table.getValueAt(i, 4).toString());
				genero = (table.getValueAt(i, 5).toString());
				alimentacion = (table.getValueAt(i, 6).toString());
				color = (table.getValueAt(i, 7).toString());
				pelo = (table.getValueAt(i, 8).toString());
				numeroDePlumas = (table.getValueAt(i, 9).toString());
				colorDePico = (table.getValueAt(i, 10).toString());
				garras = (table.getValueAt(i, 11).toString());
				
				txtNombre.setText(nombre);
				txtEdad.setText(edad);
				txtPeso.setText(peso);
				txtTama�o.setText(tama�o);
				txtMedio.setText(medio);
				txtGenero.setText(genero);
				txtAlimentacion.setText(alimentacion);
				txtColor.setText(color);
				txtPelo.setText(pelo);
				txtNPlumas.setText(numeroDePlumas);
				txtCPico.setText(colorDePico);
				txtGarras.setText(garras);
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaAves = new JFrame();
		frmVentanaAves.setTitle("Ventana Aves");
		frmVentanaAves.setBounds(100, 100, 465, 644);
		frmVentanaAves.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaAves.getContentPane().setLayout(new BoxLayout(frmVentanaAves.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaAves.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 428, 207);
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
				"Nombre", "Edad", "Peso", "Tama\u00F1o", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Plumas", "Color pico", "garras"
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
		scrollPane.setViewportView(table);
		
		JLabel Titulo = new JLabel("Aves");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(10, 11, 428, 14);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action_3);
		agregarOtro.setBounds(54, 539, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Color de pico: ");
		lblNewLabel_1_2_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2.setBounds(213, 463, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2);
		
		txtGarras = new JTextField();
		txtGarras.setForeground(Color.GRAY);
		txtGarras.setText("Boolean");
		txtGarras.setBounds(288, 491, 86, 20);
		panel.add(txtGarras);
		txtGarras.setColumns(10);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(42, 353, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(42, 378, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(117, 350, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setText("Int");
		txtEdad.setColumns(10);
		txtEdad.setBounds(117, 375, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(42, 407, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setText("Int");
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(117, 404, 86, 20);
		panel.add(txtPeso);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(42, 436, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(42, 465, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTama�o = new JTextField();
		txtTama�o.setDropMode(DropMode.INSERT);
		txtTama�o.setForeground(Color.GRAY);
		txtTama�o.setText("String");
		txtTama�o.setColumns(10);
		txtTama�o.setBounds(117, 433, 86, 20);
		panel.add(txtTama�o);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(117, 462, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(42, 496, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(213, 355, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(117, 493, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(288, 352, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(213, 382, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(213, 408, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(288, 379, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("Boolean");
		txtPelo.setColumns(10);
		txtPelo.setBounds(288, 405, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("N\u00B0 de PLumas: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(213, 437, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("Color de pico: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(-101, 1049, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtNPlumas = new JTextField();
		txtNPlumas.setDropMode(DropMode.INSERT);
		txtNPlumas.setForeground(Color.GRAY);
		txtNPlumas.setText("Int");
		txtNPlumas.setColumns(10);
		txtNPlumas.setBounds(288, 434, 86, 20);
		panel.add(txtNPlumas);
		
		txtPico = new JTextField();
		txtPico.setDropMode(DropMode.INSERT);
		txtPico.setForeground(Color.GRAY);
		txtPico.setText("String");
		txtPico.setColumns(10);
		txtPico.setBounds(-26, 1046, 86, 20);
		panel.add(txtPico);
		
		JButton btnNewButton = new JButton("Mostrar Aves");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(75, 264, 144, 23);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("New button");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(230, 264, 144, 23);
		panel.add(btnEliminar);
		
		JLabel lblAgregar = new JLabel("Agregar o modificar ave");
		lblAgregar.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAgregar.setBounds(10, 311, 428, 28);
		panel.add(lblAgregar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setAction(action_5);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(130, 573, 177, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_4);
		btnNewButton_2.setBounds(219, 539, 155, 23);
		panel.add(btnNewButton_2);
		
		txtCPico = new JTextField();
		txtCPico.setText("String");
		txtCPico.setForeground(Color.GRAY);
		txtCPico.setColumns(10);
		txtCPico.setBounds(288, 460, 86, 20);
		panel.add(txtCPico);
		
		JLabel lblNewLabel_1_2_4_1_2_6 = new JLabel("Garras: ");
		lblNewLabel_1_2_4_1_2_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_6.setBounds(213, 492, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_6);
		
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
			
			Aves av = new Aves(Integer.parseInt(VentanaAves.txtEdad.getText()), Integer.parseInt(VentanaAves.txtPeso.getText()), 
					 VentanaAves.txtNombre.getText(), VentanaAves.txtTama�o.getText(), VentanaAves.txtMedio.getText(), 
					VentanaAves.txtGenero.getText(), VentanaAves.txtAlimentacion.getText(), VentanaAves.txtColor.getText(), true,
					Integer.parseInt(VentanaAves.txtNPlumas.getText()), VentanaAves.txtPico.getText(), true);
			listaAves.add(av);
			

				
				//Datos
				String edad = VentanaAves.txtEdad.getText();
				String peso = VentanaAves.txtPeso.getText();
				String nombre = VentanaAves.txtNombre.getText();
				String patas = "2";
				String tama�o = VentanaAves.txtTama�o.getText();
				String medio =  VentanaAves.txtMedio.getText();
				String genero = VentanaAves.txtGenero.getText();
				String alimentacion = VentanaAves.txtAlimentacion.getText();
				String color = VentanaAves.txtColor.getText();
				String nplumas = VentanaAves.txtNPlumas.getText();
				String cpico = VentanaAves.txtPico.getText();
				String garras = VentanaAves.txtGarras.getText();
				String pelo = "true";

				
				final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    	    final String user = "postgres";
	    	    final String password = "17camarones";
	    	    
	    	    Connection conn = null;
	    	    
	    	    try {
	    	    	conn = DriverManager.getConnection(url, user, password);
	    	    	JOptionPane.showMessageDialog(null, "La conexi�n con la DB fue exitosa, se proceder� a agregar los datos del mamifero a la DB");
	    	    	Statement st = conn.createStatement();
	    	    	st.executeUpdate("INSERT INTO aves(nombre, edad, peso, patas, \"tama�o\", medio, genero, alimientacion, color, pelo, nplumas, cpico, garras)VALUES"
	    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tama�o+"','"+medio+"',"
	    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo+"', '"+nplumas+"','"+cpico+"', '"+garras+"'  )");
	    	    	JOptionPane.showMessageDialog(null, "Se agregaron los datos en la DB con �xito");
	    	    	conn.close();
	    	    }
	    	    catch(SQLException e1) {
	    	    	System.out.println(e1.getMessage());
	    	    	JOptionPane.showMessageDialog(null, "Error en la conexi�n");
	    	    	}
			
			
			  
			mostrar();
			
			
			
		}
		
		
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Aves");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			mostrar();
		}
	}
	
	
		
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Eliminar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i< listaAves.size(); i++) {
				if(nombre==listaAves.get(i).getNombre()) {
					listaAves.remove(i);
				}
			}
			//Actualizar (funcion mostrar)
			mostrar();
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Volver al menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.main(null);
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Modificar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	
	
	
	
	}
	
	
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Mostrar Aves");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
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
	    	JOptionPane.showMessageDialog(null, "Error en la conexi�n");
	    	}
	    
	    DefaultTableModel model;
		String [] nColumnas = {"Nombre", "Edad", "Peso", "# Patas", "Tama�o", "Medio", "Genero", "Alimentacion", "Color", "Pelo",  "# Plumas", "Color pico", "garras"};
		model = new DefaultTableModel(null, nColumnas);
		
		String sentencia = "SELECT * FROM aves";
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
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Eliminar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
    	    final String user = "postgres";
    	    final String password = "17camarones";
    	    
    	    Connection conn = null;
    	    
    	    try {
    	    	conn = DriverManager.getConnection(url, user, password);
    	    	JOptionPane.showMessageDialog(null, "La conexi�n con la DB fue exitosa, se proceder� a borrar el animal de la DB");
    	    	Statement st = conn.createStatement();
    	    	
    	    	for (int i = 0; i< listaAves.size(); i++) {
    	    		System.out.println(nombre);
    				//if(nombre==listaMamiferos.get(i).getNombre()) {
    					try {
    						st.executeUpdate("DELETE FROM public.aves\n"
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
    	    	JOptionPane.showMessageDialog(null, "Error en la conexi�n");
    	    	}
			
    	    
			
			//Actualizar (funcion mostrar)
			mostrar();
			clearFields();
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Agregar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {

			Aves av = new Aves(Integer.parseInt(VentanaAves.txtEdad.getText()), Integer.parseInt(VentanaAves.txtPeso.getText()), 
					 VentanaAves.txtNombre.getText(), VentanaAves.txtTama�o.getText(), VentanaAves.txtMedio.getText(), 
					VentanaAves.txtGenero.getText(), VentanaAves.txtAlimentacion.getText(), VentanaAves.txtColor.getText(), true,
					Integer.parseInt(VentanaAves.txtNPlumas.getText()), VentanaAves.txtPico.getText(), true);
			listaAves.add(av);
			

				
				//Datos
				String edad = VentanaAves.txtEdad.getText();
				String peso = VentanaAves.txtPeso.getText();
				String nombre = VentanaAves.txtNombre.getText();
				String patas = "2";
				String tama�o = VentanaAves.txtTama�o.getText();
				String medio =  VentanaAves.txtMedio.getText();
				String genero = VentanaAves.txtGenero.getText();
				String alimentacion = VentanaAves.txtAlimentacion.getText();
				String color = VentanaAves.txtColor.getText();
				String nplumas = VentanaAves.txtNPlumas.getText();
				String cpico = VentanaAves.txtPico.getText();
				String garras = VentanaAves.txtGarras.getText();
				String pelo = "true";

				
				final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    	    final String user = "postgres";
	    	    final String password = "17camarones";
	    	    
	    	    Connection conn = null;
	    	    
	    	    try {
	    	    	conn = DriverManager.getConnection(url, user, password);
	    	    	JOptionPane.showMessageDialog(null, "La conexi�n con la DB fue exitosa, se proceder� a agregar los datos del mamifero a la DB");
	    	    	Statement st = conn.createStatement();
	    	    	st.executeUpdate("INSERT INTO aves(nombre, edad, peso, patas, \"tama�o\", medio, genero, alimientacion, color, pelo, nplumas, cpico, garras)VALUES"
	    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tama�o+"','"+medio+"',"
	    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo+"', '"+nplumas+"','"+cpico+"', '"+garras+"'  )");
	    	    	JOptionPane.showMessageDialog(null, "Se agregaron los datos en la DB con �xito");
	    	    	conn.close();
	    	    }
	    	    catch(SQLException e1) {
	    	    	System.out.println(e1.getMessage());
	    	    	JOptionPane.showMessageDialog(null, "Error en la conexi�n");
	    	    	}
			
			
			  
			mostrar();
		}
	}
	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "Modificar ave");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			//Modificar elemento del arraylist
			
			for (int i = 0; i< listaAves.size(); i++) {
				if(nombre==listaAves.get(i).getNombre()) {
					listaAves.get(i).setNombre(VentanaAves.txtNombre.getText());
					listaAves.get(i).setEdad(Integer.parseInt(VentanaAves.txtEdad.getText()));
					listaAves.get(i).setPeso(Integer.parseInt(VentanaAves.txtPeso.getText()));
					listaAves.get(i).setTama�o(VentanaAves.txtTama�o.getText());
					listaAves.get(i).setMedio(VentanaAves.txtMedio.getText());
					listaAves.get(i).setGenero(VentanaAves.txtGenero.getText());
					listaAves.get(i).setAlimentacion(VentanaAves.txtAlimentacion.getText());
					listaAves.get(i).setColor(VentanaAves.txtColor.getText());
					listaAves.get(i).setPelo(Boolean.parseBoolean(VentanaAves.txtPelo.getText()));
					listaAves.get(i).setNumeroDePlumas(Integer.parseInt(VentanaAves.txtNPlumas.getText()));
					listaAves.get(i).setColorDePico(VentanaAves.txtPico.getText());
					listaAves.get(i).setGarras(Boolean.parseBoolean(VentanaAves.txtGarras.getText()));									
				}
			}
			
			mostrar();
			clearFields();
		}
	}
	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.main(null);
		}
	}
	
	public void clearFields(){
		txtNombre.setText("String");
		txtEdad.setText("Int");
		txtPeso.setText("Int");
		txtTama�o.setText("String");
		txtMedio.setText("String");
		txtGenero.setText("String");
		txtAlimentacion.setText("String");
		txtColor.setText("String");
		txtPelo.setText("Boolean");
		txtCPico.setText("Int");
		txtNPlumas.setText("Int");
		txtGarras.setText("Boolean");
		
	}
	}


