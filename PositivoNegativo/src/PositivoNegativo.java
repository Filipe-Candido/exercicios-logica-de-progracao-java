import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = scan.nextInt();

        if (numero > 0) {


            System.out.println("Positivo "+numero);
        }else {


            System.out.println("Negativo "+numero);
        }
    }


}
/*
Seção 6 - Exercício 2

Elabore um algoritmo que leia um número. Se positivo, armazene-o em 'a',
se for negativo, em 'b'. No final mostrar o resultado.
*/
