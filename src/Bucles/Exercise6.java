/*
Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise6 {

    public static void main(String[] args) {
        int numero, sumaPOS = 0, sumaNEG = 0, countCEROS = 0, countPOS = 0, countNEG = 0;
        float mediaPOS = 0, mediaNEG = 0;

        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("**** INSERT A NUMBER " + (i + 1) + " *****"));

            if (numero == 0) {
                countCEROS++;
            } else if (numero > 0) {
                sumaPOS = sumaPOS + numero;
                countPOS++;
            } else {
                sumaNEG = sumaNEG + numero;
                countNEG++;
            }
        }

        //Tratamos con los positivos
        if (countPOS == 0) {
            System.out.println("***** ERROR -- NO SE PUEDE SACAR LA MEDIA DE LOS POSITIVOS *****");
        } else {
            mediaPOS = (float) sumaPOS / countPOS;
            System.out.println("***** LA MEDIA DE LOS POSITIVOS ES: " + mediaPOS);
        }

        //Tratamos con los negativos
        if (countNEG == 0) {
            System.out.println("***** ERROR -- NO SE PUEDE SACAR LA MEDIA DE LOS NEGATIVOS");
        } else {
            mediaNEG = (float) sumaNEG / countNEG;
            System.out.println("***** LA MEDIA DE LOS NEGATIVOS ES: " + mediaNEG);
        }

        System.out.println("***** CANTIDAD DE CEROS: " + countCEROS);
    }
}
