package com.java.operadores;

import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {

		/*
		double peso = 75.0;
		double altura = 1.73;
*/

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o peso: ");
		double peso = sc.nextDouble();

		System.out.println("Digite o altura: ");
		double altura = sc.nextDouble(); 

		 


		double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);

		if (imc > 18 && imc < 25) {
			System.out.println("Peso Ideal");
		} else if (imc < 18 || imc > 25) {
			System.out.println("Peso Não Ideal");
		}


	}
}
