package models;


/*
 * Esta clase es una forma genérica de representar tablas SQL
 * usable para otros ejercicios similares
 */
public class Table {
    public String name;
    public Attribute[] attributes;
    public final String DBNAME;

    Table(String name, Attribute[] attributes, String dbname) {
        this.name = name;
        this.attributes = attributes;
        this.DBNAME = dbname;
    }
    
	/**
	 * This method create table "clientes".
	 */
	public void createTable() {
        String[] attributeStrings = new String[attributes.length];
        for (int i = 0; i < attributes.length; i++) {
            attributeStrings[i] = attributes[i].toString();
        }
		Connector.createTable(DBNAME, name, String.join(", ", attributeStrings));
	}

    public void insert(String[] keys, String[] values) {
        Connector.insert(DBNAME, name, String.join(", ", keys), "'"+String.join("', '", values)+"'");
    }
	
}
