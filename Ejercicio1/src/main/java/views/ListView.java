/**
 * 
 */
package views;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Javier
 *
 */
public class ListView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		table.setBounds(20, 45, 491, 171);
		contentPane.add(table);
		
		JLabel clientes = new JLabel("Clientes");
		clientes.setBounds(228, 20, 89, 14);
		contentPane.add(clientes);
		
		insert = new JButton("Añadir");
		insert.setBounds(20, 227, 102, 23);
		contentPane.add(insert);
		
	    update = new JButton("Modificar");
		update.setBounds(208, 227, 109, 23);
		contentPane.add(update);
		
		delete = new JButton("Eliminar");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		delete.setBounds(382, 227, 109, 23);
		contentPane.add(delete);
	}
}
