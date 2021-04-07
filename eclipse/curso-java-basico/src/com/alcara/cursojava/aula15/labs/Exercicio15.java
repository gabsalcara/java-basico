package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe os valores do triangulo");

		System.out.println("Informe o valor do primeiro lado : ");
		int lado1 = scan.nextInt();

		System.out.println("Informe o valor do segundo lado : ");
		int lado2 = scan.nextInt();

		System.out.println("Informe o valor do terceiro lado : ");
		int lado3 = scan.nextInt();

		if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {

			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("É um Triângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um Triângulo Isósceles");
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("É um Triângulo Escaleno");
			}

		} else {
			System.out.println("Não é um triangulo!");
		}

		scan.close();

	}

}
