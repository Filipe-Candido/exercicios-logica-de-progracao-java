import java.util.Scanner;

public class ExcedentePesca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Informe a quantidade de Kg pescados: ");
        Double quantidadePesca = scan.nextDouble();

        if (quantidadePesca > 50){
            double excedentePesca = quantidadePesca -50;
            double multa = excedentePesca*4;
            System.out.printf("Kg Excedentes : Kg %.2f%n", excedentePesca);
            System.out.printf("Valor da Multa: R$ %.2f%n", multa);

        }else{
            System.out.println("Multa e excedente: "+0);
        }
    }
}

/*
Seção 6 - Exercício 5

João da Silva, pescador, comprou um microcomputador para controlar
o rendimento diário de seu trabalho. Toda vez que ele traz um peso
de peixes maior que o estabelecido pelo regulamento de pesca do
estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por
quilo excedente.
João precisa que você faça um algoritmo que leia a variável 'p' (peso de peixes)
e verifique se há excesso. Se houver, gravar na variável 'e' (excesso) e na
variável 'm' o valor da multa que João deverá pagar. Caso contrário mostrar
tais variáveis com o conteúdo 'zero'.
*/