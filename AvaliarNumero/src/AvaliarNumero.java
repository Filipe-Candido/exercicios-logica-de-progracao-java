import java.util.Scanner;

public class AvaliarNumero {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = scan.nextInt();

        if (numero > 0){
            if (numero %2 ==0){
            System.out.println(numero+" Positivo Par");
            }else {
                System.out.println(numero + " Positivo impar");
            }
        }else {
            if (numero < 0 && numero %2 ==0){
                System.out.println(numero+" Negativo par");
        }else {
                System.out.println(numero + " Negativo impar ");
            }
        }



    }
}
/*
Seção 6 - Exercício 8

Faça um algoritmo que leia um número inteiro e mostre uma mensagem
indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/