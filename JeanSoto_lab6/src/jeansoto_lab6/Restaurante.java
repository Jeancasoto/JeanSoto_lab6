
package jeansoto_lab6;


public class Restaurante extends Lugar{
    String categoria;
    int calificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String categoria, int calificacion, String nombre, String direccion, String salida, int seguridad) {
        super(nombre, direccion, salida, seguridad);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
}
