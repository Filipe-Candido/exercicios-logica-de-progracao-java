import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();

        if (numero %2 == 0 ){
            System.out.println("Numero par:"+numero);

        }else{
            System.out.println("Numero impar:"+numero);
        }
    }

}









/*
Seção 6 - Exercício 3

Ler um número e verificar se ele é par ou ímpar. Quando for par
armazenar esse valor em 'p' e quando for ímpar armazená-lo em 'i'.
Exibir 'p' e 'i' no final do processamento.
*/
