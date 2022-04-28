
package ar.com.lautaro.clases;

import java.util.Objects;

public class Empleados {
    // Campos
    private int id;
    private String nombre;
    
    // Constructor vacio
    public Empleados() {
    }
    
    // Constructor
    public Empleados(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getter y Setter
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
    
    // HashCode
    @Override    
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }
    @Override    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleados other = (Empleados) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleados{");
        sb.append("id= ").append(id);
        sb.append(", Nombre= ").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
}
