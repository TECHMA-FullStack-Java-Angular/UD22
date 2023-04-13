package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import views.IndexView;

public class IndexController implements ActionListener{

	private IndexView indice;

	
	
	public IndexController(IndexView indice) {
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
		        //EditCliente_Controller insertController = new EditCliente_Controller();
		        //insertController.initVista();
		    
		    } else if (e.getSource() == indice.verCliente) {
		        // Crear y mostrar la vista de visualización de clientes
		        ListController listController = new ListController();
		        listController.initVista();
		    }
	}

}
