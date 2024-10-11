import java.util.Arrays;
import java.util.Scanner;

public class SomaElemento {
    public static void main(String[] args) {
        int [] vetor = new int[20];
        int soma =0;
        Scanner scan = new Scanner(System.in);



        for (int i =0; i< 20; i++){
            System.out.println("Informe os numeros :");
            vetor [i]= scan.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println("Soma posições: "+soma);
    }

}
/*
Seção 8 - Exercício 4

Escreva um algoritmo que leia e mostre um vetor de 20 elementos
inteiros, em seguida, mostre a soma de todos os elementos.
*/