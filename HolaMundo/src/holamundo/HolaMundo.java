/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author DIEGO
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Empezando con Java");
        System.out.println("\n\t\tCurso de Java"); 
        System.out.println("");
    }
    
}
/*mport java.util.*;

public class Euroscompleto {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaro variable que contendra el valor a devolver

        double importe = 0;

        do {
            try {
                System.out.print("Ingresa el cambio a devolver:");

                importe = sc.nextDouble();

            } catch (Exception e) {

                System.out.println("Introduciste un dato erroneo.");

                System.out.println("");

                sc.nextLine();
            }
        }

        while (importe <= 0);

        calcular(importe);
        sc.close();
    }

    // Método para calcular
    public static void calcular(double importe) {

        // Indicamos todas las monedas posibles

        double[] monedas = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01 };

        // Creamos un array con 0 de longitud igual a la cantidad de monedas

        // Este array contendra las monedas a devolver

        double[] devolver = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // Recorremos todas las monedas

        for (int i = 0; i < monedas.length; i++) {

            // Si el importe actual, es superior a la moneda

            if (importe >= monedas[i]) {

                // obtenemos cantidad de monedas

                devolver[i] = Math.floor(importe / monedas[i]);

                // actualizamos el valor del importe que nos queda por didivir

                importe = importe - (devolver[i] * monedas[i]);
            }
        }

        // Bucle para mostrar el resultado

        for (int i = 0; i < monedas.length; i++) {

            if (devolver[i] > 0) {

                if (monedas[i] > 2) {

                    // Indicamos que es un billete
                    System.out.println("Hay " + devolver[i] + " billetes de: " + monedas[i] + " Euros");

                } else {

                    // Indicamos que es una moneda
                    System.out.println("Hay " + devolver[i] + " monedas de: " + monedas[i] + " Euros");
                }
            }
        }
    }
}*/