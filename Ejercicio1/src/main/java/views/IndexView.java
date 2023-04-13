package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IndexView extends JFrame {

	public JPanel contentPane;
	public JButton nuevoCliente;
	public JButton editarCliente;
	public JButton verCliente;
	public JButton eliminarCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexView frame = new IndexView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public IndexView() {
		initComponents();
	}
	
	public void initComponents() {
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(267, 14, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Gestor de Clientes");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBienvenido.setBounds(79, 25, 340, 62);
		contentPane.add(lblBienvenido);
		
		nuevoCliente = new JButton("Añadir Cliente");
		nuevoCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nuevoCliente.setBounds(185, 121, 144, 40);
		contentPane.add(nuevoCliente);
		
		editarCliente = new JButton("Editar Cliente");
		editarCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		editarCliente.setBounds(185, 187, 144, 40);
		contentPane.add(editarCliente);
		
		verCliente = new JButton("Ver Clientes");
		verCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		verCliente.setBounds(185, 249, 144, 40);
		contentPane.add(verCliente);
		
		eliminarCliente = new JButton("Eliminar Cliente");
		eliminarCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		eliminarCliente.setBounds(185, 310, 144, 40);
		contentPane.add(eliminarCliente);
	}
}
