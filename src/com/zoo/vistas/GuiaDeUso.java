package com.zoo.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GuiaDeUso {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiaDeUso window = new GuiaDeUso();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiaDeUso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gu\u00EDa de uso");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 709, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 58, 637, 270);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtrElPrograma_1 = new JTextArea();
		txtrElPrograma_1.setText("1. El programa empieza en el men\u00FA principal, debes seleccionar la categor\u00EDa del animal que deseas ver, agregar, modificar o eliminar.\r\n\r\n2. Se desplega una ventana con la categor\u00EDa del animal deseado.\r\n\r\n3. Si deseas VER los animales, debes: \r\n\t3.1 Clickear el bot\u00F3n \"Mostrar animales\", y se mostrar\u00E1n en la tabla. \r\n\r\n4. Si deseas ELIMINAR un animal, debes:\r\n\t4.1 Clickear el bot\u00F3n \"Mostrar animales\", y se mostrar\u00E1n en la tabla. \r\n\t4.2 Clickear la fila del animal que deseas eliminar en la tabla.\r\n\t4.3 Clickear el bot\u00F3n \"Eliminar animal\".\r\n\r\n5. Si deseas AGREGAR un animal, debes:\r\n\t5.1 Rellenar los campos de sus caracter\u00EDsticas en la parte inferior.\r\n\t5.2 Clickear el bot\u00F3n \"Agregar animal\".\r\n\r\n6. Si deseas MODIFICAR un animal, debes:\r\n\t6.1 Clickear el bot\u00F3n \"Mostrar animales\", y se mostrar\u00E1n en la tabla. \r\n\t6.2 Clickear la fila del animal que deseas modificar en la tabla.\r\n\t6.3 Sus caracter\u00EDsticas se mostrar\u00E1n en los campos inferiores, modif\u00EDcalas a tu gusto.\r\n\t6.4 Cuando hayas realizado las modificaciones, clickear el bot\u00F3n \"Modificar animal\".\r\n\r\n7. Todas las ventanas de cada categoria cuentan con un bot\u00F3n para volver al men\u00FA principal.\r\n\r\n");
		scrollPane.setViewportView(txtrElPrograma_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 11));
		btnNewButton.setAction(action);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(247, 352, 234, 23);
		frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Volver al menu principal");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			MenuPrincipal.main(null);
		}
	}
}
