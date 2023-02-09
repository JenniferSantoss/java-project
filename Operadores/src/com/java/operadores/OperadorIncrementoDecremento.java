package com.java.operadores;

public class OperadorIncrementoDecremento {
	public static void main(String[] args) {
	
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int subtracao = x - y;
		int multi = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da soma  " + soma);
		System.out.println("Resultado da subtracao  " + subtracao);
		System.out.println("Resultado da multiplicação  " + multi);
		System.out.println("Resultado da divisao  " + divisao);
		System.out.println("Resultado da resto  " + resto);

		x++;
		System.out.println("Resultado do incremento de x " + x);
		
		x += 10;
		
		System.out.println("Resultado da atribuição aditiva de x " + x);
		
		y--;
		
		System.out.println("Decremento de y:" + y);
		
		y -= 10;
		
		System.out.println("Resultado da atribuição negativa:  " + y);
		
		
		
		
}
	
}
