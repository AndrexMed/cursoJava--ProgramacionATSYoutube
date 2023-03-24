
import java.util.Scanner;
import javax.swing.JOptionPane;


public class llenararreglo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite n Numero de arreglos"));
        String[] textos= new String [n];
        System.out.println("Digite los elementos del arreglo");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el texto: "+(i+1));
            textos[i]=leer.next();
        }
        System.out.println("\nLos textos son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(textos[i]+"-");
        }
    }
    
}
