
import java.util.Scanner;

/*

Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int arreglo[][],nFila,nColum; // Arreglo bidimensional(Matriz)
        System.out.println("Ingrese cantidad de filas");
        nFila=leer.nextInt();
         System.out.println("Ingrese cantidad de columnas");
        nColum=leer.nextInt();
        boolean simetrica = true;
        arreglo=new int[nFila][nColum];
        
        System.out.println("Llenar la matriz");
        for (int i = 0; i < nFila; i++) {
            for (int j = 0; j < nColum; j++) {
                System.out.println("Matriz["+i+"]["+j+"]: ");
                arreglo [i][j]=leer.nextInt();
            }
        }
        if (nFila==nColum) {
            int i,j;
                    i=0;
                    while (i<nFila && simetrica == true) {
                j=0;
                        while (j<i && simetrica == true) {
                            if (arreglo [i][j] != arreglo [j][i]) {
                                simetrica = false;
                            }
                            j++;
                        }
                        i++;
            }
            if (simetrica==true) {
                System.out.println("La matriz es simetrica");
            }
            else{
                System.out.println("la matriz no es simetrica");
            }
         
        } 
        
    }
}
