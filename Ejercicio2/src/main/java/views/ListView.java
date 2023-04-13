/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Javier
 *
 */
public class ListView extends JFrame{

	protected JPanel contentPane;
	public JTable table;
	public JButton insert;
	public JButton update;
	public JButton delete;
	public JButton select; // solo se usa en la subclase ListSelect_View
	public JLabel window_title;
	
	public ListView() {
		initComponents();
		initButtons();
	}
	
	protected void initComponents() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(20, 45, 388, 171);
		contentPane.add(table);
		
		window_title = new JLabel();
		window_title.setBounds(188, 20, 49, 14);
		contentPane.add(window_title);
	}

	private void initButtons() {
		insert = new JButton("Añadir");
		insert.setBounds(54, 227, 89, 23);
		contentPane.add(insert);
		
	    update = new JButton("Modificar");
		update.setBounds(165, 227, 89, 23);
		contentPane.add(update);
		
		delete = new JButton("Eliminar");
		delete.setBounds(283, 227, 89, 23);
		contentPane.add(delete);
	}
}
