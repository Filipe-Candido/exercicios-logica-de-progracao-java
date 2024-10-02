import java.util.Scanner;

public class CalculoQuadradoNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o 1º: ");
        int numero1 = scan.nextInt();
        System.out.println("Informe o 2º: ");
        int numero2 = scan.nextInt();
        System.out.println("Informe o 3º: ");
        int numero3 = scan.nextInt();
        System.out.println("Informe o 4º: ");
        int numero4 = scan.nextInt();

        int quadrado1 = numero1*numero1;
        int quadrado2 = numero2*numero2;
        int quadrado3 = numero3*numero3;
        int quadrado4 = numero4*numero4;

        if (quadrado3 > 1000){
            System.out.println(quadrado3);
        } else {
            System.out.println(quadrado1);
            System.out.println(quadrado2);
            System.out.println(quadrado3);
            System.out.println(quadrado4);


        }
    }
}



/*
Seção 6 - Exercício 7

Desenvolva um algoritmo que:
a) leia 4 (quatro) números;
b) Calcule o quadrado de cada um;
c) Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
d) Caso contraŕio, imprima os valores lidos e seus respectivos quadrados;
*/