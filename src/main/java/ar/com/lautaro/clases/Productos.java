
package ar.com.lautaro.clases;

import java.util.Objects;


public class Productos implements Comparable <Productos>{
    // Campos
    private String nombre;
    private int precio;
    
    // Constructor vacio
    public Productos() {
    }
    
    // Constructor
    public Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // HashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.precio;
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
        final Productos other = (Productos) obj;
        if (this.precio != other.precio) {
            return false;
        }
        return true;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("Nombre= ").append(nombre);
        sb.append(", Precio= ").append(precio);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Productos o) {
        return this.getPrecio()-o.getPrecio();
    }

    
    
}
