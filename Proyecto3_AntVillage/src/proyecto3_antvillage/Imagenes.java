
package proyecto3_antvillage;

import javax.swing.ImageIcon;

/**
 *
 * @author pc
 */
public class Imagenes {
    
    ImageIcon N_azul= new ImageIcon("nido_azul.png");
    ImageIcon N_verde = new ImageIcon("nido_verde.png");
    ImageIcon H_azul = new ImageIcon("Hormiga_azul.png");
    ImageIcon H_verde = new ImageIcon("Hormiga_verde.png");
    ImageIcon Food = new ImageIcon("Food.png");
    ImageIcon Food_2 = new ImageIcon("Food_2.png");
    ImageIcon Food_3 = new ImageIcon("Food_3.png");
    ImageIcon B_start = new ImageIcon("B.start.png");
    
    public ImageIcon N_azul(){
       return  N_azul;
    }

    public ImageIcon N_verde(){
       return  N_verde;
    }
    /**
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon H_azul(){
       return  H_azul;
    }
  
    public ImageIcon H_verde(){
       return  H_verde;
    }
  
    public ImageIcon Food(){
       return Food;
    }
   
    public ImageIcon Food_2(){
       return Food_2;
    }

    public ImageIcon Food_3(){
       return Food_3;
    }
    /**
     * Retorna la imagen de la casilla neutra o cero.
     * @return retornar la imagen del dado correspondiente.
     */
    public ImageIcon B_start(){
       return B_start;
    }
    
}
