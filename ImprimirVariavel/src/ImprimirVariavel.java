import java.util.Scanner;

public class ImprimirVariavel {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Infomre um numero para variavel:");
        int numero = scan.nextInt();

        if (numero >100){
            System.out.println(numero);
        }else {
            System.out.println("0");
        }
        }

    }




/*
Seção 6 - Exercício 1

Ler uma variável numérica n e imprimi-la somente se a mesma for
maior que 100, caso contrário imprimi-la com o valor zero.
*/