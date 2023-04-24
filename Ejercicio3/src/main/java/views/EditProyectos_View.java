/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Joan
 * insert or update
 */
public class EditProyectos_View extends JFrame {
	
	private JPanel contentPane;
	public JTextField nombre;
	public JTextField horas;
	public JButton button;
	public JLabel tituloVentana;

	
	public EditProyectos_View() {
		initComponents();
	}
	
	private void initComponents() {
				
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tituloVentana = new JLabel();
		tituloVentana.setBounds(124, 22, 138, 20);
		contentPane.add(tituloVentana);

		button = new JButton();
		button.setBounds(219, 150, 89, 23);
		contentPane.add(button);
		
		JLabel lnombre = new JLabel("Nombre:");
		lnombre.setBounds(34, 56, 61, 14);
		contentPane.add(lnombre);
		
		JLabel lhoras = new JLabel("Horas:");
		lhoras.setBounds(34, 100, 61, 14);
		contentPane.add(lhoras);
		
		nombre = new JTextField();
		nombre.setBounds(107, 53, 201, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		horas = new JTextField();
		horas.setColumns(10);
		horas.setBounds(107, 97, 201, 20);
		contentPane.add(horas);
		
		
		
	}
}