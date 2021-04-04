package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do circulo é igual a:" + area);
		
		scan.close();
	}

}
