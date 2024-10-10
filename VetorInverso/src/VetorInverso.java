import java.util.Arrays;
import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner scan =new Scanner(System.in);

        for (int i =0; i < 10; i++){
            System.out.println("informe os numeros do vetor: ");
            vetor[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(vetor));
        System.out.print("[");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }

        System.out.print("]");
    }
}
