package app1Main;

import javax.swing.*;
import controller.*;
import views.Cliente_InsertView;
import views.Cliente_ListView;

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
    	Cliente_InsertController controllerInsert = new Cliente_InsertController(insertView);
    	controllerInsert.initVista();
    	Cliente_ListView listView = new Cliente_ListView();
    	Cliente_ListController controller = new Cliente_ListController(listView);
    	controller.initVista();
    }
}
