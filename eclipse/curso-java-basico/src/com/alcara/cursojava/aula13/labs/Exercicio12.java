package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
	
		double peso = (72.7 * altura) -58;
		
		System.out.println("O seu peso ideal � de: " + peso);
		
		scan.close();

	}

}
