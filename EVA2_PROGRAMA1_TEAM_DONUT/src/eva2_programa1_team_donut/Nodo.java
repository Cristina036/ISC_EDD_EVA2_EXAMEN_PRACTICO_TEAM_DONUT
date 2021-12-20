package eva2_programa1_team_donut;

/**
 *
 * @author TEAM DONUT
 */
public class Nodo {

    private String dato; //VALOR
    private Nodo derecha; //REFERENCIA
    private Nodo izquierda;
    

//CONSTRUCTORES
    
    public Nodo() {//DEFAULT
        this.derecha = null;
        this.izquierda = null;

    }

    public Nodo(String dato) {
        this.dato = dato;
        this.derecha = null;
    }

    public String getDato() {
        return dato;
    }
    
    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getderecha() {
        return derecha;
    }
    public void setderecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    public void setizquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    public Nodo getizquierda() {
        return izquierda;
    }


}
