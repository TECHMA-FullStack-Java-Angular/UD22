package models;


// esta clase representa el atributo de una tabla de una BD
public class Attribute {
    public String name;
    public String type;
    public String type_cardinality = "";
    public String[] others = {};

    // example: JEFE CHARVAR(30) NOT NULL REFERENCES EMPLEADO
    //          name="ID", type="CHARVAR", type_cardinality="(30)", 
    //          others=["NOT", "NULL", "REFERENCES", "EMPLEADO"]


    Attribute(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Attribute(String name, String type, String type_cardinality) {
        this.name = name;
        this.type = type;
        this.type_cardinality = type_cardinality;
    }
    Attribute(String name, String type, String type_cardinality, String others) {
        this.name = name;
        this.type = type;
        this.type_cardinality = type_cardinality;
        this.others = others.split(others);
    }

    @Override
    public String toString() {
        return name + " " + type + type_cardinality + " " + String.join(" ", others);
    }
}
