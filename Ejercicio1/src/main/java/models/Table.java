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
    public final String DBNAME;

    public Table(String name, Attribute[] attributes, String dbname) {
        this.name = name;
        this.attributes = attributes;
        this.DBNAME = dbname;
    }

    // retorna un array con los nombres de los atributos
    public String[] getAttributeNames() {
        String[] names = new String[attributes.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = attributes[i].name;
        }
        return names;
    }
    
    // crea la tabla
	public void createTable() {
        String[] attributeStrings = new String[attributes.length];
        for (int i = 0; i < attributes.length; i++) {
            attributeStrings[i] = attributes[i].toString();
        }
		Connector.createTable(DBNAME, name, String.join(", ", attributeStrings));
	}

    // inserta un registro con los valores `values` en las respectivas columnas `columns`
    public void insert(String[] columns, String[] values) {
        Connector.insert(DBNAME, name, String.join(", ", columns), "'"+String.join("', '", values)+"'");
    }

    // retorna una matriz con todos los elementos
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

    // elimina el registro cuyos valores (de todas las columnas) son `values`
    public void delete(String[] values) {
        Connector.delete(DBNAME, name,
            "("+String.join(", ", getAttributeNames())+")", 
            "('"+String.join("', '", values)+"')"
        );
    }

    // modifica el registro cuyos valores (de todas las columnas) son `current_values`
    // asigna valores `new_values` a las respectivas columnas `new_values`
    public void update(String[] current_values, String[] columns_to_update, String[] new_values) {
        int n = columns_to_update.length;
        String[] changes = new String[n];
        for (int i = 0; i < n; i++) {
            changes[i] = columns_to_update[i] + " = '" + new_values[i] + "'";
        }
        Connector.update(DBNAME, name, 
            "("+String.join(", ", getAttributeNames())+")",
            "('"+String.join("', '", current_values)+"')",
            String.join(", ", changes)
        );
    }
	
}
