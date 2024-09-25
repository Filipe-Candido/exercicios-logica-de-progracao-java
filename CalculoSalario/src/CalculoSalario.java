import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora trabalhada: ");
        float horaTrabalahda = scan.nextFloat();

        System.out.println("Infomre quantas hora strabalhou no mês: ");
        float quantidadeHoras = scan.nextFloat();

        float salario = horaTrabalahda*quantidadeHoras;

        System.out.printf("Seu salário no mês será: R$ %.2f%n", salario);

        scan.close();
    }

}
/*
Seção 3 - Exercício 6

Faça um algoritmo que pergunte quanto você ganha
por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.
*/