package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		int num1 = scan.nextInt();

		System.out.println("Insira outro n�mero:");
		int num2 = scan.nextInt();

		if (num1 > num2) {

			System.out.println("O num1 � maior: " + num1);

		} else if (num2 > num1) {

			System.out.println("O num2 � maior: " + num2);

		}
		scan.close();
	}

}
