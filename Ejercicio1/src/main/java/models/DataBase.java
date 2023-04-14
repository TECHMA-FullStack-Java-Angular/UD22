package models;

/**
 * @author Joan
 */
public class DataBase {

    public static Table cliente;
    public static String DBNAME = "servicios"; 

    public static void init() {
        Attribute[] attributes = {
            new Attribute("id",        "INT(11)", "NOT NULL AUTO_INCREMENT PRIMARY KEY"),
            new Attribute("Nombre",    "VARCHAR(250)", "NOT NULL"),
            new Attribute("Apellido",  "VARCHAR(250)", "NOT NULL"),
            new Attribute("Direccion", "VARCHAR(250)", "NOT NULL"),
            new Attribute("DNI",       "VARCHAR(250)", "DEFAULT NULL"),
            new Attribute("Fecha",     "DATE", "DEFAULT NULL"),
        };
        cliente = new Table("clientes", attributes, DBNAME);

        Connector.openConnection();
        Connector.createDB(DBNAME);
        cliente.createTable();
    }


    public static void main(String[] args) {
        init();
        cliente.insert(new String[]{"Nombre", "Apellido", "Direccion"}, 
                       new String[]{"anna","lapeyra","manila"});
        cliente.select();
    }



}
