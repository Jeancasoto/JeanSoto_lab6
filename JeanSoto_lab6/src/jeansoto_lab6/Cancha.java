
package jeansoto_lab6;


public class Cancha extends Lugar{
    String categoria;
    String estado;
    
    public Cancha() {
        super();
    }

     public Cancha(String categoria, String estado, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

      public Cancha(String categoria, String estado, String nombre, String direccion, String salida, int seguridad) {
        super(nombre, direccion, salida, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
}
