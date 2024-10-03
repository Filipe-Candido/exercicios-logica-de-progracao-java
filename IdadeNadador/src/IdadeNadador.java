import java.util.Scanner;

public class IdadeNadador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a idade do nadador: ");
        int idadeNadador = scan.nextInt();

        if (idadeNadador >=5  && idadeNadador <= 7){
            System.out.println(idadeNadador+" anos: Infantil A");
        } else if (idadeNadador >=8  && idadeNadador <= 11) {
            System.out.println(idadeNadador+" anos: Infantil B");
        } else if (idadeNadador >=12  && idadeNadador <= 13) {
            System.out.println(idadeNadador+" anos: Juvenil A");
        }else if (idadeNadador >=14  && idadeNadador <= 17) {
            System.out.println(idadeNadador+" anos: Juvenil B");
        }else if (idadeNadador >18) {
            System.out.println(idadeNadador+" anos: Adultos");

        }


    }
}


/*
Seção 6 - Exercício 10

Elabore um algoritmo que data a idade de um nadador, classifique-o
em uma das seguintes categorias:
infantil-a = 5 a 7 anos
infantil-b = 8 a 11 anos
juvenil-a = 12 a 13 anos
juvenil-b = 14 e 17 anos
adultos = maior de 18 anos
*/