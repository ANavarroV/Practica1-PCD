/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Random;

/**
 *
 * @author ANTONIO
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cola cola = new Cola(4);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int opcion = random.nextInt(2);

            try {

                if (opcion == 0) {
                    Object elemento = cola.desacola();
                    System.out.println("Iteracion " + i + ": se extrae " + elemento);

                } else {
                    cola.acola(i);
                    System.out.println("Iteracion " + i + ": se inserta " + i);
                    
                }

            } catch (Exception e) {
                System.out.println("Iteracion " + i + ": " + e.getMessage());
            }
        }

    }

}
