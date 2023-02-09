package com.heranca.java;

public class Teste {

	
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro ();
		cachorro.setAlimenta("Todo cachorro come ração de cachorro");
		cachorro.setLocomove("Se locomove em 4 patas");
		cachorro.setLatido("Faz Au Au");
		
		Cachorro poddle = new Cachorro ();
		poddle.setAlimenta("come ração de cachorro");
		poddle.setLocomove("Se locomove em 4 patas");
		poddle.setLatido("Faz Au Au");
		
		
		
	}
	

	
	
	
}
