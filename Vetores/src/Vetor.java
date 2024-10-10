import java.util.ArrayList;

public class Vetor {

    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 1; i <5; i++){
            vetor.add(i);
            if (i % 2 ==0){
                pares.add(i);
            }
        }for (Integer n :pares){
            System.out.println(n);
        }
    }
}
/*
Seção 8 - Exercício 1

Faça um algoritmo que carregue um vetor de 5 elementos inteiros
e em seguida armazene em um vetor apenas os números pares maiores
que 0. No final deve mostrar os elementos do vetor na tela.
*/