package models;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;



public class Connector {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = Credenciales.URL;
	private static final String USER = Credenciales.USER;
	private static final String PASSWORD = Credenciales.PASSWORD;

	private static Connection conexion = null;

	// Create connection
	public Connector() {
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Server Connected");
		} catch(SQLException | ClassNotFoundException ex) {
			System.out.print("No se ha podido conectar con mi base de datos");
			System.out.println(ex);
		}
	}
	
	// Close connection
	public void closeConnection() {
		try {
			conexion.close();
			JOptionPane.showMessageDialog(null, "Se ha finalizado la conexion con el servidor");
		} catch (SQLException ex) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// Create database
	public void createDB(String dbName) {
		try {
			String kuery = " CREATE DATABASE IF NOT EXISTS " + dbName + " ;";
			Statement st = conexion.createStatement();
			System.out.println(kuery);
			st.executeUpdate(kuery);
			System.out.println("Se ha creado la base de datos " + dbName + " correctamente");
		} catch (SQLException ex) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	// Create table
	public void createTable(String nombreBBDD, String nombreTabla, String tablaColum) {
		try {
			String queryDb = "USE " + nombreBBDD + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDb);

			String query = "CREATE TABLE IF NOT EXISTS " + nombreTabla + " (" + tablaColum + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(query);

			System.out.println("Se ha creado la tabla " + nombreTabla + " correctamente");
		} catch (SQLException ex) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Error creando la tabla " + nombreTabla);
		}
	}

	// Insert table
	public void insert(String dbName, String tableName, String columns, String values) {
		try {
			String queryDb = "USE " + dbName + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDb);

			String query = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + values + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(query);

			System.out.println("Datos insertados correctamente en la tabla " + tableName);
		} catch (SQLException ex) {
			Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Error insertando datos en la tabla " + tableName);
		}
	}

	// Select
	public void select(String db, String table_name, String columnas) {
		String[] columna = columnas.split(",");

		try {
			String queryDb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(queryDb);

			String query = "SELECT * FROM " + table_name;
			Statement st = conexion.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(query);

			System.out.println("Has creado la tabla " + table_name + " con los siguientes valores:");
			while (resultSet.next()) {

				for (String valor : columna) {
					System.out.println(resultSet.getString(valor.trim()));
				}

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error en la adquisicion de datos");
		}
	}

	// Delete
	public void delete(String table_name_columna, String columna, String campo) {
		try {
			String query = "DELETE FROM " + table_name_columna + " WHERE " + columna + "= \"" + campo + "\"";
			Statement st = conexion.createStatement();
			st.executeUpdate(query);

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
		}
	}
}