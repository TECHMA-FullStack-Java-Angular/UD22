package models;

/**
 * @author Joan
 * 
 */
public class DataBase {

    // para ser consistente con ListSelect_Controller una tabla que es referenciada por otra
    // debe tener una sola Primary Key, que tiene que ser el primer areibuto

    public static String DBNAME = "UD22_EJ2"; 
    public static Table clientes;
    public static Table videos;

    public static void init() {
        Attribute[] att_cliente = {
            new Attribute("id",        "INT(11)", "NOT NULL AUTO_INCREMENT PRIMARY KEY"),
            new Attribute("nombre",    "VARCHAR(250)", "NOT NULL"),
            new Attribute("apellido",  "VARCHAR(250)", "NOT NULL"),
            new Attribute("direccion", "VARCHAR(250)", "NOT NULL"),
            new Attribute("dni",       "VARCHAR(250)", "DEFAULT NULL"),
            new Attribute("fecha",     "DATE", "DEFAULT NULL"),
        };
        clientes = new Table("clientes", att_cliente, DBNAME);
        Attribute[] att_video = {
            new Attribute("id",       "INT(11)", "NOT NULL AUTO_INCREMENT PRIMARY KEY"),
            new Attribute("titulo",   "VARCHAR(250)", "DEFAULT NULL"),
            new Attribute("director", "VARCHAR(250)", "DEFAULT NULL"),
            new Attribute("cli_id",    "INT(11)", "DEFAULT NULL REFERENCES clientes(id)")
        };
        videos = new Table("videos", att_video, DBNAME);

        Connector.openConnection();
        Connector.createDB(DBNAME);
        clientes.createTable();
        videos.createTable();
    }


}
