package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import models.DataBase;
import views.ListView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ListController implements ActionListener {
	
	private ListView view;
	
	public ListController() {
		view = new ListView();
		view.insert.addActionListener(this);
		view.delete.addActionListener(this);
		view.update.addActionListener(this);
		initVista();
		refreshList();
	}
	
	public void initVista() {
		view.setTitle("Lista de clientes");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setBounds(300, 300, 450, 351);
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	public void refreshList() {
		view.table.setModel(list());
	}
	
	private DefaultTableModel list() {
		List<String[]> rows = DataBase.cliente.select();
		DefaultTableModel model = new DefaultTableModel(DataBase.cliente.getAttributeNames(), 0);
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
			new EditCliente_Controller(this);
		}
		else if (e.getSource() == view.delete) {
			String[] row_values = getRowValues();
			if (row_values != null) {
				if (0 == JOptionPane.showConfirmDialog(view, "¿Está seguro de que quiere eliminar este cliente?")) {
					DataBase.cliente.delete(row_values);
					refreshList();
				}
			}
		}
		else if (e.getSource() == view.update) {
			String[] row_values = getRowValues();
			if (row_values != null) {
				new EditCliente_Controller(this, row_values);
			}
		}
	}
}
