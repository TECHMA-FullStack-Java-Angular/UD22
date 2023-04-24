package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import views.ListView;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import models.DataBase;
import models.Table;



public class ListController implements ActionListener {
	
	protected ListView view;
	protected Table table;

	public ListController() {}
	
	public ListController(Table table) {
		this.table = table;
		view = new ListView();
		view.insert.addActionListener(this);
		view.delete.addActionListener(this);
		view.update.addActionListener(this);
		initVista();
		refreshList();
	}
	
	public void initVista() {
		view.setTitle("Lista de "+table.name);
		view.setBounds(300, 300, 450, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
		view.window_title.setText(table.name);
	}

	public void refreshList() {
		view.table.setModel(list());
	}
	
	private DefaultTableModel list() {
		List<String[]> rows = table.select();
		DefaultTableModel model = new DefaultTableModel(table.getAttributeNames(), 0);
		for (String[] row : rows) {
		    model.addRow(row);
		}
		return model;
	}

	private String[] getRowValues() {
		int row = view.table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(view, "Seleccione una fila");
			return null;
		}
		int n = view.table.getColumnCount();
		String[] values = new String[n];
		for (int i = 0; i < n; i++) {
			values[i] = view.table.getValueAt(row, i).toString();
		}
		return values;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.insert) {
			if (table == DataBase.clientes)
				new EditClientes_Controller(this);
			else if (table == DataBase.videos)
				new EditVideos_Controller(this);
		}
		else if (e.getSource() == view.update) {
			String[] row_values = getRowValues();
			if (row_values != null) {
				if (table == DataBase.clientes)
					new EditClientes_Controller(this, row_values);
				else if (table == DataBase.videos)
					new EditVideos_Controller(this, row_values);
			}
		}
		else if (e.getSource() == view.delete) {
			String[] row_values = getRowValues();
			if (row_values != null) {
				if (0 == JOptionPane.showConfirmDialog(view, "¿Está seguro de que quiere eliminar este registro?")) {
					table.delete(row_values);
					refreshList();
				}
			}
		}
		
	}
}
