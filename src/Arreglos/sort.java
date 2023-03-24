
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class sort {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a guardar"));
        
        int [] arreglo = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el numero: "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.println(""+arreglo[i]);
        }
    }
}
