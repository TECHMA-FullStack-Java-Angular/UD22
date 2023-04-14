package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IndexView extends JFrame {

	public JPanel contentPane;
	public JButton clientes;
	public JButton videos;

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
		
		JLabel lblBienvenido = new JLabel("Gestor de clientes y películas");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBienvenido.setBounds(86, 26, 329, 62);
		contentPane.add(lblBienvenido);
		
		clientes = new JButton("Clientes");
		clientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		clientes.setBounds(180, 100, 144, 40);
		contentPane.add(clientes);
		
		videos = new JButton("Vídeos");
		videos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		videos.setBounds(180, 166, 144, 40);
		contentPane.add(videos);
	}
}
