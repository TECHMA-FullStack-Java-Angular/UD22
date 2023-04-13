/**
 * 
 */
package controller;

import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

import models.*;
import views.*;

/**
 * @author Joan
 * Esta clase añade (insert) o modifica (update) un elemento de la tabla cliente
 * Si elementToUpdate==null, inserta un nuevo elemento
 * Si no, modifica el elemento cuyos campos son elementToUpdate
 */
public class EditClientes_Controller implements ActionListener {
	
	private EditClientes_View view;
	private ListController listController;
	private String[] elementToUpdate = null;
	private Table table = DataBase.clientes;
	
	// insert cliente
	public EditClientes_Controller(ListController listController) { 
		this.listController = listController;
		initVista();
		view.setTitle("Nuevo cliente");
		view.tituloVentana.setText("NUEVO CLIENTE");
		view.button.setText("Añadir");
	}

	// update cliente
	public EditClientes_Controller(ListController listController, String[] elementToUpdate) {
		this.listController = listController;
		this.elementToUpdate = elementToUpdate;
		initVista();
		view.setTitle("Modificar cliente");
		view.tituloVentana.setText("MODIFICAR CLIENTE");
		view.button.setText("Modificar");

		view.nombre.setText(elementToUpdate[1]);
		view.apellidos.setText(elementToUpdate[2]);
		view.direccion.setText(elementToUpdate[3]);
		view.dni.setText(elementToUpdate[4]);
		view.fecha.setText(elementToUpdate[5]);
	}

	public void initVista() {
		view = new EditClientes_View();
		view.button.addActionListener(this);
		view.setBounds(300, 300, 354, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = view.nombre.getText();
		String apellidos = view.apellidos.getText();
		String direccion = view.direccion.getText();
		int dni = 0;
		java.sql.Date fecha = null;

		try {
		    dni = Integer.parseInt(view.dni.getText()); 
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(view, "El DNI debe ser un número entero");
			return;
		}
		try {
			String fechaTexto = view.fecha.getText(); // Obtener el texto del campo de fecha
			DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");//establecer el formato
		    LocalDate fechaLocal = LocalDate.parse(fechaTexto, formatoFecha); // Analizar el texto de la fecha y crear un objeto LocalDate a partir de ella
		    fecha = java.sql.Date.valueOf(fechaLocal); // Convertir el objeto LocalDate a un objeto java.sql.Date
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(view, "El formato de la fecha es incorrecto (formato deseado: aaaa-mm-dd)");
			return;
		}

		String[] columns = {"nombre", "apellido", "direccion", "dni", "fecha"};
		String[] values = {nombre,apellidos,direccion,Integer.toString(dni),fecha.toString()};
		if (elementToUpdate == null) {
			table.insert(columns, values);
		}
		else {
			table.update(elementToUpdate, columns, values);
		}
		listController.refreshList();
		view.dispose();
		
	}
	
	
}
