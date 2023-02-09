package com.java.operadores;

import java.util.Scanner;

public class FluxoControle {

	public static void main(String[] args) {

		int idade = 19;

		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
				
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		
		if (idade < 0) {
			System.out.println("Idade Inválida");}

		if (idade > 18 && idade < 70) {
			System.out.println("Maior idade");
		}  else if (idade >= 70) {
			System.out.println("Terceira Idade");

			if (idade >= 100) {
				System.out.println("Centenária");
			}

		} 
		
		if (idade < 18) {
			System.out.println("Menor Idade");
		}


	}
}
