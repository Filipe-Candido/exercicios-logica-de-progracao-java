import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = scan.nextInt();

        if (numero > 0) {

            int a = numero;
            System.out.println("Positivo "+a);
        }else {

            int b = numero;
            System.out.println("Negativo "+b);
        }
    }


}
/*
Seção 6 - Exercício 2

Elabore um algoritmo que leia um número. Se positivo, armazene-o em 'a',
se for negativo, em 'b'. No final mostrar o resultado.
*/
