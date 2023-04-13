package app1Main;

import javax.swing.*;
import controller.*;
import models.DataBase;

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
    	
		DataBase.init();
		new ListController();
    }
}
