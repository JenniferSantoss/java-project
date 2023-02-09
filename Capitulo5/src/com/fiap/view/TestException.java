package com.fiap.view;

public class TestException {

	public static void main(String[] args) throws DivizaoPorZeroException {

		try {
			int val = 10 / 0;

		//	int [] valores = new int [3];
		//	System.out.println(valores[4]);
		}

		catch (ArithmeticException e) {

		//	System.out.println("Não é possivel realizar uma divisão por zero");

			
			throw new DivizaoPorZeroException();
			
		}


		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * 
		 * System.out.println("Não é possivel achar a posição 4"); }
		 * 
		 * finally { System.out.println("Sempre passara por aqui"); }
		 */
	}

}
