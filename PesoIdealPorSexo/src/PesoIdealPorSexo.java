import java.util.Scanner;

public class PesoIdealPorSexo {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double pesoIdeal;

        System.out.println("Informe sua altura separado por virgula: ");
        double altura = scan.nextDouble();

        scan.nextLine(); // esvazia o buffer do teclado

        System.out.println("Infomre o sexo M ou F: ");
        char sexo = scan.next() .charAt(0);


        if (sexo == 'M' || sexo =='m') {

            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal masculino: %.2f", pesoIdeal);
        }if (sexo != 'm' && sexo != 'f'){
            System.out.println("Sexo invalido!");

        }else{
          pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal feminino: %.2f", pesoIdeal);
    }

            scan.close();
    }

}




/*
Seção 6 - Exercício 4

Tendo como dados de entrada a altura e o sexo de uma pessoa, construa
um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7 * altura) - 58
Para mulheres: (62.1 * altura) - 44.7
*/