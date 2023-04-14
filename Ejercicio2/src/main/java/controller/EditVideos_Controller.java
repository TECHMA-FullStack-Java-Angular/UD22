/**
 * 
 */
package controller;

import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.text.View;

import models.*;
import views.*;

/**
 * @author Joan
 * Esta clase añade (INSERT) o modifica (UPDATE) un elemento de la tabla cliente
 * Si elementToUpdate==null, inserta un nuevo elemento
 * Si no, modifica el elemento cuyos campos son elementToUpdate
 */
public class EditVideos_Controller implements ActionListener {
	
	private EditVideos_View view;
	private ListController listController;
	private String[] elementToUpdate = null;
	private Table table = DataBase.videos;
	
	// insert cliente
	public EditVideos_Controller(ListController listController) { 
		this.listController = listController;
		initVista();
		view.setTitle("Nuevo vídeo");
		view.tituloVentana.setText("NUEVO VÍDEO");
		view.button.setText("Añadir");
	}

	// update cliente
	public EditVideos_Controller(ListController listController, String[] elementToUpdate) {
		this.listController = listController;
		this.elementToUpdate = elementToUpdate;
		initVista();
		view.setTitle("Modificar vídeo");
		view.tituloVentana.setText("MODIFICAR VÍDEO");
		view.button.setText("Modificar");

		view.titulo.setText(elementToUpdate[1]);
		view.director.setText(elementToUpdate[2]);
		view.cli_id.setText(elementToUpdate[3]);
	}

	public void initVista() {
		view = new EditVideos_View();
		view.button.addActionListener(this);
		view.seleccionarCliente.addActionListener(this);
		view.setBounds(300, 300, 354, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.button) {
			if (view.cli_id.getText() == "") {
				JOptionPane.showMessageDialog(view, "Seleccione un cliente");
			}

			String titulo = view.titulo.getText();
			String director = view.director.getText();
			String cli_id = view.cli_id.getText();

			String[] columns = {"titulo", "director", "cli_id"};
			String[] values = {titulo,director,cli_id};
			if (elementToUpdate == null) {
				table.insert(columns, values);
			}
			else {
				table.update(elementToUpdate, columns, values);
			}
			listController.refreshList();
			view.dispose();
		}
		else {
			new ListSelect_Controller(DataBase.clientes, view.cli_id);
		}
	}
	
	
}
