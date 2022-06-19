
package proyecto3_antvillage;

//Se importan las bibliotecas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Representa la clase donde se asignan las posiciones
 * @author Roger Solano
 */
public class Asignar_posiciones {
    private int [] posiciones;
        ArrayList <Integer> Tipoposiciones = new ArrayList <Integer>();
    
    //Asigna posiciones
    public Asignar_posiciones(){
        posiciones = new int[5];
        for (int i=1;i<=3;i++){
            Tipoposiciones.add(1);
        }for (int i=1;i<=1;i++){
            Tipoposiciones.add(2);
        }for (int i=1;i<=1;i++){
            Tipoposiciones.add(3); 
        }

    }
    
    //Recorre el largo de las posiciones
    public int[] dequeue() {

        int count = 0;
        int LargoLista = 5;
        for (int i=0;i<5;i++){
            Random RandomIndex = new Random();
            int index = RandomIndex.nextInt(LargoLista);
            this.posiciones[i] = Tipoposiciones.get(index);
            Tipoposiciones.remove(index);
            LargoLista--;
        }
        return this.posiciones;
        }

    //Llama a la funcion
    public static void main(String args[]){

        Asignar_posiciones p = new Asignar_posiciones();

    }
}
