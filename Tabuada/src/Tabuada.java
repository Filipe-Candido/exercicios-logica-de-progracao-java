import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero inteiro entre 1 e 10: ");
        int numero = scan.nextInt();

        while (numero < 1 || numero >10){
            System.out.println("Informe um numero inteiro entre 1 e 10: ");
            numero = scan.nextInt();
        }
        for ( int i = 1; i <= 10; i++){

            System.out.println(numero +"X" +i+"="+numero *i);

        }


    }
}


/*
Seção 7 - Exercício 6

Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar
de qual número ele deseja ver a tabuada. A saída deve ser conforme
o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/