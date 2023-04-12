package models;


/*
 * Esta clase es una forma genérica de representar tablas SQL
 * usable para otros ejercicios similares
 */
public class Table {
    private String name;
    private Attribute[] attributes;
    //TODO: foregin keys

    Table(String name, Attribute[] attributes) {
        this.attributes = attributes;
        this.name = name;
    }
    
    public Attribute[] getAttributes() {
        return attributes;
    }

    public void createTable() {
        
    }

}
