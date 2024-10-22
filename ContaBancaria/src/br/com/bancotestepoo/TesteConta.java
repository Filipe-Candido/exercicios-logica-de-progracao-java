package br.com.bancotestepoo;

public class TesteConta {

	public static void main(String[]args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		/*Conta que foi a classe criada, crio as variaveis contaCorrente,ContaPoupanca e contaInvestiemnto
		 (= new Conta) gera o objeto em memória, então criando as variaveis (contaCorrente,contaPoupanca e
		 contaInvestimento) que são do tipo de dado (Conta),iremos controlar o objeto (new Conta)*/
		
		
		contaCorrente.numero = 1;
		contaCorrente.saldo = 22.5;
		contaCorrente.cliente.nome ="Filipe";
		contaCorrente.cliente.idade = 30;
		
		
		
		contaPoupanca.numero = 13;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome ="Angelica";
		contaPoupanca.cliente.idade =30;
		
		contaInvestimento.numero = 2;
		contaInvestimento.saldo = 50;
		contaInvestimento.cliente.nome ="Maria";
		contaInvestimento.cliente.idade = 70;
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade+"\n");
		
		System.out.println(contaPoupanca.numero);
		System.out.println(contaPoupanca.saldo);
		System.out.println(contaPoupanca.cliente.nome);
		System.out.println(contaPoupanca.cliente.idade+"\n");
		
		System.out.println(contaInvestimento.numero);
		System.out.println(contaInvestimento.saldo);
		System.out.println(contaInvestimento.cliente.nome);
		System.out.println(contaInvestimento.cliente.idade);
		
		
		
	}
}
