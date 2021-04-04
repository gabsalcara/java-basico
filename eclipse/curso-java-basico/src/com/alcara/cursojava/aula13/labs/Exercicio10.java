package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
	
		double farenheit = (celsius * 9/5) + 32;
		
		System.out.println("A temperatura em graus Farenheit é de: " + farenheit);
		
		scan.close();

	}

}
