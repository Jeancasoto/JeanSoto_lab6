package jeansoto_lab6;

import java.util.ArrayList;

public class Lugar {

    String nombre;
    String direccion;
    String salida;
    int seguridad;
    ArrayList <String>entradas = new ArrayList();

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.seguridad = seguridad;
    }

    public Lugar(String nombre, String direccion, String salida, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salida = salida;
        this.seguridad = seguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public ArrayList getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList entradas) {
        this.entradas = entradas;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
