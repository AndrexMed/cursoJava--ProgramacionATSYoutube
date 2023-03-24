

import java.util.Scanner;

public class MetodoBurbuja {

    public static void main(String args[]) {

        int arreglo[] = new int[5];
        int auxiliar = 0;
        Scanner leer = new Scanner(System.in);


        //introducir valores desde teclado

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el numero "+(i+1));
            arreglo[i] = leer.nextInt();
            System.out.println("");
        }

        //Aplicando el metodo de la burbuja

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }

        //Mostrando los datos ordenados
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

    }
}
