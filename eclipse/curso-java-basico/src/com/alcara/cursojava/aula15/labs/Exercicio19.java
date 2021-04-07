package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();

		System.out.println("Qual opera��o deseja realizar? (+, -, *, /)");
		String operacao = scan.next();

		double resultado = 0;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		}

		if (resultado % 2 == 0) {
			System.out.println("� par");
		} else {
			System.out.println("� �mpar");
		}

		if (resultado < 0) {
			System.out.println("� negativo");
		} else {
			System.out.println("� positivo");
		}

		scan.close();

	}

}
