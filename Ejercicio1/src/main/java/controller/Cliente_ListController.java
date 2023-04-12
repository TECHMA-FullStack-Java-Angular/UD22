package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import models.Cliente;
import views.Cliente_InsertView;
import views.Cliente_ListView;

public class Cliente_ListController implements ActionListener {
	
	private Cliente cliente;
	private Cliente_ListView list;
	
	public Cliente_ListController(Cliente_ListView list) {
		this.list = list;
		this.list.add.addActionListener(this);	
	}
	
	public void initVista() {
		list.setTitle("Lista de clientes");
		list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.setBounds(300, 300, 450, 351);
		list.setLocationRelativeTo(null);
		list.setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Cliente_InsertView insertView = new Cliente_InsertView();
		Cliente_InsertController controller = new Cliente_InsertController(insertView);
		controller.initVista();	
	}
}
