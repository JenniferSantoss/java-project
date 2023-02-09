package com.fiap.view;

public class ContaCorrente {

	
	protected double saldo;
	
	public void sacar (double valor) throws SaldoInsufucienteException {
		if(valor > saldo) {
			throw new SaldoInsufucienteException();
		}
		saldo = saldo - valor;
		
	}
	
	
}
