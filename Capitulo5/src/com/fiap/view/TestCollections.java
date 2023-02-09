package com.fiap.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestCollections {
	
	
	public static void main(String[] args) {
		
		
		
		//https://www.alura.com.br/conteudo/java-collections
		List<String> frutas = new ArrayList<String>();

		
		frutas.add("maça");
		frutas.add("maça");
		frutas.add("maça");
		frutas.add("maça");
		frutas.add("banana");
        
		if(frutas.contains("maça")) {
			System.out.println("verdade");
		}
		else {
			System.out.println("falso");
		}
		
		
		
		frutas.forEach(x -> {
			System.out.println("frutas usando lista: "+ x);
		});
		
		System.out.println("");
		
		
		//https://www.devmedia.com.br/diferencas-entre-treeset-hashset-e-linkedhashset-em-java/29077
		Set<String> frutas2 =  new LinkedHashSet<String>();
		
		frutas2.add("maça");
		frutas2.add("maça");
		frutas2.add("maça");
		frutas2.add("maça");
		frutas2.add("banana");
		
		frutas2.forEach(x -> {
			System.out.println("Frutas usando HashSet: " +x);
		});
	}

}
