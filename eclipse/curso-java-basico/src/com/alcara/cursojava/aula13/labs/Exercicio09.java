package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double farenheit = scan.nextDouble();
	
		
		double celsius = (5 * (farenheit - 32) / 9);
		
		System.out.println("A temperatura em graus celsius é de: " + celsius);
		
		scan.close();

	}

}
