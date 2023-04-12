/**
 * 
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Javier
 *
 */
public class Cliente {
	
	// Atributes
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private Date fecha;
	
	private static final Connector CONNEXION = new Connector();
	private static final String DBNAME = "servicios";
	private static final String TBNAME = "clientes";
	
	// Constructor	
<<<<<<< HEAD
	public Cliente(int id, String nombre, String apellido, String direccion, int dni, Date fecha) {
=======
	public Cliente() {	
	}
	
	public Cliente(int id, String nombre, String apellido, String direccion, int dni, String fecha) {
>>>>>>> 0dfe5ccb6cb027ce1d62b135ceb21a8496cfc306
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
		
		createDatabase();
		createTable();
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
	
	/*
	 * This method select data.
	 */
	public List<Cliente> select() {
		ResultSet resultSet = CONNEXION.select(DBNAME,TBNAME);
	    List<Cliente> clientes = new ArrayList<>();
	    try {
	        while (resultSet.next()) {
	            Cliente c = new Cliente(
	            	resultSet.getInt("id"),
	            	resultSet.getString("nombre"),
	            	resultSet.getString("apellido"),
	            	resultSet.getString("direccion"),
	            	resultSet.getInt("dni"),
	            	resultSet.getDate("fecha"));
	            clientes.add(c);
	        }
	    } catch (SQLException ex) {
	        System.out.println(ex.getMessage());
	        System.out.println("Error en la conversión de resultados a objetos Cliente");
	    }
	    return clientes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
