package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira uma nota");
		double nota1 = scan.nextDouble();

		System.out.println("Insira outra nota");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7 && media <= 9) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado com Distinção");
		}

		scan.close();

	}
}
