
public class NewClass1 {

    public static void main(String[] args) {
        int[] prueba = new int[3];
        float pruebados[] = {5,10,20};
        prueba[0]=5;
        prueba[1]=8;
        prueba[2]=9;
        System.out.println("prueba1");
        for (int i = 0; i < 3; i++) {
            System.out.println(prueba[i]);
        }
        System.out.println("prueba dos");
        for (int i = 0; i < 3; i++) {
            System.out.println(pruebados[i]);
        }
}
}