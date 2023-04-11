/**
 * 
 */
package controller;

import java.awt.event.*;
import javax.swing.*;

import models.*;
import views.*;

/**
 * @author Javier
 *
 */
public class InsertController implements ActionListener {
	
	private Cliente cliente;
	private InsertView insert;
	
	public InsertController(InsertView insert) {
		this.insert = insert;
		this.insert.crear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nombre = insert.nombre.getText();
		String apellidos = insert.apellidos.getText();
		String direccion = insert.direccion.getText();
		int dni = Integer.parseInt(insert.dni.getText());
		String fecha = insert.fecha.getText();
		
		cliente = new Cliente(nombre, apellidos, direccion, dni, fecha);
		cliente.insert();
		
		JOptionPane.showMessageDialog(insert, "Cliente creado correctamente.");
        insert.dispose();
	}
	
	public void initVista() {
		
		insert.setTitle("Nuevo cliente");
		insert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		insert.setBounds(300, 300, 354, 351);
		insert.setLocationRelativeTo(null);
		insert.setVisible(true);
	}
}