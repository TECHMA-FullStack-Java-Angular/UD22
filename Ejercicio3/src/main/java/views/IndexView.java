package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IndexView extends JFrame {

	public JPanel contentPane;
	public JButton cientificos;
	public JButton proyectos;
	public JButton asignaciones;

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
		
		JLabel lblBienvenido = new JLabel("Gestor de científicos y proyectos");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBienvenido.setBounds(86, 26, 329, 62);
		contentPane.add(lblBienvenido);
		
		cientificos = new JButton("Cientificos");
		cientificos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cientificos.setBounds(180, 100, 144, 40);
		contentPane.add(cientificos);
		
		proyectos = new JButton("Proyectos");
		proyectos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		proyectos.setBounds(180, 166, 144, 40);
		contentPane.add(proyectos);

		asignaciones = new JButton("Asignaciones");
		asignaciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		asignaciones.setBounds(180, 233, 144, 40);
		contentPane.add(asignaciones);
	}
}
