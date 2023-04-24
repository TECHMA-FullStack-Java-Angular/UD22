package views;

import javax.swing.*;

/**
 * @author Joan
 *
 */
public class ListSelect_View extends ListView {
	public ListSelect_View() {
		initComponents();

		select = new JButton("Aceptar");
		select.setBounds(165, 227, 89, 23);
		contentPane.add(select);
	}
}
