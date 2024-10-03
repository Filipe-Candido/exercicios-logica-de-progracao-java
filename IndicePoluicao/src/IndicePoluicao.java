import java.util.Scanner;


public class IndicePoluicao {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Informe o indice de poluição medido: ");
        double indicePoluicao = scan.nextDouble();

        if (indicePoluicao >= 0.05 && indicePoluicao <= 0.29){
            System.out.println("Indices Aceitaveis!");
        } else if (indicePoluicao >= 0.3 && indicePoluicao <= 0.4) {
            System.out.println("Industrias grupo 1 intimadas a suspenderem as atividades");
        } else if (indicePoluicao >= 0.4 && indicePoluicao <=0.5) {
            System.out.println("Industrias grupo 1 e 2 intimadas a suspenderem as atividades");

        } else if (indicePoluicao >= 0.5) {
            System.out.println("Todos os grupos intimados a suspenderem as atividades");

        }

    }

    }






/*
Seção 6 - Exercício 9

A Secretaria de Meio Ambiente que controla o índice de poluição, mantém 3
grupos de indústrias que são altamente poluentes do meio ambiente. O índice
de poluição aceitável varia de 0,05 até 0,29.

#grupo1
Se o índice sobe para 0,3 as indústrias do 1 grupo são intimadas a suspenderem suas atividades.

#grupo 2
Se o índice crescer para 0,4 as indústrias do 1 e 2 grupos são intimadas a suspenderem
suas atividades.

#grupo 3
Se o índice atingir 0,5 todos os grupos devem ser notificados
para paralisarem suas atividades.

Faça um algoritmo que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
*/