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

	private JPanel contentPane;
	public JTable table;
	public JButton insert;
	public JButton update;
	public JButton delete;
	
	public ListView() {
		initComponents();
	}
	
	private void initComponents() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(20, 45, 388, 171);
		contentPane.add(table);
		
		JLabel clientes = new JLabel("Clientes");
		clientes.setBounds(188, 20, 49, 14);
		contentPane.add(clientes);
		
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
