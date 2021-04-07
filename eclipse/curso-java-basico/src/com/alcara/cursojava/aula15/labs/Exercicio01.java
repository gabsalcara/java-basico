package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número:");
		int num1 = scan.nextInt();

		System.out.println("Insira outro número:");
		int num2 = scan.nextInt();

		if (num1 > num2) {

			System.out.println("O num1 é maior: " + num1);

		} else if (num2 > num1) {

			System.out.println("O num2 é maior: " + num2);

		}
		scan.close();
	}

}
