package com.java;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta ();
		Conta contaPoupanca = new Conta ();
		Conta contaInvestimento = new Conta ();
		
		contaCorrente.numero = 001;
		contaCorrente.saldo = 200.00;
		contaCorrente.cliente.nome = "Jenny";
		contaCorrente.cliente.idade = 24;
		
		
		contaPoupanca.numero = 6880;
		contaPoupanca.saldo = 1000;
		
		contaInvestimento.numero = 0002;
		contaInvestimento.saldo = 3000;
		
		
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
	
	
	//CONSTRUTORES//	
	
	
	Conta cc = new Conta (100,50.0);	
		
	System.out.println(cc.recuperarSaldo());	
	
	}
	
	

	
	
	
	
	
	
	
}
