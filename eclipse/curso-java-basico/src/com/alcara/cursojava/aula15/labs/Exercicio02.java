package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		int num = scan.nextInt();

		if (num >= 0) {
			System.out.println("O n�mero � positivo");
		} else {
			System.out.println("O n�mero � negativo");
		}

		scan.close();
	}

}
