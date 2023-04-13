package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import models.Cliente;
import views.Cliente_Index;
import views.Cliente_InsertView;
import views.Cliente_ListView;

public class Cliente_IndexController implements ActionListener{

	private Cliente cliente;
	private Cliente_Index indice;
	private Cliente_InsertView insertView;

	
	
	public Cliente_IndexController(Cliente_Index indice) {
		this.cliente = new Cliente();
		this.indice = indice;
		this.indice.nuevoCliente.addActionListener(this);
		this.indice.editarCliente.addActionListener(this);
		this.indice.verCliente.addActionListener(this);
		this.indice.eliminarCliente.addActionListener(this);
	}
	
	public void initVista() {
		indice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		indice.setBounds(100, 100, 534, 473);
		
		indice.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		indice.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		   if (e.getSource() == indice.nuevoCliente) {
		        // Crear y mostrar la vista de inserción de cliente
			   Cliente_InsertView insertView = new Cliente_InsertView();
		        Cliente_InsertController insertController = new Cliente_InsertController(insertView);
		        insertController.initVista();
		    
		    } else if (e.getSource() == indice.verCliente) {
		        // Crear y mostrar la vista de visualización de clientes
		        Cliente_ListView listView = new Cliente_ListView();
		        Cliente_ListController listController = new Cliente_ListController(listView);
		        listController.initVista();
		    }
	
		
		
	
		
	}

}
