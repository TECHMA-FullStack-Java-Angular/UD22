/**
 * 
 */
package controller;

import java.awt.event.*;

import models.*;
import views.*;

/**
 * @author Joan
 * Esta clase añade (insert) o modifica (update) un elemento de la tabla cientifico
 * Si elementToUpdate==null, inserta un nuevo elemento
 * Si no, modifica el elemento cuyos campos son elementToUpdate
 */
public class EditCientificos_Controller implements ActionListener {
	
	private EditCientificos_View view;
	private ListController listController;
	private String[] elementToUpdate = null;
	private Table table = DataBase.cientificos;
	
	// insert cientifico
	public EditCientificos_Controller(ListController listController) { 
		this.listController = listController;
		initVista();
		view.setTitle("Nuevo científico");
		view.tituloVentana.setText("NUEVO CIENTÍFICO");
		view.button.setText("Añadir");
	}

	// update cientifico
	public EditCientificos_Controller(ListController listController, String[] elementToUpdate) {
		this.listController = listController;
		this.elementToUpdate = elementToUpdate;
		initVista();
		view.setTitle("Modificar científico");
		view.tituloVentana.setText("MODIFICAR CIENTÍFICO");
		view.button.setText("Modificar");

		view.dni.setText(elementToUpdate[0]);
		view.nomApels.setText(elementToUpdate[1]);
	}

	public void initVista() {
		view = new EditCientificos_View();
		view.button.addActionListener(this);
		view.setBounds(300, 300, 354, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String dni = view.dni.getText();
		String nom_apels = view.nomApels.getText();

		String[] columns = {"dni", "nom_apels"};
		String[] values = {dni, nom_apels};
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
