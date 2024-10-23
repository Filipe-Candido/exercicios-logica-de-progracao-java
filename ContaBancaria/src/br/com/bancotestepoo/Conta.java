package br.com.bancotestepoo;

public class Conta {
		
	int numero;
	double saldo;
	int agencia;/*atributo agencia*/
	
	/*Referenciando a classe cliente dentro da classe conta, para referenciar devemos perguntar
	 "A classe conta é um cliente ou tem um cliente*/
	
	
	Cliente cliente = new Cliente();/* declaro a classe cliente dar um nome a variavel, no caso "cliente"
	 e trabalho dentro de um objeto cliente*/
	
	/*Metodo agencia recebe um atributo agencia */
	
	
	
	public void setAgencia(int agencia) {/*Metodo agencia recebe um atributo agencia */
		this.agencia =agencia;/*O this vai sempre refenciar um parametro ou metodo do escopo da classe*/
	
		
		/*Declaração de metodos em java*/
	}public double recuperarSaldo() {
		return saldo;
		
	}public void depositar(double valor) {
		saldo =saldo +valor;
		
	}
	
	/*sobrecarga de metodos */
	public void retirar(double valor) {
		saldo = saldo -valor;
		
	}public void retirar(double valor,double taxa) {
		saldo = saldo -valor - taxa;
	}public void name() {
		
	}
}
