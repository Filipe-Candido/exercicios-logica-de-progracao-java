import java.util.Arrays;
import java.util.Scanner;

public class VetorNumeroReal {
    public static void main(String[] args) {
        float[] vetor = new float[5];
        int codigoNumerico = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o códido númerico: 0, 1 ou 2");
        codigoNumerico = scan.nextInt();
        if (codigoNumerico != 0 && codigoNumerico <=2) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Informe os numeros reais separados por virgulas: ");
                vetor[i] = scan.nextFloat();
            }
            if (codigoNumerico == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(vetor[i]);
                }
            }
            if (codigoNumerico == 2) {
                for (int i = vetor.length - 1; i >= 0; i--) {
                    System.out.print("\n"+vetor[i]);

                }

            }
        }
    }
}
/*
Seção 8 - Exercício 6

Faça um programa que receba um código numérico e um vetor de cinco posições de
números reais. Se o código for 0 (zero), termine o programa. Se o código for 1,
mostre o vetor na ordem direta. Se o código for 2, mostre o vetor na ordem inversa.
*/