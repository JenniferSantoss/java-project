package com.java.operadores;

import java.util.Scanner;

public class ExerciciosTemperaturas {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira a Temperatura em Celsius: ");
		double tempCelsius = sc.nextDouble();



		double tempKelvin = tempCelsius + 273;

		double tempFarh = (tempCelsius * 1.8) + 32;


	
		System.out.println("Temperatura em Kelvin: " + tempKelvin);
		
		System.out.println("Temperatura em Farhe: " + tempFarh);
		
	}











}
