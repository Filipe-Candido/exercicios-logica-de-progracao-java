import java.util.Scanner;

public class CalculoSalarioHoras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as horas trabalhadas: ");
        double horasTrabalhadas = scan.nextDouble();
        double salario = horasTrabalhadas *10;
        System.out.printf("Salario: R$ %.2f%n",salario);
        if (horasTrabalhadas > 50){
            double excendenteHoras = horasTrabalhadas -50;
            double valorHoraExtra = excendenteHoras * 20;
            System.out.printf("Horas exedentes: %.2f%n",excendenteHoras);
            System.out.printf("Valor hora extra: R$ %.2f%n",valorHoraExtra);
            System.out.printf("Salario total: R$ %.2f%n",valorHoraExtra+salario);
        }else {
            System.out.println("Sem horas extras realizadas no referido mês!");
        }
        }
    }




/*
Seção 6 - Exercício 6

Elabore um algoritmo que leia as variáveis 'c' e 'n', respectivamente código
e número de horas trabalhadas de um operário. Calcule o salário sabendo-se que
ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o
excesso de pagamento armazenando-o na variável 'e'. Caso contrário zerar tal
variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento
imprimir o salário total e o salário excedente.
*/
