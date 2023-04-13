package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Cliente_ListController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente_Delete extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldNombre;
	public JTextField textFieldApellidos;
	public JTextField textFieldDni;
	public JTextField textFieldDireccion;
	public JButton btnModificar;
	public JButton btnEliminar;
	



	/**
	 * Create the frame.
	 */
	public Cliente_Delete() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDelete = new JLabel("Busca el cliente");
		lblDelete.setHorizontalAlignment(SwingConstants.LEFT);
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDelete.setBounds(27, 37, 375, 51);
		contentPane.add(lblDelete);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(27, 118, 95, 40);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos: ");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(27, 168, 95, 40);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBounds(27, 217, 95, 40);
		contentPane.add(lblDni);
		
		JLabel lblDirección = new JLabel("Dirección: ");
		lblDirección.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDirección.setBounds(27, 269, 95, 40);
		contentPane.add(lblDirección);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(144, 115, 328, 35);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setColumns(10);
		textFieldApellidos.setBounds(144, 168, 328, 35);
		contentPane.add(textFieldApellidos);
		
		textFieldDni = new JTextField();
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(144, 217, 328, 35);
		contentPane.add(textFieldDni);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setColumns(10);
		textFieldDireccion.setBounds(144, 269, 328, 35);
		contentPane.add(textFieldDireccion);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEliminar.setBounds(85, 365, 141, 40);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnModificar.setBounds(356, 365, 141, 40);
		contentPane.add(btnModificar);
		
		
		
		
	}
}
