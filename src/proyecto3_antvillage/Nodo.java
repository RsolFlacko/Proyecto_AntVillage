
package proyecto3_antvillage;

/**
 *
 * @author pc
 */
public class Nodo {
    private int X;
    private int Y;
    public Nodo next;
    private Nodo tail;
    private int tipoposiciones;
    
    public Nodo() {
        this.X = 0;
        this.Y = 0;
        this.next = null;
        this.tail = null;
        this.tipoposiciones=0;
    }
    
    public void setcoordenadas(int ejeX,int ejeY) {
        this.X = ejeX;
        this.Y = ejeY;
    
    /**
     *
     * @param tipo
     */
    public void setTipoposiciones(int tipo){
        this.tipoposiciones=tipo;
    }
    
    public int getTipoposiciones(){
        return this.tipoposiciones;
    }
    
    public int getX() {
            return this.X;
        }
    
    public int getY() {
            return this.Y;
        }
    
    public void setNext(Nodo Node) {
            this.next = Node;
        }
    
    public Nodo getNext() {
            return this.next;
        }
    
    public void setTail(Nodo Node) {
        this.tail = Node;
    }
    
    public Nodo getTail() {
        return this.tail;
    }
}
