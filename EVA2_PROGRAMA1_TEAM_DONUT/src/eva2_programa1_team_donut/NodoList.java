package eva2_programa1_team_donut;

/**
 *
 * @author TEAM DONUT
 */
public class NodoList {

    private String dato; //VALOR
    private NodoList siguiente; //REFERENCIA

//CONSTRUCTORES
    public NodoList() {//DEFAULT
        this.siguiente = null;

    }

    public NodoList(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoList getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoList siguiente) {
        this.siguiente = siguiente;
    }

}
