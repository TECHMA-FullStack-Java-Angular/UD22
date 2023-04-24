/**
 * 
 */
package views;


import javax.swing.*;

/**
 * @author Joan
 * insert or update
 */
public class EditCientificos_View extends JFrame {
	
	private JPanel contentPane;
	public JTextField dni;
	public JTextField nomApels;
	public JButton button;
	public JLabel tituloVentana;
	
	public EditCientificos_View() {
		initComponents();
	}
	
	private void initComponents() {
				
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(34, 56, 61, 14);
		contentPane.add(lblDni);
		
		JLabel lNomApels = new JLabel("Nombre y apellidos:");
		lNomApels.setBounds(34, 100, 121, 14);
		contentPane.add(lNomApels);
		
		dni = new JTextField();
		dni.setBounds(130, 53, 160, 20);
		contentPane.add(dni);
		dni.setColumns(10);
		
		nomApels = new JTextField();
		nomApels.setColumns(10);
		nomApels.setBounds(130, 97, 160, 20);
		contentPane.add(nomApels);
		
		button = new JButton();
		button.setBounds(246, 157, 89, 23);
		contentPane.add(button);
		
		tituloVentana = new JLabel();
		tituloVentana.setBounds(124, 22, 138, 20);
		contentPane.add(tituloVentana);
		
		
	}
}