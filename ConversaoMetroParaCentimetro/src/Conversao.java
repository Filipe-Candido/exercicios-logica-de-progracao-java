import java.util.Scanner;

public class Conversao {


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade em metros: ");
        float metros = scan.nextFloat();

        float conversaoCm = metros *100;

        System.out.printf("%.2f m = %.2f cm%n", metros, conversaoCm);
        scan.close();
    }
}
/*
Seção 3 - Exercício 5

Faça um algortimo que converta metros para centímetros.

1 metro == 100 centímetros


"converte metros para centímetros"*/
