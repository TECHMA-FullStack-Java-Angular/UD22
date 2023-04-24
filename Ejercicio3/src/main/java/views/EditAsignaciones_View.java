/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Joan
 * insert or update
 */
public class EditAsignaciones_View extends JFrame {
	
	private JPanel contentPane;
	public JButton seleccionarProyecto;
	public JLabel proyecto_id;
	public JButton seleccionarCientfico;
	public JLabel cientifico_id;
	public JButton button;
	public JLabel tituloVentana;
	
	
	public EditAsignaciones_View() {
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
		button.setBounds(217, 167, 89, 23);
		contentPane.add(button);
		
		JLabel lblProyecto = new JLabel("Proyecto:");
		lblProyecto.setBounds(34, 57, 61, 14);
		contentPane.add(lblProyecto);
		
		seleccionarProyecto = new JButton("Seleccionar proyecto");
		seleccionarProyecto.setBounds(105, 53, 150, 23);
		contentPane.add(seleccionarProyecto);
		
		proyecto_id = new JLabel("");
		proyecto_id.setBounds(265, 57, 81, 14);
		contentPane.add(proyecto_id);
		
		JLabel lblCientfico = new JLabel("Científico:");
		lblCientfico.setBounds(34, 100, 61, 14);
		contentPane.add(lblCientfico);
		
		seleccionarCientfico = new JButton("Seleccionar científico");
		seleccionarCientfico.setBounds(105, 96, 150, 23);
		contentPane.add(seleccionarCientfico);
		
		cientifico_id = new JLabel("");
		cientifico_id.setBounds(265, 100, 81, 14);
		contentPane.add(cientifico_id);
		
		
		
	}
}