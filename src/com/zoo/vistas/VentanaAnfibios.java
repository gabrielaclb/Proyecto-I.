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

import com.zoo.animales.Anfibios;
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

public class VentanaAnfibios {

	private JFrame frmVentanaAnfibios;
	private final Action action = new SwingAction(); 
	static JTextField txtNombre;
	static JTextField txtEdad;
	static JTextField txtPeso;
	static JTextField txtTamaño;
	static JTextField txtMedio;
	static JTextField txtGenero;
	static JTextField txtAlimentacion;
	static JTextField txtColor;
	static JTextField txtPelo;
	static JTextField txtCola;
	static JTextField txtRespiracion;
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
		String cola = "";
		String tipoDeRespiracion = "";
		
	
	
		//Anfibios del Zoo
		ArrayList<Anfibios> listaAnfibios = new ArrayList<Anfibios>();
		Anfibios sapo = new Anfibios(3, 10, "Sapo", "muy pequeño", "acuatico y terrestre", 
				"macho", "insectivoro", "verde oscuro", 
				false, false, "cutanea y pulmonar");
		Anfibios salamandra = new Anfibios(15, 28, "Salamandra", "muy pequeña", "acuatico y terrestre", 
				"macho", "crustaceos y gusanos", "negro con amarillo", 
				false, true, "branquial");
		Anfibios triton = new Anfibios(12, 61, "Triton", "muy pequeño", "acuatico y terrestre", 
				"macho", "insectivoro", "marron", 
				false, true, "cutanea");
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
					VentanaAnfibios window = new VentanaAnfibios();
					window.frmVentanaAnfibios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaAnfibios() {
		 listaAnfibios.add(sapo);		
		 listaAnfibios.add(salamandra);
		 listaAnfibios.add(triton);
		 
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
				cola = (table.getValueAt(i,9).toString());
				tipoDeRespiracion = (table.getValueAt(i, 10).toString());
				
				txtNombre.setText(nombre);
				txtEdad.setText(edad);
				txtPeso.setText(peso);
				txtTamaño.setText(tamaño);
				txtMedio.setText(medio);
				txtGenero.setText(genero);
				txtAlimentacion.setText(alimentacion);
				txtColor.setText(color);
				txtPelo.setText(pelo);
				txtCola.setText(cola);
				txtRespiracion.setText(tipoDeRespiracion);
				
			}	
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmVentanaAnfibios = new JFrame();
		frmVentanaAnfibios.setTitle("Ventana Anfibios");
		frmVentanaAnfibios.setBounds(100, 100, 468, 656);
		frmVentanaAnfibios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentanaAnfibios.getContentPane().setLayout(new BoxLayout(frmVentanaAnfibios.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmVentanaAnfibios.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 35, 412, 227);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Edad", "Peso", "Tama\u00F1o", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cola", "Respiracion"
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
		
		JLabel Titulo = new JLabel("Agregar o modificar anfibio");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo.setBounds(10, 330, 432, 23);
		panel.add(Titulo);
		
		JButton agregarOtro = new JButton(" Agregar -anfibio");
		agregarOtro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		agregarOtro.setAction(action);
		agregarOtro.setBounds(65, 551, 155, 23);
		panel.add(agregarOtro);
		
		JLabel lblNewLabel_1_2_4_1_2_1 = new JLabel("Nombre: ");
		lblNewLabel_1_2_4_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_1.setBounds(48, 367, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_1);
		
		JLabel lblNewLabel_1_2_4_1_1_1_1 = new JLabel("Edad: ");
		lblNewLabel_1_2_4_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_1.setBounds(48, 392, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_1);
		
		txtNombre = new JTextField();
		txtNombre.setDropMode(DropMode.INSERT);
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNombre.setText("String");
		txtNombre.setColumns(10);
		txtNombre.setBounds(123, 364, 86, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setDropMode(DropMode.INSERT);
		txtEdad.setForeground(Color.GRAY);
		txtEdad.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEdad.setText("Int");
		txtEdad.setColumns(10);
		txtEdad.setBounds(123, 389, 86, 20);
		panel.add(txtEdad);
		
		JLabel lblNewLabel_1_2_4_1_2_2 = new JLabel("Peso: ");
		lblNewLabel_1_2_4_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_2.setBounds(48, 419, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_2);
		
		txtPeso = new JTextField();
		txtPeso.setDropMode(DropMode.INSERT);
		txtPeso.setText("Int");
		txtPeso.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPeso.setForeground(Color.GRAY);
		txtPeso.setColumns(10);
		txtPeso.setBounds(123, 416, 86, 20);
		panel.add(txtPeso);
		
		JLabel lblNewLabel_1_2_4_1_2_3 = new JLabel("Tama\u00F1o: ");
		lblNewLabel_1_2_4_1_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_3.setBounds(48, 448, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_3);
		
		JLabel lblNewLabel_1_2_4_1_1_1_3 = new JLabel("Medio: ");
		lblNewLabel_1_2_4_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_3.setBounds(48, 477, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_3);
		
		txtTamaño = new JTextField();
		txtTamaño.setDropMode(DropMode.INSERT);
		txtTamaño.setForeground(Color.GRAY);
		txtTamaño.setText("String");
		txtTamaño.setColumns(10);
		txtTamaño.setBounds(123, 445, 86, 20);
		panel.add(txtTamaño);
		
		txtMedio = new JTextField();
		txtMedio.setDropMode(DropMode.INSERT);
		txtMedio.setForeground(Color.GRAY);
		txtMedio.setText("String");
		txtMedio.setColumns(10);
		txtMedio.setBounds(123, 474, 86, 20);
		panel.add(txtMedio);
		
		JLabel lblNewLabel_1_2_4_1_2_4 = new JLabel("Genero: ");
		lblNewLabel_1_2_4_1_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_4.setBounds(48, 500, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_4);
		
		JLabel lblNewLabel_1_2_4_1_1_1_4 = new JLabel("Alimentacion: ");
		lblNewLabel_1_2_4_1_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_4.setBounds(229, 368, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_4);
		
		txtGenero = new JTextField();
		txtGenero.setDropMode(DropMode.INSERT);
		txtGenero.setForeground(Color.GRAY);
		txtGenero.setText("String");
		txtGenero.setColumns(10);
		txtGenero.setBounds(123, 497, 86, 20);
		panel.add(txtGenero);
		
		txtAlimentacion = new JTextField();
		txtAlimentacion.setDropMode(DropMode.INSERT);
		txtAlimentacion.setForeground(Color.GRAY);
		txtAlimentacion.setText("String");
		txtAlimentacion.setColumns(10);
		txtAlimentacion.setBounds(304, 365, 86, 20);
		panel.add(txtAlimentacion);
		
		JLabel lblNewLabel_1_2_4_1_2_5 = new JLabel("Color: ");
		lblNewLabel_1_2_4_1_2_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_5.setBounds(229, 391, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_5);
		
		JLabel lblNewLabel_1_2_4_1_1_1_5 = new JLabel("Pelo: ");
		lblNewLabel_1_2_4_1_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_5.setBounds(229, 416, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_5);
		
		txtColor = new JTextField();
		txtColor.setDropMode(DropMode.INSERT);
		txtColor.setForeground(Color.GRAY);
		txtColor.setText("String");
		txtColor.setColumns(10);
		txtColor.setBounds(304, 388, 86, 20);
		panel.add(txtColor);
		
		txtPelo = new JTextField();
		txtPelo.setDropMode(DropMode.INSERT);
		txtPelo.setForeground(Color.GRAY);
		txtPelo.setText("Boolean");
		txtPelo.setColumns(10);
		txtPelo.setBounds(304, 413, 86, 20);
		panel.add(txtPelo);
		
		JLabel lblNewLabel_1_2_4_1_2_7 = new JLabel("Cola: ");
		lblNewLabel_1_2_4_1_2_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_2_7.setBounds(229, 439, 74, 15);
		panel.add(lblNewLabel_1_2_4_1_2_7);
		
		JLabel lblNewLabel_1_2_4_1_1_1_7 = new JLabel("Respiracion: ");
		lblNewLabel_1_2_4_1_1_1_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_4_1_1_1_7.setBounds(219, 464, 84, 15);
		panel.add(lblNewLabel_1_2_4_1_1_1_7);
		
		txtCola = new JTextField();
		txtCola.setDropMode(DropMode.INSERT);
		txtCola.setForeground(Color.GRAY);
		txtCola.setText("Boolean");
		txtCola.setColumns(10);
		txtCola.setBounds(304, 436, 86, 20);
		panel.add(txtCola);
		
		txtRespiracion = new JTextField();
		txtRespiracion.setDropMode(DropMode.INSERT);
		txtRespiracion.setForeground(Color.GRAY);
		txtRespiracion.setText("String");
		txtRespiracion.setColumns(10);
		txtRespiracion.setBounds(304, 461, 86, 20);
		panel.add(txtRespiracion);
		
		JButton btnNewButton = new JButton("Mostrar Peces");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(76, 285, 144, 23);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setAction(action_2);
		btnEliminar.setBounds(246, 285, 144, 23);
		panel.add(btnEliminar);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setAction(action_3);
		btnNewButton_1.setBounds(235, 551, 155, 23);
		panel.add(btnNewButton_1);
		
		JLabel Titulo_1 = new JLabel("Anfibios");
		Titulo_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		Titulo_1.setBounds(215, 10, 95, 14);
		panel.add(Titulo_1);
		
		JButton btnNewButton_2 = new JButton("Menu principal");
		btnNewButton_2.setAction(action_4);
		btnNewButton_2.setBounds(134, 585, 188, 23);
		panel.add(btnNewButton_2);
		}
		
	
	

	//table.setPreferredScrollableViewportSize(new Dimension(450, 63));

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Agregar Anfibio");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Anfibios an = new Anfibios(Integer.parseInt(txtEdad.getText()), Integer.parseInt(txtPeso.getText()), 
					 txtNombre.getText(), txtTamaño.getText(), txtMedio.getText(), 
					txtGenero.getText(), txtAlimentacion.getText(), txtColor.getText(), true, true,
					txtRespiracion.getText());
			listaAnfibios.add(an);

				
				//Datos
				String edad = VentanaAnfibios.txtEdad.getText();
				String peso = VentanaAnfibios.txtPeso.getText();
				String nombre = VentanaAnfibios.txtNombre.getText();
				String patas = "4";
				String tamaño = VentanaAnfibios.txtTamaño.getText();
				String medio =  VentanaAnfibios.txtMedio.getText();
				String genero = VentanaAnfibios.txtGenero.getText();
				String alimentacion = VentanaAnfibios.txtAlimentacion.getText();
				String color = VentanaAnfibios.txtColor.getText();
				String ndientes = "true";
				String pelo = "true";
				String cantpelo = VentanaAnfibios.txtRespiracion.getText();
				
				
				final String url = "jdbc:postgresql://localhost:5432/BDDZoo";
	    	    final String user = "postgres";
	    	    final String password = "17camarones";
	    	    
	    	    Connection conn = null;
	    	    
	    	    try {
	    	    	conn = DriverManager.getConnection(url, user, password);
	    	    	JOptionPane.showMessageDialog(null, "La conexión con la DB fue exitosa, se procederá a agregar los datos del mamifero a la DB");
	    	    	Statement st = conn.createStatement();
	    	    	st.executeUpdate("INSERT INTO anfibios(nombre, edad, peso, patas, \"tamaño\", medio, genero, alimientacion, color, pelo, cola, respiracion)VALUES"
	    	    			+ "('"+nombre+"', '"+edad+"','"+peso+"','"+patas+"','"+tamaño+"','"+medio+"',"
	    	    			+ "'"+genero+"','"+alimentacion+"','"+color+"','"+pelo+"', '"+ndientes+"','"+cantpelo+"')");
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
			String [] nColumnas = {"Nombre", "Edad", "Peso", "Tama\u00F1o", "Medio", "Genero", "Alimentacion", "Color", "Pelo", "Cola", "Respiracion"};
			model = new DefaultTableModel(null, nColumnas);
			
			String sentencia = "SELECT * FROM anfibios";
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
			putValue(NAME, "Mostrar Anfibios");
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
    	    	
    	    	for (int i = 0; i< listaAnfibios.size(); i++) {
    	    		System.out.println(nombre);
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
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Modificar");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i< listaAnfibios.size(); i++) {
				if(nombre==listaAnfibios.get(i).getNombre()) {
					listaAnfibios.get(i).setNombre(VentanaAnfibios.txtNombre.getText());
					listaAnfibios.get(i).setEdad(Integer.parseInt(VentanaAnfibios.txtEdad.getText()));
					listaAnfibios.get(i).setPeso(Integer.parseInt(VentanaAnfibios.txtPeso.getText()));
					listaAnfibios.get(i).setTamaño(VentanaAnfibios.txtTamaño.getText());
					listaAnfibios.get(i).setMedio(VentanaAnfibios.txtMedio.getText());
					listaAnfibios.get(i).setGenero(VentanaAnfibios.txtGenero.getText());
					listaAnfibios.get(i).setAlimentacion(VentanaAnfibios.txtAlimentacion.getText());
					listaAnfibios.get(i).setColor(VentanaAnfibios.txtColor.getText());
					listaAnfibios.get(i).setPelo(Boolean.parseBoolean(VentanaAnfibios.txtPelo.getText()));	
					listaAnfibios.get(i).setCola(Boolean.parseBoolean(VentanaAnfibios.txtCola.getText()));	
					listaAnfibios.get(i).setTipoDeRespiracion(VentanaAnfibios.txtRespiracion.getText());

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
		txtCola.setText("Boolean");
		txtRespiracion.setText("String");
	}
}
