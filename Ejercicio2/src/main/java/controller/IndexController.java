package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import models.DataBase;
import views.IndexView;

public class IndexController implements ActionListener{

	private IndexView view;

	
	
	public IndexController() {
		view = new IndexView();
		view.clientes.addActionListener(this);
		view.videos.addActionListener(this);
		initVista();
	}
	
	public void initVista() {
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setBounds(100, 100, 534, 473);
		
		view.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		view.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.clientes) {
			new ListController(DataBase.clientes);
		} else if (e.getSource() == view.videos) {
			new ListController(DataBase.videos);
		}
	}

}
