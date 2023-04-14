package controller;

import views.ListSelect_View;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import models.Table;

/**
 * @author Joan
 * Esta clase se usa cuando hay que definir una Foregin Key
 * Se abre una vista que muestra todos los registros de la tabla
 * a la que apunta la Foregin Key y el usuario selecciona uno.
 */
public class ListSelect_Controller extends ListController {
    
    private JLabel result; // label donde irá el resultado de la selección

    public ListSelect_Controller(Table table, JLabel result) {
        this.table = table;
        this.result = result;
        view = new ListSelect_View();
        view.select.addActionListener(this);
        initVista();
        refreshList();
    }

    @Override
	public void actionPerformed(ActionEvent e) {
        int row = view.table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(view, "Seleccione una fila");
			return;
		}
        String value = view.table.getValueAt(row, 0).toString(); //asumimos que la PK es la primera columna
        result.setText(value);
        view.dispose();
    }
}
