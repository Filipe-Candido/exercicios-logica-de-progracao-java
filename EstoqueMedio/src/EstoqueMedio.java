import java.util.Scanner;

public class EstoqueMedio {

    public static void main(String[]args){

        Scanner scan =new Scanner(System.in);
        System.out.println("Informe a quantidade minima da peça em estoque:");
        int quantidadeMinima = scan.nextInt();

        System.out.println("Infomre a quantidade máxima da peça em estoque");
        int quantidadeMaxima = scan.nextInt();

        int mediaEstoque = (quantidadeMaxima + quantidadeMinima )/ 2;

        System.out.println("Media de estoque: "+mediaEstoque);

        scan.close();
    }
}

/*
Seção 3 - Exercício 2

Faça um algoritmo para "Calcular o estoque médio de uma peça",
sendo que:

estoque_medio = (quantidade_minima + quantidade_maxima) / 2


"calcula o estoque médio"*/
