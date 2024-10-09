import java.util.Scanner;


public class LevantamentoEstoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float contadorTotal =0, contadorDefeito1 =0,contadorDefeito2 =0,contadorDefeito3 =0,
        contadorDefeito4 =0, indentificacao, defeito;



        System.out.println("Informe a identificação do equipamento:( código mouse = 1)");
        indentificacao = scan.nextFloat();

        while (indentificacao != 0){

            System.out.println("1- Necessita da esfera  ");
            System.out.println("2- Necessita da limpeza  ");
            System.out.println("3- Necessita da troca do cabo ou conector  ");
            System.out.println("4- Quebrado ou inutilizado   ");
            System.out.println("Informe o defeito: ");


            defeito = scan.nextFloat();

            if (defeito ==1){
                contadorDefeito1++;
            }if (defeito ==2){
                contadorDefeito2++;
            }if (defeito ==3){
                 contadorDefeito3++;
            }if (defeito ==4){
                contadorDefeito4++;
            }
            contadorTotal++;
            System.out.println("Informe a identificação do equipamento( código mouse = 1)");
            indentificacao = scan.nextFloat();
        }
        float percentual1 = contadorDefeito1 /contadorTotal *100;
        float percentual2 =contadorDefeito2/contadorTotal *100;
        float percentual3 =contadorDefeito3/contadorTotal *100;
        float percentual4 =contadorDefeito4/contadorTotal *100;
        System.out.println("Quantidade de mouses: "+contadorTotal);
        System.out.println("Situação \t\t\t\t\t\t\t\t\t Quantidade \t Percentual");
        System.out.printf("1- Necessita da esfera:\t\t\t\t\t\t\t%.2f\t\t\t%.2f%%\n", contadorDefeito1, percentual1);
        System.out.printf("2- Necessita da limpeza:\t\t\t\t\t\t%.2f\t\t\t%.2f%%\n", contadorDefeito2, percentual2);
        System.out.printf("3- Necessita da troca do cabo ou conector:\t\t%.2f\t\t\t%.2f%%\n", contadorDefeito3, percentual3);
        System.out.printf("4- Quebrado ou inutilizado:\t\t\t\t\t\t%.2f\t\t\t%.2f%%\n", contadorDefeito4, percentual4);


    }

}
/*
Seção 7 - Exercício 7

Sua organização acaba de contratar um estagiário para trabalhar no
suporte de informática, com a intenção de fazer um levantamento
nas sucatas encontradas na área. A primeira tarefa dele é testar
todos os cerca de 200 mouses que se encontram lá, testando e anotando o
estado de cada um deles, para verificar o que pode aproveitar deles.
Foi requisitado que você desenvolva um programa para registar este
levantamento. O programa deverá receber um número indeterminado
de entradas, cada uma contendo: um número de identificação do
mouse e o tipo de defeito:
- necessita da esfera;
- necessita de limpeza;
- necessita troca do cabo ou conector;
- quebrado ou inutilizado;

Uma identificação igual a zero encerra o programa. Ao final
o programa deverá emitir o seguinte relatório:

Quantidade de mouses: 100

Situação                              Quantidade               Percentual
1-necessita da esfera                    40                        40%
2-necessita de limpeza                   30                        30%
3-necessita troca do cabo ou conector    15                        15%
4-quebrado ou inutilizado                15                        15%
*/
