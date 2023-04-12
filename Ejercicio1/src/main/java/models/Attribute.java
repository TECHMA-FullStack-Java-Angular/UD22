package models;


// esta clase representa el atributo de una tabla de una BD
public class Attribute {
    public String name;
    public String type;
    public String[] others = {};

    // example: JEFE CHARVAR(30) NOT NULL REFERENCES EMPLEADO
    //          name="JEFE", type="CHARVAR", type_cardinality="(30)", 
    //          others=["NOT", "NULL", "REFERENCES", "EMPLEADO"]


    Attribute(String name, String type) {
        this.name = name;
        this.type = type;
    }
    Attribute(String name, String type, String others) {
        this.name = name;
        this.type = type;
        this.others = others.split(others);
    }

    @Override
    public String toString() {
        return name + " " + type + " " + String.join(" ", others);
    }
}
