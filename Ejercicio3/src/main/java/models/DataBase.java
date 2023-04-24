package models;

/**
 * @author Joan
 * 
 */
public class DataBase {

    // para ser consistente con ListSelect_Controller una tabla que es referenciada por otra
    // debe tener una sola Primary Key, que tiene que ser el primer areibuto

    public static String DBNAME = "UD22_EJ3"; 
    public static Table cientificos;
    public static Table proyectos;
    public static Table asignaciones;

    public static void init() {
        cientificos = new Table(
            "cientificos", 
            new Attribute[] {
                new Attribute("dni", "varchar(9) primary key"),
                new Attribute("nom_apels", "nvarchar(255)"),
            }, 
            new String[] {}, 
            DBNAME
        );
        proyectos = new Table(
            "proyectos", 
            new Attribute[] {
                new Attribute("id", "int auto_increment primary key"),
                new Attribute("nombre", "nvarchar(255)"),
                new Attribute("horas", "int"),
            },
            new String[] {}, 
            DBNAME
        );
        asignaciones = new Table(
            "asignaciones", 
            new Attribute[] {
                new Attribute("cientifico", "varchar(8)"),
                new Attribute("proyecto", "int"),
            },
            new String[] {
                "primary key(cientifico, proyecto)",
                "foreign key fk1(cientifico) references cientificos(dni)",
                "foreign key fk2(proyecto) references proyectos(id)",
            }, 
            DBNAME
        );

        Connector.openConnection();
        Connector.createDB(DBNAME);
        cientificos.createTable();
        proyectos.createTable();
        asignaciones.createTable();
    }

}
