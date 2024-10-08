import java.util.Scanner;

public class ValidarSenha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scan.next();

        System.out.println("Informe sua senha: ");
        String senha = scan.next();

        while (nome.equals(senha)){

            System.out.println("Erro!");
            System.out.println("Informe seu nome: ");
             nome = scan.next();

            System.out.println("Informe sua senha: ");
            senha = scan.next();

        }
    }
}

/*
Seção 7 - Exercício 5

Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome de usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
*/