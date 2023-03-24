
import java.util.Scanner;

/*
Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo:
el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] arreglo = new int[10];
        
        //guardando los datos del arreglo
        System.out.println("Ingrese numeros para el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        int ultimo=arreglo[9]; //guardamos el ultimo num del arreglo en una variable para despues posicionarlo
        
        for (int i = 8; i >= 0; i--) { // anavanzar una posicion adelante del arreglo
            arreglo[i+1] = arreglo [i];
        }
        arreglo[0]=ultimo; // ponemeos el ultimo num ingresado como primero}        
        //imprimiendo los datos
        System.out.println("el nuevo arreglo es:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" elemento del arreglo: "+arreglo[i]);
        }
    }
}
