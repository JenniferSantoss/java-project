package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta ();
		cc.depositar(50.0);
		cc.setAgencia(001);
		cc.setNumero(123);
		
		cc.depositar(100.0);
		
		System.out.println(cc.getSaldo());
		
		
		Conta poupanca = new Conta (6688, 222, 200);
		
		poupanca.retirar(100.0);
		
		System.out.println(poupanca.getSaldo());
				
		
		
		
	}

}
