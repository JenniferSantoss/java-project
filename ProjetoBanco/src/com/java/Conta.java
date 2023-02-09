package com.java;

public class Conta {

	int numero;
	double saldo;
	int agencia;

//Construtor sem argumentos//	
	public Conta() {
		
	}
//Construtor que recebe um valor int//	
	public Conta (int numero) {
		this.numero = numero;
				
	}
//Construtor que recebe um valor int e double//	
	public Conta (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo; 
		
	}
	
//Há 3 formas de instanciar a classe conta: new Conta() ; new Conta (100) ; new Conta (100,10).//	
	
	
	Cliente cliente = new Cliente();

//MÉTODOS//

	public double recuperarSaldo ( ) {
		return saldo;

	}

	public void depositar(double valor) {

		saldo = saldo + valor;

	}

	public void sacar (double valor) {

		saldo = saldo - valor;


	}

	public void sacar (double valor, double taxa) {

		saldo = saldo - valor - taxa;


	}

	public void setAgencia (int agencia) {
		this.agencia = agencia;
		
	}
	
	public int getNumero () {
		return numero;
	}
	
	
}
