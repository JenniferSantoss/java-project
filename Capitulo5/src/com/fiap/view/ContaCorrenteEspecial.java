package com.fiap.view;

public class ContaCorrenteEspecial extends ContaCorrente {

	private double limite;
	
	@Override
	public void sacar (double valor) throws SaldoInsufucienteException {
		if(valor > saldo + limite) {
			throw new SaldoInsufucienteException();
		}
		saldo = saldo - valor;
		
	}
	
}
