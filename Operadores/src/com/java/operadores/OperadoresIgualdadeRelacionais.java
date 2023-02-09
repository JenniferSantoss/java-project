package com.java.operadores;

public class OperadoresIgualdadeRelacionais {

	public static void main(String[] args) {
		
		int idade = 10;
		boolean maioridade = idade > 18;
		
		System.out.println(maioridade);
		
		
		// AND//
		
		int idade2 = 75;
		boolean precisaVotar = idade2 > 18 && idade2 <70;
		
		System.out.println(precisaVotar);
		
		
		// OR//
		
		int cartaoAmarelo = 1, cartaoVermelho = 0;
		boolean suspenso = cartaoAmarelo == 2 || cartaoVermelho == 1;
		
		System.out.println(suspenso);
		
		
		// XOR//
		
		int x = 10 , y = 5;
		boolean teste = x < 11 ^ y > 5;
		
		System.out.println(teste);
		
		
		// NOT //
		
		int z = 10;
		boolean teste2  = !(z >=10);
				
		System.out.println(teste2);
		
		
	}
}
