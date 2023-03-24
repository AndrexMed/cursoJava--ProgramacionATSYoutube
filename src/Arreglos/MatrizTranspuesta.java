import java.util.Scanner;
public class MatrizTranspuesta {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int matriz[][] = new int [3][3];
        System.out.println("Llene la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz["+i+"]["+j+"]:");
                matriz[i][j]=in.nextInt();
            }
        }
        
        System.out.println("Matriz Igresada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        //Intercambiando la matriz
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        System.out.println("Matriz transpuesta");
        //Matriz transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
