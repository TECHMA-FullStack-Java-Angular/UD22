package models;

/**
 * @author Joan
 * esta clase representa el atributo de una tabla de una BD
 */
public class Attribute {
    public String name;
    public String suffix;

    // example: JEFE CHARVAR(30) NOT NULL
    //          name="JEFE", suffix="CHARVAR(30) NOT NULL"


    Attribute(String name, String suffix) {
        this.name = name;
        this.suffix = suffix;
    }

    @Override
    public String toString() {
        return name + " " + suffix;
    }
}
