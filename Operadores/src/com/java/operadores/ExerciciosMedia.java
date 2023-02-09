package com.java.operadores;

import java.util.Scanner;

public class ExerciciosMedia {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira Nota 1: ");
		nota1 = sc.nextDouble();
		
		System.out.println("Insira Nota2: ");
		nota2 = sc.nextDouble();
		
		System.out.println("Insira Nota 3: ");
		nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media > 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 5) {
			System.out.println("Vai para a AF");
		} else if (media < 5){
		 System.out.println("Reprovado");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
