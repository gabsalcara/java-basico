package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de um dos lados: ");
		
		double lado = scan.nextDouble();
		double area = Math.pow(lado,2);
		
		System.out.println("A �rea do quadrado � igual a:" + area);
		System.out.println("O dobro da �rea do quadrado � igual a:" + (area) * 2);
		
		scan.close();

	}

}
