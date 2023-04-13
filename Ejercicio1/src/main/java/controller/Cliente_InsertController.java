/**
 * 
 */
package controller;

import java.awt.event.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.*;

import models.*;
import views.*;

/**
 * @author Javier
 *
 */
public class Cliente_InsertController implements ActionListener {
	
	private Cliente cliente;
	private Cliente_InsertView insert;
	
	
	public Cliente_InsertController(Cliente_InsertView insert) {
		this.insert = insert;
		this.insert.crear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nombre = insert.nombre.getText();
		String apellidos = insert.apellidos.getText();
		String direccion = insert.direccion.getText();
		int dni = Integer.parseInt(insert.dni.getText()); 
		
		String fechaTexto = insert.fecha.getText(); // Obtener el texto del campo de fecha
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");//establecer el formato
		
		try {
		    LocalDate fechaLocal = LocalDate.parse(fechaTexto, formatoFecha); // Analizar el texto de la fecha y crear un objeto LocalDate a partir de ella
		    java.sql.Date fecha = java.sql.Date.valueOf(fechaLocal); // Convertir el objeto LocalDate a un objeto java.sql.Date
		    cliente = new Cliente(0, nombre, apellidos, direccion, dni, fecha);
		} catch (DateTimeParseException ex) {
		    ex.printStackTrace();
		}
		
		
		cliente.insert();
		
		JOptionPane.showMessageDialog(insert, "Cliente creado correctamente.");
        insert.dispose();
	}
	
	public void initVista() {
		
		insert.setTitle("Nuevo cliente");
		insert.setBounds(300, 300, 354, 351);
		insert.setLocationRelativeTo(null);
		insert.setVisible(true);
	}
}
