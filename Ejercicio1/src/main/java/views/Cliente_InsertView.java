/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Javier
 *
 */
public class Cliente_InsertView extends JFrame {
	
	private JPanel contentPane;
	public JTextField nombre;
	public JTextField apellidos;
	public JTextField direccion;
	public JTextField dni;
	public JTextField fecha;
	public JButton crear;
	
	public Cliente_InsertView() {
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
		fecha.setColumns(10);
		fecha.setBounds(107, 217, 201, 20);
		contentPane.add(fecha);
		
		crear = new JButton("Crear");
		crear.setBounds(219, 271, 89, 23);
		contentPane.add(crear);
		
		JLabel lblNewLabel = new JLabel("NUEVO CLIENTE");
		lblNewLabel.setBounds(124, 22, 138, 20);
		contentPane.add(lblNewLabel);
	}
}