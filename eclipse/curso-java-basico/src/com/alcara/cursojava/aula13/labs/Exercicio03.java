package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int primeiroNumero = scan.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int segundoNumero = scan.nextInt();
		System.out.println("A soma dos números inteiros é igual a: " + (primeiroNumero + segundoNumero));
		
		scan.close();
	}

}
