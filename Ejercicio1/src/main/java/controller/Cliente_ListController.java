package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import models.Cliente;
import views.Cliente_InsertView;
import views.Cliente_ListView;
import javax.swing.table.DefaultTableModel;


public class Cliente_ListController implements ActionListener {
	
	private Cliente cliente;
	private Cliente_ListView list;
	
	public Cliente_ListController(Cliente_ListView list) {
		this.cliente = new Cliente();
		this.list = list;
		this.list.add.addActionListener(this);
	}
	
	public void initVista() {
		list.setTitle("Lista de clientes");
		list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.setBounds(300, 300, 450, 351);
		list.setLocationRelativeTo(null);
		list.setVisible(true);
		
		list.table.setModel(list());
	}
	
	public DefaultTableModel list() {
		List<Cliente> clientes = cliente.select();
		DefaultTableModel model = new DefaultTableModel(
			new String[]{"ID", "Nombre", "Apellido", "Dirección", "DNI", "Fecha"}, 0);
		
		for (Cliente c : clientes) {
		    Object[] fila = new Object[6];
		    fila[0] = c.getId();
		    fila[1] = c.getNombre();
		    fila[2] = c.getApellido();
		    fila[3] = c.getDireccion();
		    fila[4] = c.getDni();
		    fila[5] = c.getFecha();
		    model.addRow(fila);
		}
		return model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Cliente_InsertView insertView = new Cliente_InsertView();
		Cliente_InsertController controller = new Cliente_InsertController(insertView);
		controller.initVista();	
	}
}
