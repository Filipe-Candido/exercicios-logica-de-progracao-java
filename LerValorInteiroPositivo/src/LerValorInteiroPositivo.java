import java.util.Scanner;



public class LerValorInteiroPositivo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int maiorValor = -999;
        int menorValor = 999;
        float soma = 0;



        for (int i =0; i < 10; i++){
            System.out.println("Informe um valor: ");
            int valorInformado = scan.nextInt();
            if (valorInformado > 0){
                if (valorInformado > maiorValor){
                    maiorValor = valorInformado;
                } if (valorInformado < menorValor) {
                    menorValor = valorInformado;
                }

                soma += valorInformado;
            }else {
                i--;
            }



        }
        float media = soma / 10;
        System.out.println("Maior Valor: "+maiorValor);
        System.out.println("Menor Valor: "+menorValor);
        System.out.println("Media "+media);


    }

}



/*
Seção 7 - Exercício 4

Construa um algoritmo que leia 10 valores inteiros e positivos e:
a) Encontre o maior valor;
b) Encontre o menor valor
c) Calcule a média dos números lidos;
*/