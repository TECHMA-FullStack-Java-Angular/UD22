package app1Main;

import javax.swing.*;
import controller.*;
import views.Cliente_InsertView;

/**
 * @author Javier
 *
 */
public class App {
    public static void main( String[] args ) {
    	
    	try {
    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    	}
    	catch (UnsupportedLookAndFeelException e) {	
		}
    	catch (ClassNotFoundException e) {
		}
    	catch (InstantiationException e) {
    	}
    	catch (IllegalAccessException e) {	
    	}
    	
    	Cliente_InsertView insertView = new Cliente_InsertView();
    	Cliente_InsertController controller = new Cliente_InsertController(insertView);
    	controller.initVista();
    }
}
