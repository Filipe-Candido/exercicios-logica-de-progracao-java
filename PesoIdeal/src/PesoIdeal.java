import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura para calcular seu peso ideal:");
        float altura = scan.nextFloat();

        double pesoIdeal = (altura *72.7) - 58;

        System.out.printf("%.2f Peso ideal",pesoIdeal);
    }
}

/*
Seção 3 - Exercício 7

Tendo como dados de entrada a altura de uma pessoa,
construa um algoritmo que calcule seu peso ideal, usando
a seguinte fórmula: (72.7 * altura) - 58


"calcula peso ideal"*/