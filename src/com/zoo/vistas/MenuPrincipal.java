package com.zoo.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class MenuPrincipal {

	private JFrame frmZoolgico;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frmZoolgico.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZoolgico = new JFrame();
		frmZoolgico.setTitle("Zool\u00F3gico");
		frmZoolgico.setBounds(100, 100, 450, 326);
		frmZoolgico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZoolgico.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Bienvenido al Zool\u00F3gico!");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 27);
		frmZoolgico.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona la categor\u00EDa de animal que deseas ver o agregar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 49, 414, 14);
		frmZoolgico.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setAction(action);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(155, 84, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setAction(action_1);
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.setBounds(155, 118, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1_1.setAction(action_2);
		btnNewButton_1_1.setBounds(155, 152, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1_1_1.setAction(action_3);
		btnNewButton_1_1_1.setBounds(155, 186, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("New button");
		btnNewButton_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1_1_1_1.setAction(action_4);
		btnNewButton_1_1_1_1.setBounds(155, 220, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Gu\u00EDa de uso");
		btnNewButton_2.setAction(action_5);
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_2.setBounds(155, 254, 107, 23);
		frmZoolgico.getContentPane().add(btnNewButton_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Mamiferos");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			frmZoolgico.setDefaultCloseOperation(2);
			VentanaMamiferos.main(null);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Aves");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			VentanaAves.main(null);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Peces");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			VentanaPeces.main(null);
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Anfibios");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			VentanaAnfibios.main(null);
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Reptiles");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			VentanaReptiles.main(null);
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Guia de uso");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			GuiaDeUso.main(null);
		}
	}
}
