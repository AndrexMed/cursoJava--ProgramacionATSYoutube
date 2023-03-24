/*
Ejercicio 7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente, o si están desordenados.
*/
import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] arreglo = new int [10];
        boolean creciente=false,decreciente=false;
        System.out.println("llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        
        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo [i+1]) { //creciente 1.2.3.4.5.6....
                creciente = true;
            }
            if (arreglo[i] > arreglo [i+1]) {  //decreciente 6.5.4.3.2.1....
                decreciente =true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("el arreglo esta en forma creciente");          
        }
        else if ( creciente == false && decreciente == true){
            System.out.println("el arreglo esta en forma decreciente");
        }
        else if(creciente == true && decreciente == true){
            System.out.println("el arreglo esta desordenado");
        }
        else if(creciente == false && decreciente == false){
            System.out.println("todos los numeros del arreglo son iguales");
        }
    }
}
