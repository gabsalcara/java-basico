package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo n�mero");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro n�mero");
		int num3 = scan.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// num1 � o menor
			// num3 � o maior
			// num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);

		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// num1 � o menor
			// num2 � o maior
			// num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);

		} else if (num2 <= num1 && num1 <= num3 && num1 <= num3) {
			// num2 � o menor
			// num3 � o maior
			// num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

		} else if (num2 <= num1 && num1 <= num3 && num3 <= num1) {
			// num2 � o menor
			// num1 � o maior
			// num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);

		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// num3 � o menor
			// num2 � o maior
			// num3 < num1 < num2
			System.out.println(num2 + " - " + num1 + " - " + num3);

		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// num3 � o menor
			// num1 � o maior
			// num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}

		scan.close();

	}

}
