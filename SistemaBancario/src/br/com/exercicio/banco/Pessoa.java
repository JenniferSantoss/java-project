package br.com.exercicio.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * Nesta classe o atributo idade está encapsulado
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int idade;
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
}


