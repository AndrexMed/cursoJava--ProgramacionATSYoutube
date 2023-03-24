
import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Llenar matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                matriz[i][j] = leer.nextInt();
            }
        }

        //ordenar
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz.length; k++) {
                for (int l = 0; l < matriz.length ; l++) {
                    for (int m = 0; m < matriz.length ; m++) {
                        if (matriz[l][m] > matriz[l+1][m+1]) {
                            int aux = matriz[l][m];
                            matriz[l][m] = matriz[l+1][m+1];
                            matriz[l + 1][m + 1] = aux;
                        }
                    }
                }
            }
        }
        
        //imprimir
        System.out.println("datos ordenados");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]+" - ");
            }
            
        }
    }

    
}
