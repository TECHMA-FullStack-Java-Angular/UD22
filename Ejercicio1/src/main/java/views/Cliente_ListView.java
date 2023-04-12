/**
 * 
 */
package views;

import javax.swing.*;

/**
 * @author Javier
 *
 */
public class Cliente_ListView extends JFrame{

	private JPanel contentPane;
	private JTable table;
	public JButton add;
	
	public Cliente_ListView() {
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
		
		add = new JButton("Añadir");
		add.setBounds(319, 227, 89, 23);
		contentPane.add(add);
	}
}
