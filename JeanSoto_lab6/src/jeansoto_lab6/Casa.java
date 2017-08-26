
package jeansoto_lab6;


public class Casa extends Lugar{

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, String salida, int seguridad) {
        super(nombre, direccion, salida, seguridad);
    }
    public Casa(String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
    }
}
