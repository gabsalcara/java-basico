package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int int01 = scan.nextInt();
		
		System.out.println("Digite o segundo numero inteiro: ");
		int int02 = scan.nextInt();
	
		System.out.println("Digite um n�mero real: ");
		double real = scan.nextDouble();
		
		double a = (int01 * 2) + (int02 / 2);
		double b = (int01 * 3) + real;
		double c = Math.pow(real, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo � igual a : " + a);
		System.out.println("A soma do triplo do primeiro com o terceiro � igual a : " + b);
		System.out.println("O terceiro elevado ao cubo � igual a : " + c);
		
		scan.close();

	}

}
