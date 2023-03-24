
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float prueba[] = new float [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el numero "+(i+1 ));
            prueba[i]=leer.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float i : prueba){// for mejorado
            System.out.println(i);
        }
    }
}
