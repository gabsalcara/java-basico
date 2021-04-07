package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um número:");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}

		scan.close();
	}

}
