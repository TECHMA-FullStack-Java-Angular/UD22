package models;

// en futuros ejercicios esta clase podrá contener más de una tabla
public class TablaCliente {
    public Table tabla;

    public TablaCliente() {
        Attribute[] attributes = {
            new Attribute("id",        "INT", "(11)", "NOT NULL AUTO_INCREMENT PRIMARY KEY"),
            new Attribute("Nombre",    "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("Apellido",  "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("Direccion", "VARCHAR", "(250)", "NOT NULL"),
            new Attribute("DNI",       "VARCHAR", "(250)", "DEFAULT NULL"),
            new Attribute("fecha",     "DATE", "", "DEFAULT NULL"),
        };
        tabla = new Table("cliente", attributes);
        tabla.createTable();
    }

    


}
