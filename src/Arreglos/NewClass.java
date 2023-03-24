/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la 
tabla continúe ordenada.*/
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numeros[] = new int [10]; // declaracion del array
        boolean creciente = true;
        int numero,sitio_num=0,j=0;
        //llenando el arreglo con los 5 num solicitados
        System.out.println("Llenar el arreglo");
        do {            
            for (int i = 0; i < 5; i++) {   // llenando el arreglo 
                System.out.println("Ingrese el numero "+(i+1));
                numeros[i]=leer.nextInt();
            }
            //comprobar si el arreglo esta ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if (numeros[i] < numeros[i+1]) { // Creciente 1-2-3...
                    creciente = true;
                }
                if (numeros[i] > numeros [i+1]) { //Decreciente 3-2-1...
                    creciente = false;
                    break;
                } 
            }
            if (creciente == false ) {
                System.out.println("Vuelva ingresar los numeros en orden creciente");
            }
        } while (creciente == false);
        
        System.out.println("ingrese un elemento a insertar");
        numero = leer.nextInt();
        
        //esto es para darnos cuenta en que posicion va el numero
        while (numeros[j] < numero && j <5) {
            sitio_num++;
            j++;
        }
        
        //por ultimo trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for (int i = 4; i >= sitio_num ; i--) {
            numeros[i+1] = numeros[i];
        }
        
        //insertamos el numero
        numeros[sitio_num] = numero;
        
        System.out.println("el arreglo queda la sgte manera");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i]+" - ");
        }
        System.out.println();
    }
}
