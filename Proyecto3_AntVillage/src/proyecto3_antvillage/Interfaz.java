
package proyecto3_antvillage;

import java.awt.Color;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.SwingConstants.TOP;

/**
 * Esto representa la interfaz del programa 
 * @author Roger Solano
 */
public class Interfaz extends javax.swing.JFrame {

    static int close = 1;   // variable asociada al bucle donde se reciben los mensajes del jugador 2.
    static boolean botonEnabled = true; // estado del botón del dado.
    static List_posiciones coordenadas = new List_posiciones();
    static int recorrido = 0; // progreso de la ficha del jugador en el tablero
    //static Imagenes imagenes = new Imagenes();
    static String mensaje = "";

    static ServerSocket serverSocket;
    static Socket socket;
    static DataInputStream datoEntrada;
    static DataOutputStream datoSalida;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        H_azul = new javax.swing.JLabel();
        H_verde = new javax.swing.JLabel();
        N_azul = new javax.swing.JLabel();
        N_verde = new javax.swing.JLabel();
        Food = new javax.swing.JLabel();
        Food_2 = new javax.swing.JLabel();
        Food_3 = new javax.swing.JLabel();
        B_start = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        H_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/Hormiga_azul.png"))); // NOI18N

        H_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/Hormiga_verde.png"))); // NOI18N

        N_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/nido_azul.png"))); // NOI18N

        N_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/nido_verde.png"))); // NOI18N

        Food.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/Food.png"))); // NOI18N

        Food_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/Food_2.png"))); // NOI18N

        Food_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/Food_3.png"))); // NOI18N

        B_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto3_antvillage/images/B.start.png"))); // NOI18N
        B_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_startMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(Food_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(N_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(B_start, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(H_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(Food_2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(569, 569, 569)
                        .addComponent(H_verde, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(N_verde, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(666, 666, 666)
                        .addComponent(Food, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(Food_2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Food, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(B_start, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Food_3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(H_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(N_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(H_verde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N_verde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Detecta cuando se clickea el botón start
    private void B_startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_startMouseClicked
        // TODO add your handling code here:
        if (botonEnabled) {
            try {
                //recorrido += num; //se actualiza el progreso del jugador de acuerdo al número del dado obtenido

                    int[] coordenadasposiciones;
                    coordenadasposiciones = coordenadas.ObtenerCoordenadas(recorrido);  

                    if (recorrido >= 15) {
                        recorrido = 16;
                        //finalizarJuego();
                        coordenadasposiciones = coordenadas.ObtenerCoordenadas(recorrido);
                        H_verde.setLocation(coordenadasposiciones[0], coordenadasposiciones[1]);

                        return;
                        
                    }
                    //se cumple si la ficha del jugador se encuentra en una casilla de reto
                    if (coordenadasposiciones[2] == 1) {
                        coordenadasposiciones = coordenadas.ObtenerCoordenadas(recorrido);
                        H_verde.setLocation(coordenadasposiciones[0], coordenadasposiciones[1]);
                        return;

                        //se cumple si la ficha del jugador se encuentra en una casilla de trampa
                    } else if (coordenadasposiciones[2] == 2) {

                        //recorrido -= numTunel; //posiciones a retroceder (extra)
                        if (recorrido <= 0) {
                            recorrido = 0;
                            H_verde.setLocation(N_verde.getX(), N_verde.getY());
                        } else {
                            coordenadasposiciones = coordenadas.ObtenerCoordenadas(recorrido);
                            H_verde.setLocation(coordenadasposiciones[0], coordenadasposiciones[1]);
                        }

                    } else {

                        //recorrido += numTunel; //posiciones ha avanzar (extra)
                        coordenadasposiciones = coordenadas.ObtenerCoordenadas(recorrido);
                        H_verde.setLocation(coordenadasposiciones[0], coordenadasposiciones[1]);
                    }
                    // se envía una actualización del progreso del jugador 1 al jugador 2
                    String msjRecorrido = String.valueOf(recorrido);
                    datoSalida.writeUTF("es tu turno\n" + msjRecorrido);

                    botonEnabled = false;

        } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
               
    }//GEN-LAST:event_B_startMouseClicked
     public void finalizarJuego() {
        String msjRecorrido = String.valueOf(recorrido);
        close = 0;
        try {
            datoSalida.writeUTF("fin del juego\n" + msjRecorrido);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoEntrada.close();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            datoSalida.close();

        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

        botonEnabled = false;
 
        return;
    }   
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
        
        try {
            serverSocket = new ServerSocket(1201);
            socket = serverSocket.accept();
            datoEntrada = new DataInputStream(socket.getInputStream());
            datoSalida = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JLabel[] posiciones = new JLabel[]{H_azul, H_verde, Food, Food_2, Food_3, N_azul, N_verde};
        int PassNombre=0;
        
        while (close == 1) {
            try {
                mensaje = datoEntrada.readUTF();
            } catch (java.net.SocketException ex) {
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);

               
            }if (PassNombre==0){
                PassNombre=1;
                Interfaz2=mensaje;
                LabelNombres.setAlignmentY(CENTER_ALIGNMENT);
                LabelNombres.setAlignmentX(LEFT_ALIGNMENT);
                LabelNombres.setText("<html>Tú:<p>"+Interfaz+"<p>Rival:<p>"+Interfaz2+"<p></html>");
            }
            //se asignan el tipo de casilla aleatorio con su imagen respectiva recibidas del jugador 2
            else if (mensaje.equals("casilla")) {

                for (int i = 0; i <= posiciones.length; i++) {
                    if (i != posiciones.length) {
                        try {
                            mensaje = datoEntrada.readUTF();
                        } catch (java.io.EOFException ex) {
                            Logger.getLogger(Interfaz2.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException e) {

                        }
    }
     
    
           int index = Integer.parseInt(mensaje);
                   JLabel posiciones = posiciones[i];

                   switch (index) {
                        case 1:
                            coordenadas.insertLast(posiciones.getX(), posiciones.getY(), index);
                            posiciones.setIcon(imagenes.CasillaReto);
                            break;
                        case 2:
                            coordenadas.insertLast(posiciones.getX(), posiciones.getY(), index);
                            posiciones.setIcon(imagenes.CasillaTrampa);
                            break;
                        case 3:
                            coordenadas.insertLast(posiciones.getX(), posiciones.getY(), index);
                            posiciones.setIcon(imagenes.CasillaTunel);
                            break;
                    }
                } else {
                    coordenadas.insertFinal(N_verde.getX(), N_verde.getY());
                }
                
          }
            } else {
               // condición que se cumple cuando ya se sabe quien es el jugador que comienza a jugar
                if (mensaje.equals("iniciar")) {

                    MainPanel.setVisible(false);
                    PanelJuego.setVisible(true);
                    mensaje = "";

                } else if (mensaje.equals("otra vez")) {
                    buttonDado.setEnabled(true);
                    botonEnabled = true;
                    Dado.setIcon(imagenes.CasillaZero);
                    recorrido = 0;
                    valorDado = 0;

                    // se cumple cuando el jugador 2 ya ha tirado su turno del dado
                } else if (mensaje.equals("es tu turno")) {
                    buttonDado.setEnabled(true);
                    botonEnabled = true;
                    valorDado = 1;
} else {
                    //se obtiene dos mensajes enviados por el jugador 2 y se guardan en un arreglo
                    String[] msjAvance = mensaje.split("\n");
                    if (mensaje.equals("")) {
                        H_azul.setLocation(H_azul.getX() + 20, H_azul.getY());

                        //se cumple cuando el jugador 2 ha contestado bien a su pregunta de reto
                    } else if (mensaje.equals("correcto")) {
                        H_azul.setLocation(H_azul.getX(), H_azul.getY());
                        buttonDado.setEnabled(true);
                        LabelPregunta.setText("Respuesta correcta");
                        botonEnabled = true;

                        //se muestra la pregunta que se le asignó al jugador 2
                    } else if (msjAvance[1].equals("pregunta")) {
                        LabelPregunta.setVisible(true);
                        LabelPregunta.setVerticalAlignment(CENTER);
                        LabelPregunta.setText("<html>¡Reto para Oponente!<p><p>" + msjAvance[0] + "<p></html>");

                    } else {

                        int AvanceFicha2 = Integer.parseInt(msjAvance[1]);

                        if (AvanceFicha2 <= 0) {
                            H_azul.setLocation(CInicio.getX() + 20, CInicio.getY());
                            buttonDado.setEnabled(true);
                            botonEnabled = true;
                            
                        } else if (msjAvance[0].equals("esperando")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            H_azul.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);

                            //se cumple cuando el jugador 2 ha ganado
                        } else if (msjAvance[0].equals("fin del juego")) {
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            fichaJugador2.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            LabelPregunta.setVisible(true);
                            LabelPregunta.setVerticalAlignment(TOP);
                            LabelPregunta.setText("<html>¡Fin del Juego!<p><p>!Has perdido!<p></html>");
                            buttonDado.setEnabled(false);
                            botonEnabled = false;
                            salirFin.setVisible(true);
                            salirFin.setLocation(botonRespuesta.getX(), botonRespuesta.getY());
                            try {
                                socket.close();
                            } catch (IOException ex) {
                            }
                            try {
datoSalida.close();
                            } catch (IOException ex) {
                            }
                            try {
                                datoEntrada.close();
                            } catch (IOException ex) {
                            }
                            try {
                                serverSocket.close();
                            } catch (IOException e) {

                            }
                            return;

                            /* se actualiza el progreso del jugador 2 o si el otro jugador responde de forma incorrecta 
                            la pregunta de reto*/
                        } else {
                            LabelPregunta.setText("Respuesta incorrecta");
                            int[] coordenadasCasilla;
                            coordenadasCasilla = coordenadas.ObtenerCoordenadas(AvanceFicha2);
                            H_azul.setLocation(coordenadasCasilla[0] + 20, coordenadasCasilla[1]);
                            buttonDado.setEnabled(true);
                            botonEnabled = true;
}

                    }

                }
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_start;
    private javax.swing.JLabel Food;
    private javax.swing.JLabel Food_2;
    private javax.swing.JLabel Food_3;
    private javax.swing.JLabel H_azul;
    private javax.swing.JLabel H_verde;
    private javax.swing.JLabel N_azul;
    private javax.swing.JLabel N_verde;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
