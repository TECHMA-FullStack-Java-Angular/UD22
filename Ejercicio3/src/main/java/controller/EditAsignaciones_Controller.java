/**
 * 
 */
package controller;

import java.awt.event.*;

import models.*;
import views.*;

/**
 * @author Joan
 * Esta clase añade (insert) o modifica (update) un elemento de la tabla asignaciones
 * Si elementToUpdate==null, inserta un nuevo elemento
 * Si no, modifica el elemento cuyos campos son elementToUpdate
 */
public class EditAsignaciones_Controller implements ActionListener {
	
	private EditAsignaciones_View view;
	private ListController listController;
	private String[] elementToUpdate = null;
	private Table table = DataBase.asignaciones;
	
	// insert
	public EditAsignaciones_Controller(ListController listController) { 
		this.listController = listController;
		initVista();
		view.setTitle("Nuevo asignación");
		view.tituloVentana.setText("NUEVO ASIGNACIÓN");
		view.button.setText("Añadir");
	}

	// update
	public EditAsignaciones_Controller(ListController listController, String[] elementToUpdate) {
		this.listController = listController;
		this.elementToUpdate = elementToUpdate;
		initVista();
		view.setTitle("Modificar asignación");
		view.tituloVentana.setText("MODIFICAR ASIGNACIÓN");
		view.button.setText("Modificar");

		view.cientifico_id.setText(elementToUpdate[0]);
		view.proyecto_id.setText(elementToUpdate[1]);
	}

	public void initVista() {
		view = new EditAsignaciones_View();
		view.button.addActionListener(this);
		view.seleccionarCientfico.addActionListener(this);
		view.seleccionarProyecto.addActionListener(this);
		view.setBounds(300, 300, 354, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.button) {
			String cientifico_id = view.cientifico_id.getText();
			String proyecto_id = view.proyecto_id.getText();

			String[] columns = {"cientifico", "proyecto"};
			String[] values = {cientifico_id, proyecto_id};
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
		else if (e.getSource() == view.seleccionarCientfico) {
			System.out.println("i'm heeeeeeeeere");
			new ListSelect_Controller(DataBase.cientificos, view.cientifico_id);
		}
		else if (e.getSource() == view.seleccionarProyecto) {
			new ListSelect_Controller(DataBase.proyectos, view.proyecto_id);
		}
		
	}
	
	
}
