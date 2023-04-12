package models;

public class DataBase {

    public static Table cliente;
    public static String DBNAME = "proves_joan"; 
    //static public ArrayList<Table> tables; <- para futuros ejercicios con más de una tabla

    public static void init() {
        Attribute[] attributes = {
            new Attribute("id",        "INT", "(11)", "NOT NULL AUTO_INCREMENT PRIMARY KEY"),
            new Attribute("Nombre",    "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("Apellido",  "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("Direccion", "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("DNI",       "VARCHAR", "(250)", "DEFAULT NULL"),
            new Attribute("Fecha",     "DATE", "", "DEFAULT NULL"),
        };
        cliente = new Table("cliente", attributes, DBNAME);

        Connector.openConnection();
        Connector.createDB(DBNAME);
        cliente.createTable();
    }


    public static void main(String[] args) {
        init();
    }



}
