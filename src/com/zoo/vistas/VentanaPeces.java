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
import com.zoo.animales.Peces;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.ActionListener;

public class VentanaPeces {

	private JFrame frmVentanaPeces;
	private final Action action = new SwingAction(); 
	static JTextField txtCartilaginoso;
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
	static JTextField txtAletas;
	static JTextField txtBranquias;
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
		String numeroDeAletas = "";
		String numeroDeBranquias = "";
		String cartilaginoso = "";
		String oseo = "";
		String escamas = "";
		
	
	
		//Peces del Zoo
		ArrayList<Peces> listaPeces = new ArrayList<Peces>();
		/*Peces tiburon = new Peces(25, 1005, "Tiburon", "Grande", "acuatico", "hembra", "carnivoro", 
				"gris con blanco", false, 8, 5, true, false, true);
		Peces espada = new Peces(6, 120, "Pez espada", "Grande", "acuatico", "macho", 
				"carnivoro", "gris oscuro", false, 5, 4, true, false, true);
		Peces anguila = new Peces(9, 3, "Anguila", "pequeño", "acuatico", "macho", "carnivoro", 
				"marron rojizo", false, 1, 0, true, false, true);*/
		private JTextField txtEscamas;
		private JTextField txtOseo;
		private final Action action_2 = new SwingAction_3();
		private final Action action_3 = new SwingAction_4();
		private final Action action_4 = new SwingAction_5();
			
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPeces window = new VentanaPeces();
					window.frmVentanaPeces.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPeces() {
		/*listaPeces.add(tiburon);
		 listaPeces.add(espada);
		 listaPeces.add(anguila);*/
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
				numeroDeAletas = (table.getValueAt(i, 9).toString());
				numeroDeBranquias = (table.getValueAt(i, 10).toString());
				cartilaginoso = (table.getValueAt(i, 11).toString());
				oseo = (table.getValueAt(i, 12).toString());
				escamas = (table.getValueAt(i, 13).toString());
				
				
				txtNombre.setText(nombre);
				txtEdad.setText(edad);
				txtPeso.setText(peso);
				txtTamaño.setText(tamaño);
				txtMedio.setText(medio);
				txtGenero.setText(genero);
				txtAlimentacion.setText(alimentacion);
				txtColor.setText(color);
				txtPelo.setText(pelo);
				txtAletas.setText(numeroDeAletas);
				txtBranquias.setText(numeroDeBranquias);
				txtCartilaginoso.setText(cartilaginoso);
				txtOseo.setText(oseo);
				txtEscamas.setText(escamas);
				
				
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaPeces = new JFrame();
		frmVentanaPeces.setTitle("Ventana Peces");
		frmVentanaPeces.setBounds(100, 100, 457, 655);
		frmVentanaPeces.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaPeces.getContentPane().setLayout(new BoxLayout(frmVentanaPeces.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaPeces.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 35, 422, 195);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
					"Nombre", "Edad", "Peso", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"
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
		
		JLabel Titulo = new JLabel("Agregar o modificar pez");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(10, 281, 422, 31);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton("Agregar");
		agregarOtro.setAction(action);
		agregarOtro.setBounds(51, 541, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2 = new JLabel("Cartilaginoso: ");
		lblNewLabel_1_2_4_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2.setBounds(212, 446, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2);
		
		txtCartilaginoso = new JTextField();
		txtCartilaginoso.setForeground(Color.GRAY);
		txtCartilaginoso.setText("Boolean");
		txtCartilaginoso.setBounds(287, 443, 86, 20);
		panel.add(txtCartilaginoso);
		txtCartilaginoso.setColumns(10);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(31, 323, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(31, 348, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(106, 320, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setText("Int");
		txtEdad.setColumns(10);
		txtEdad.setBounds(106, 345, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(31, 375, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		JLabel lblNewLabel_1_2_4_1_1_1_2 = new JLabel("N\u00B0de Patas: ");
		lblNewLabel_1_2_4_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_2.setBounds(32, 403, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setText("Int");
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(106, 372, 86, 20);
		panel.add(txtPeso);
		
		txtPatas = new JTextField();
		txtPatas.setDropMode(DropMode.INSERT);
		txtPatas.setText("Int");
		txtPatas.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPatas.setForeground(Color.GRAY);
		txtPatas.setColumns(10);
		txtPatas.setBounds(106, 397, 86, 20);
		panel.add(txtPatas);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(31, 424, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(31, 449, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(106, 421, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(106, 446, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(31, 472, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(212, 323, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(106, 469, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(287, 320, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(212, 346, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(212, 371, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(287, 343, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("Boolean");
		txtPelo.setColumns(10);
		txtPelo.setBounds(287, 368, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("N\u00B0 de Aletas: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(212, 394, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("N\u00B0 de Branquias: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(202, 419, 84, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtAletas = new JTextField();
		txtAletas.setDropMode(DropMode.INSERT);
		txtAletas.setForeground(Color.GRAY);
		txtAletas.setText("Int");
		txtAletas.setColumns(10);
		txtAletas.setBounds(287, 391, 86, 20);
		panel.add(txtAletas);
		
		txtBranquias = new JTextField();
		txtBranquias.setDropMode(DropMode.INSERT);
		txtBranquias.setForeground(Color.GRAY);
		txtBranquias.setText("Int");
		txtBranquias.setColumns(10);
		txtBranquias.setBounds(287, 416, 86, 20);
		panel.add(txtBranquias);
		
		JButton btnNewButton = new JButton("Mostrar Peces");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(70, 247, 144, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5_1 = new JLabel("Oseo: ");
		lblNewLabel_1_2_4_1_1_1_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5_1.setBounds(212, 474, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5_1);
	
		
		JLabel lblNewLabel_1_2_4_1_2_7_1 = new JLabel("Escamas: ");
		lblNewLabel_1_2_4_1_2_7_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7_1.setBounds(212, 497, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7_1);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(229, 247, 144, 23);
		panel.add(btnEliminar);
		
		txtEscamas = new JTextField();
		txtEscamas.setText("Boolean");
		txtEscamas.setForeground(Color.GRAY);
		txtEscamas.setColumns(10);
		txtEscamas.setBounds(287, 499, 86, 20);
		panel.add(txtEscamas);
		
		txtOseo = new JTextField();
		txtOseo.setText("Boolean");
		txtOseo.setForeground(Color.GRAY);
		txtOseo.setDropMode(DropMode.INSERT);
		txtOseo.setColumns(10);
		txtOseo.setBounds(287, 472, 86, 20);
		panel.add(txtOseo);
		
		JLabel Titulo_1 = new JLabel("Peces");
		Titulo_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo_1.setBounds(202, 10, 49, 14);
		panel.add(Titulo_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setAction(action_4);
		btnNewButton_1.setBounds(131, 585, 155, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(216, 541, 155, 23);
		panel.add(btnNewButton_2);
		}
		
	

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar pez");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Peces pe = new Peces(Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtPeso.getText()), 
					txtNombre.getText(), txtTamaño.getText(), txtMedio.getText(), 
					txtGenero.getText(), txtAlimentacion.getText(), txtColor.getText(), true,
					Integer.parseInt(txtAletas.getText()), Integer.parseInt(txtBranquias.getText()), true, true, true);
			listaPeces.add(pe);
			
			//Datos
			String edad = VentanaPeces.txtEdad.getText();
			String peso = VentanaPeces.txtPeso.getText();
			String patas = VentanaPeces.txtPatas.getText();
			String nombre = VentanaPeces.txtNombre.getText();
			String tamaño = VentanaPeces.txtTamaño.getText();
			String medio =  VentanaPeces.txtMedio.getText();
			String genero = VentanaPeces.txtGenero.getText();
			String alimentacion = VentanaPeces.txtAlimentacion.getText();
			String color = VentanaPeces.txtColor.getText();
			String pelo = "true";
			String aletas = VentanaPeces.txtAletas.getText();
			String branquias = VentanaPeces.txtBranquias.getText();
			String cartilaginoso = "true";
			String oseo = "false";
			String escamas = "true";
			

		
			
			final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
    	    final String user = "postgres";
    	    final String password = "17camarones";
    	    
    	    Connection conn = null;
    	    
    	    try {
    	    	conn = DriverManager.getConnection(url, user, password);
    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a agregar los datos del mamifero a la DB");
    	    	Statement st = conn.createStatement();
    	    	st.executeUpdate("INSERT INTO peces(nombre, edad, peso, patas, \"tamaño\", medio, genero, alimientacion, color, pelo, naletas, nbranquias, cartilaginoso, oseo, escamas)VALUES"
    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tamaño+"','"+medio+"',"
    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo+"', '"+aletas+"','"+branquias+"','"+cartilaginoso+"','"+oseo+"','"+escamas+"'  )");
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
	
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mostrar Peces");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			mostrar();
		}
	}
	
	
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "ELiminar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i< listaPeces.size(); i++) {
				if(nombre==listaPeces.get(i).getNombre()) {
					listaPeces.remove(i);
				}
			}
			//Actualizar (funcion mostrar)
			mostrar();
		}
		}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
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
    	    	
    	    	for (int i = 0; i< listaPeces.size(); i++) {
    	    		System.out.println(nombre);
    				//if(nombre==listaMamiferos.get(i).getNombre()) {
    					try {
    						st.executeUpdate("DELETE FROM public.peces\n"
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
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Modificar pez");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i< listaPeces.size(); i++) {
				if(nombre==listaPeces.get(i).getNombre()) {
					listaPeces.get(i).setNombre(VentanaPeces.txtNombre.getText());
					listaPeces.get(i).setEdad(Integer.parseInt(VentanaPeces.txtEdad.getText()));
					listaPeces.get(i).setPeso(Integer.parseInt(VentanaPeces.txtPeso.getText()));
					listaPeces.get(i).setTamaño(VentanaPeces.txtTamaño.getText());
					listaPeces.get(i).setMedio(VentanaPeces.txtMedio.getText());
					listaPeces.get(i).setGenero(VentanaPeces.txtGenero.getText());
					listaPeces.get(i).setAlimentacion(VentanaPeces.txtAlimentacion.getText());
					listaPeces.get(i).setColor(VentanaPeces.txtColor.getText());
					listaPeces.get(i).setPelo(Boolean.parseBoolean(VentanaPeces.txtPelo.getText()));
					listaPeces.get(i).setNumeroDeAletas(Integer.parseInt(VentanaPeces.txtAletas.getText()));
					listaPeces.get(i).setNumeroDeBranquias(Integer.parseInt(VentanaPeces.txtBranquias.getText()));
					listaPeces.get(i).setCartilaginoso(Boolean.parseBoolean(VentanaPeces.txtCartilaginoso.getText()));
					listaPeces.get(i).setOseo(Boolean.parseBoolean(txtOseo.getText()));
					listaPeces.get(i).setEscamas(Boolean.parseBoolean(txtEscamas.getText()));							
				}
			}
			
			mostrar();
			clearFields();
		}
	}
	
	
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.main(null);
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
		String [] nColumnas = {"Nombre", "Edad", "Peso", "Tamaño", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "# Aletas", "# Branquias", "Cartilaginoso", "Oseo", "Escamas"};
		model = new DefaultTableModel(null, nColumnas);
		
		String sentencia = "SELECT * FROM peces";
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
		txtAletas.setText("Int");
		txtBranquias.setText("Int");
		txtCartilaginoso.setText("Boolean");
		txtOseo.setText("Boolean");
		txtEscamas.setText("Boolean");
	}
	}


