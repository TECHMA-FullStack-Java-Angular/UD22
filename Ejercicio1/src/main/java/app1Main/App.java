package app1Main;

import javax.swing.*;
import controller.InsertController;
import views.InsertView;

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
    	
    	InsertView insertView = new InsertView();
    	InsertController controller = new InsertController(insertView);
    	controller.initVista();
    }
}
