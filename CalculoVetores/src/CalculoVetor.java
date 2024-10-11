import java.util.Arrays;
import java.util.Scanner;

public class CalculoVetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        boolean maior50 = false;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Infomre um numero:");
            vetor[i] = scan.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 50) {
                System.out.println("Numero: "+vetor[i]+" posição "+i);
                maior50 = true;
            }

            }if (!maior50){
            System.out.println("Não atende aos requisitos");


        }
    }

}

/*
Seção 8 - Exercício 5

Faça um programa que carregue um vetor com dez números inteiros.
Calcule e mostre os números superiores a 50 e suas respectivas
posições. Mostrar mensagem se não existir nenhum número nesta
condição.
*/