/**
 * 
 */
package controller;

import java.awt.event.*;

import models.*;
import views.*;

/**
 * @author Joan
 * Esta clase añade (insert) o modifica (update) un elemento de la tabla proyectos
 * Si elementToUpdate==null, inserta un nuevo elemento
 * Si no, modifica el elemento cuyos campos son elementToUpdate
 */
public class EditProyectos_Controller implements ActionListener {
	
	private EditProyectos_View view;
	private ListController listController;
	private String[] elementToUpdate = null;
	private Table table = DataBase.proyectos;
	
	// insert
	public EditProyectos_Controller(ListController listController) { 
		this.listController = listController;
		initVista();
		view.setTitle("Nuevo proyecto");
		view.tituloVentana.setText("NUEVO PROYECTO");
		view.button.setText("Añadir");
	}

	// update
	public EditProyectos_Controller(ListController listController, String[] elementToUpdate) {
		this.listController = listController;
		this.elementToUpdate = elementToUpdate;
		initVista();
		view.setTitle("Modificar proyecto");
		view.tituloVentana.setText("MODIFICAR PROYECTO");
		view.button.setText("Modificar");

		view.nombre.setText(elementToUpdate[1]);
		view.horas.setText(elementToUpdate[2]);
	}

	public void initVista() {
		view = new EditProyectos_View();
		view.button.addActionListener(this);
		view.setBounds(300, 300, 354, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = view.nombre.getText();
		String horas = view.horas.getText();

		String[] columns = {"nombre", "horas"};
		String[] values = {nombre, horas};
		boolean success;
		if (elementToUpdate == null) {
			success = table.insert(columns, values);
		}
		else {
			success = table.update(elementToUpdate, columns, values);
		}
		if (success) {
			listController.refreshList();
			view.dispose();
		}
		
	}
	
	
}
