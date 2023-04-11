/**
 * 
 */
package models;

/**
 * @author Javier
 *
 */
public class Cliente {
	
	// Atributes
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;
	
	private static final Connector CONNEXION = new Connector();
	private static final String DBNAME = "servicios";
	private static final String TBNAME = "clientes";
	
	// Constructor
	public Cliente() {
		
	}
	
	public Cliente(String nombre, String apellido, String direccion, int dni, String fecha) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}

	// Methods
	/**
	 * This method create de database if exists.
	 */
	public void createDatabase() {
		CONNEXION.createDB(DBNAME);
	}
	
	/**
	 * This method create table "clientes".
	 */
	public void createTable() {
		CONNEXION.createTable(DBNAME, TBNAME, 
				  "id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,"
				+ "nombre VARCHAR(250) NOT NULL,"
				+ "apellido VARCHAR(250) NOT NULL,"
				+ "direccion VARCHAR(250) NOT NULL,"
				+ "dni INT(11) DEFAULT NULL,"
				+ "fecha DATE DEFAULT NULL");
	}
	
	/**
	 * This method insert data into database.
	 */
	public void insert() {
		CONNEXION.insert(DBNAME, TBNAME, 
				"nombre, apellido, direccion, dni, fecha", 
				"'" + this.nombre + "', '" + this.apellido + "', '" + this.direccion + "', " + this.dni + ", '" + this.fecha + "'");
	}
}
