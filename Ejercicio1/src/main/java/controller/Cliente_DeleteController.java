package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import models.Cliente;
import views.Cliente_Delete;
import views.Cliente_Index;
import views.Cliente_InsertView;

public class Cliente_DeleteController implements ActionListener{
	
	
	private Cliente cliente;
	private Cliente_Delete deleteView;
	
	
	public Cliente_DeleteController(Cliente_Delete deleteView) {
		this.cliente = new Cliente();
		this.deleteView = deleteView;
		this.deleteView.btnEliminar.addActionListener(this);
		this.deleteView.btnModificar.addActionListener(this);
		
	}
	
	public void initVista() {
		deleteView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deleteView.setBounds(100, 100, 612, 471);
		deleteView.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == deleteView.btnEliminar) {
			
			
		}else if (e.getSource() == deleteView.btnModificar) {
			
		}
		
	}

}
