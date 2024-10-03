import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maiorNumero =0;

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        while (numero != 0){
             if (numero > maiorNumero){
                 maiorNumero = numero;
             }
            System.out.println("Informe um número: ");
            numero = scan.nextInt();
        }
        System.out.println("Maior numero: "+maiorNumero);
    }
}


/*
Seção 7 - Exercício 1

Faça um algoritmo que determine o maior em N números. A condição de
parada é a entrada de um valor 0, ou seja, o algoritmo deve ficar
calculando o maior valor até que a entrada seja igual a 0 (zero).
*/