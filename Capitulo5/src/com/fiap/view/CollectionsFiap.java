package com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class CollectionsFiap {

	
	public static void main(String[] args) {
		
		
	//	  ArrayList carrinho = new ArrayList(); 
		  
		  double valor = 100.55; 
		  
		  int valor2 = 1;
		  
	//	  carrinho.add(valor); carrinho.add(valor2);
		  
	//	  System.out.println(carrinho.get(valor2));
		 
		
		
		
		List<String> carrinho = new ArrayList<String>();
		
		System.out.println(carrinho.isEmpty());
		
		carrinho.add("Maça");
		carrinho.add("Pera");
		carrinho.set(1, "Limão");
		
		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size());
		System.out.println(carrinho.get(1));
		
	}
	
}
