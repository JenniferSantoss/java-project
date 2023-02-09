package br.com.exercicio.banco;
/**
	 * Classe que abstrai uma Conta Banc�ria
	 * @author jennifer
	 * @version 1.0
	 */
	
	public class Conta {
		/**
		 * N�mero da conta
		 */
		private int numero;

		/**
		 * N�mero da Ag�ncia
		 */
		private int agencia;

		/**
		 * Saldo da Conta
		 */
		private double saldo;

		
//teste
		public Conta(){

		}

		/*
		 * public Conta(int numero, int agencia){ super(); this.setNumero(numero);
		 * this.setAgencia(agencia);
		 * 
		 * }
		 */
		
		public Conta(int numero, int agencia, double saldo){
			super(); 
			this.setNumero(numero);
			this.setAgencia(agencia);
			this.setSaldo(saldo);
		}
		

		private void setSaldo(double saldo2) {
			// TODO Auto-generated method stub
			
		}

		/**
		   * Deposita um valor ao saldo da conta
		   * @param valor Valor a ser depositado
		*/
		public void depositar(double valor){
			saldo = saldo + valor;
		}

		/**
		  * Retira um valor do saldo da conta
		  * @param valor Valor a ser retirado
		*/

		public void retirar(double valor){
			saldo = saldo - valor;
		}

		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public double getSaldo() {
			return saldo;
		}
	  public void SetSaldo(double saldo) {
			this.saldo = saldo;
		}
	}
	

