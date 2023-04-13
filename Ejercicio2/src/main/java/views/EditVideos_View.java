/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Javier
 * insert or update
 */
public class EditVideos_View extends JFrame {
	
	private JPanel contentPane;
	public JTextField titulo;
	public JTextField director;
	public JButton seleccionarCliente;
	public JLabel cli_id;
	public JButton button;
	public JLabel tituloVentana;
	
	public EditVideos_View() {
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
		button.setBounds(219, 195, 89, 23);
		contentPane.add(button);
		
		JLabel lTitulo = new JLabel("Título:");
		lTitulo.setBounds(34, 56, 61, 14);
		contentPane.add(lTitulo);
		
		JLabel lDirector = new JLabel("Director:");
		lDirector.setBounds(34, 100, 61, 14);
		contentPane.add(lDirector);
		
		JLabel lCliente = new JLabel("Cliente:");
		lCliente.setBounds(34, 142, 61, 14);
		contentPane.add(lCliente);
		
		titulo = new JTextField();
		titulo.setBounds(107, 53, 201, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		director = new JTextField();
		director.setColumns(10);
		director.setBounds(107, 97, 201, 20);
		contentPane.add(director);
		
		seleccionarCliente = new JButton("Seleccionar cliente");
		seleccionarCliente.setBounds(105, 138, 150, 23);
		contentPane.add(seleccionarCliente);
		
		cli_id = new JLabel("");
		cli_id.setBounds(260, 142, 20, 14);
		contentPane.add(cli_id);
		
		
		
	}
}