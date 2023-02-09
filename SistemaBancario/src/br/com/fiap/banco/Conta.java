package br.com.fiap.banco;

import java.io.Serializable;

/** 
 * Classe que abstrai uma conta Bancária
 * @author Jennifer
 * @version 1.0
 */


public class Conta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	private int setagencia;
	private int setnumero;
	private double setSaldo;
	
	/** 
	 * Classe que abstrai uma conta Bancária
	 */
	
	
	public Conta() {
		
	}
	
	/**
	 * Realiza um depósito na sua conta corrente
	 * @param agencia da sua conta
	 * @param numero da sua conta
	 * @param saldo da sua conta
	 */
	
	
	public Conta (int agencia, int numero, double saldo) {
		this.setagencia = agencia;
		this.setnumero =  numero;
		this.setSaldo = saldo;
	
	}	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Adiciona um valor na conta
	 * @param valor que será depositado
	 * @see depositar algum valor
	 */
	
	public void depositar (double valor) {
		
		this.setSaldo(this.getSaldo() + valor);
	}
	
	
	/**
	 * Retira um valor na conta
	 * @param valor que será retirado
	 * @see retirar algum valor
	 */
	
	
	public void retirar (double valor) {
		
		this.setSaldo(this.getSaldo() - valor);
		}
	
	
	/**
	 * verifica saldo da conta
	 * @return valor do saldo
	 */
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	

	
	
	
}





