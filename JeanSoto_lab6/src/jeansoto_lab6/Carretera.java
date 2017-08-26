
package jeansoto_lab6;


public class Carretera {
    String numero;
    String distancia;
    String inicio;
    String fin;

    public Carretera() {
    }

    public Carretera(String numero, String distancia, String inicio, String fin) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
    
}
