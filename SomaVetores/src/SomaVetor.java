import java.util.Arrays;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] somaVetores = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os numeors do vetor 1: ");
            vetor1[i] = scan.nextInt();
            System.out.println("Informe os numeros do vetor 2: ");
            vetor2[i] = scan.nextInt();
            somaVetores[i] = vetor1[i] + vetor2[i];
        }


        System.out.println(Arrays.toString(vetor1));
        System.out.println(Arrays.toString(vetor2));
        System.out.println(Arrays.toString(somaVetores));
    }
}

/*
Seção 8 - Exercício 2

Escreva um algoritmo que leia dois vetores de 10 posições e faça a
soma dos elementos de mesmo índice, colocando o resultado em um terceiro
vetor. Mostre o vetor resultante.
*/
