
package proyecto3_antvillage;

/**
 * Clase donde se crea el nodo
 * @author Roger Solano
 */
public class Nodo {
    private int X;
    private int Y;
    public Nodo next;
    private Nodo tail;
    private int tipoposiciones;
    
    //Se llaman las variables
    public Nodo() {
        this.X = 0;
        this.Y = 0;
        this.next = null;
        this.tail = null;
        this.tipoposiciones=0;
    }
    
    //Se llama las coordenadas
    public void setcoordenadas(int ejeX,int ejeY) {
        this.X = ejeX;
        this.Y = ejeY;
    }
    /**
     *Define el tipo de posiciones
     * @param tipo
     */
    public void setTipoposiciones(int tipo) {
        this.tipoposiciones=tipo;
    }
    
    //Obtiene las posiciones
    public int getTipoposiciones(){
        return this.tipoposiciones;
    }
    
    //Obtiene el X
    public int getX() {
            return this.X;
        }
    
    //Obtiene el Y
    public int getY() {
            return this.Y;
        }
    
    //Define el siguiente nodo
    public void setNext(Nodo Node) {
            this.next = Node;
        }
    
    //Obtiene el siguiente nodo
    public Nodo getNext() {
            return this.next;
        }
    
    //Define la cola
    public void setTail(Nodo Node) {
        this.tail = Node;
    }
    
    //Obtiene la cola
    public Nodo getTail() {
        return this.tail;
    }
}
