/**
 * 
 */
package views;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

/**
 * @author Javier
 * insert or update
 */
public class EditCliente_View extends JFrame {
	
	private JPanel contentPane;
	public JTextField nombre;
	public JTextField apellidos;
	public JTextField direccion;
	public JTextField dni;
	public JTextField fecha;
	public JButton button;
	public JLabel labelTitle;
	
	public EditCliente_View() {
		initComponents();
	}
	
	private void initComponents() {
				
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lNombre = new JLabel("Nombre:");
		lNombre.setBounds(34, 56, 61, 14);
		contentPane.add(lNombre);
		
		JLabel lApellidos = new JLabel("Apellidos:");
		lApellidos.setBounds(34, 100, 61, 14);
		contentPane.add(lApellidos);
		
		JLabel lDireccion = new JLabel("Dirección:");
		lDireccion.setBounds(34, 142, 61, 14);
		contentPane.add(lDireccion);
		
		JLabel lDni = new JLabel("DNI:");
		lDni.setBounds(34, 183, 46, 14);
		contentPane.add(lDni);
		
		JLabel lFecha = new JLabel("Fecha:");
		lFecha.setBounds(34, 220, 46, 14);
		contentPane.add(lFecha);
		
		nombre = new JTextField();
		nombre.setBounds(107, 53, 201, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		apellidos = new JTextField();
		apellidos.setColumns(10);
		apellidos.setBounds(107, 97, 201, 20);
		contentPane.add(apellidos);
		
		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(107, 139, 201, 20);
		contentPane.add(direccion);
		
		dni = new JTextField();
		dni.setColumns(10);
		dni.setBounds(107, 180, 201, 20);
		contentPane.add(dni);
		
		fecha = new JTextField();
		//creamos una fecha actual por defecto
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		fecha.setText(LocalDate.now().format(dateFormat));
		fecha.setColumns(10);
		fecha.setBounds(107, 217, 201, 20);
		contentPane.add(fecha);
		
		button = new JButton();
		button.setBounds(219, 250, 89, 23);
		contentPane.add(button);
		
		labelTitle = new JLabel();
		labelTitle.setBounds(124, 22, 138, 20);
		contentPane.add(labelTitle);
		
		
	}
}