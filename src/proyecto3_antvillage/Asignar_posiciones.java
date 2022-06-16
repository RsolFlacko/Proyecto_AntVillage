
package proyecto3_antvillage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pc
 */
public class Asignar_posiciones {
    private int [] posiciones;
        ArrayList <Integer> Tipoposiciones = new ArrayList <Integer>();
    
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

    public static void main(String args[]){

        Asignar_posiciones p = new Asignar_posiciones();

    }
}
