
package proyecto3_antvillage;

/**
 *
 * @author pc
 */
public class List_posiciones {
    private Nodo head;
    private Nodo temp;
    
    public List_posiciones() {
        this.head = null;
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }
    
    public void insertLast(int ejeX, int ejeY,int tipo) {
        Nodo newNode = new Nodo();
        if (isEmpty()) {
            this.head = newNode;
            newNode.setcoordenadas(ejeX, ejeY);
            newNode.setTipoposiciones(tipo);
        } else {
            if (this.head.getNext()==null) {
                this.head.setNext(newNode);
                newNode.setTail(this.head);
                temp = newNode;
                newNode.setcoordenadas(ejeX, ejeY);
                newNode.setTipoposiciones(tipo);
            } else {
                newNode.setcoordenadas(ejeX, ejeY);
                newNode.setTipoposiciones(tipo);
                temp.setNext(newNode);
                newNode.setTail(temp);
                temp = newNode;
            }

        }

    }
    
    public void insertFinal(int ejeX, int ejeY){
        Nodo newNode = new Nodo();
        newNode.setcoordenadas(ejeX, ejeY);
        newNode.setTail(temp);
        temp.setNext(newNode);
    }
    
    public int[] ObtenerCoordenadas(int numposiciones) {
        Nodo posicionesTemp = this.head;
        for(int i=1;i <= numposiciones;i++) {
            if (posicionesTemp.getNext()==null){
                int [] coordenadaposiciones = new int []{posicionesTemp.getX(),posicionesTemp.getY()};
                return coordenadaposiciones;
            }
            else if (i==numposiciones) {
                int [] coordenadaposiciones = new int []{posicionesTemp.getX(),posicionesTemp.getY(),posicionesTemp.getTipoposiciones()}; 
                return coordenadaposiciones;
            } else {
                posicionesTemp = posicionesTemp.getNext();
            }
        }
        return null;
    }
}
