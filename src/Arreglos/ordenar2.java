
import java.util.Scanner;


public class ordenar2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner ( System.in );
        int [] arreglo = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero: "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }
        System.out.println("Imprimir en creciente");
        for (int i = 0; i < arreglo.length ; i++) {
            System.out.print(arreglo[i]+" - ");
        }
    }
}
