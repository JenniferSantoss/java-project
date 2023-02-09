package com.fiap.view;

public class TestePolimorfismo {

	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrenteEspecial ();
		
		try {
			conta.sacar(20);
			}
		catch (SaldoInsufucienteException e) {
			e.printStackTrace();
		}
		
		
	}
}
