package com.alcara.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2 ;
		System.out.println(resultado);
		
		resultado = resultado + 8 ;
		System.out.println(resultado);
		
		resultado = resultado % 7 ;
		System.out.println(resultado);
		
		String primeiroNome = "Esta � ";
		String segundoNome = "uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1 ;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		System.out.println(resultado++); // Primeiro exibe o resultado, depois incrementa o valor
		System.out.println(++resultado); // Primeiro incrementa o valor, depois exibe o resultado
		
		resultado = resultado - 1 ;
		System.out.println(resultado);
		
		resultado--;
		System.out.println(resultado);
		
		System.out.println(resultado--); // Primeiro exibe o resultado, depois decrementa o valor
		System.out.println(--resultado); // Primeiro decrementa o valor, depois exibe o resultado
		
	}

}
