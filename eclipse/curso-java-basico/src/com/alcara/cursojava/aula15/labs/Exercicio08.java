package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro pre�o");
		double preco1 = scan.nextDouble();

		System.out.println("Digite o segundo pre�o");
		double preco2 = scan.nextDouble();

		System.out.println("Digite o terceiro pre�o");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("O pre�o1 � o mais barato - " + preco1);
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("O pre�o2 � o mais barato - " + preco2);
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("O pre�o3 � o mais barato - " + preco3);
		}

		scan.close();
	}

}
