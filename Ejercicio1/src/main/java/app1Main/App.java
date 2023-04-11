package app1Main;

import models.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Connector c = new Connector();
        c.createDB("servicio");
    }
}
