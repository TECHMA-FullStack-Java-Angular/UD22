package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joan
 * Esta clase es una forma genérica de representar tablas SQL
 * usable para otros ejercicios similares
 */
public class Table {
    public String name;
    public Attribute[] attributes;
    public int[] primary_key; //indexs de attributes que son la primary key
    public final String DBNAME;

    public Table(String name, Attribute[] attributes, int[] primary_key, String dbname) {
        this.name = name;
        this.attributes = attributes;
        this.primary_key = primary_key;
        this.DBNAME = dbname;
    }

    public String[] getAttributeNames() {
        String[] names = new String[attributes.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = attributes[i].name;
        }
        return names;
    }
    
	public void createTable() {
        String[] attributeStrings = new String[attributes.length];
        for (int i = 0; i < attributes.length; i++) {
            attributeStrings[i] = attributes[i].toString();
        }
		Connector.createTable(DBNAME, name, String.join(", ", attributeStrings));
	}

    public void insert(String[] columns, String[] values) {
        Connector.insert(DBNAME, name, String.join(", ", columns), "'"+String.join("', '", values)+"'");
    }

    public List<String[]> select() {
		ResultSet resultSet = Connector.select(DBNAME,name);
	    List<String[]> rows = new ArrayList<>();
	    try {
	        while (resultSet.next()) {
                String[] row = new String[attributes.length];
	            for (int i = 0; i < attributes.length; i++) {
                    row[i] = resultSet.getString(attributes[i].name);
                }
	            rows.add(row);
	        }
	    } catch (SQLException ex) {
	        System.out.println(ex.getMessage());
	        System.out.println("Error en la conversión de resultados a objetos Cliente");
	    }
	    return rows;
	}
	
}
