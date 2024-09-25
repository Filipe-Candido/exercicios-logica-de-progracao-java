import java.util.Scanner;

public class SomarNumero {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Infomre o primeiro numero:");
        int numero1 = scan.nextInt();

        System.out.println("Informe o segundo numero");
        int numero2 = scan.nextInt();

        int soma =numero1 + numero2;
        int multiplicacao = soma * numero1;
        System.out.println("Resultado:"+multiplicacao);

        scan.close();

    }
}


/*
Faça um algoritmo para somar dois números
e multiplicar o resultado pelo primeiro número.
*/