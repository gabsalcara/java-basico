package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o salário");

		double salarioAtual = scan.nextDouble();
		int aumento = 0;
		double novoSalario;
		double valorDoAumento;

		if (salarioAtual <= 280) {
			aumento = 20;

		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			aumento = 15;

		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			aumento = 10;

		} else if (salarioAtual > 1500) {
			aumento = 5;
		}

		valorDoAumento = (salarioAtual / 100) * aumento;
		novoSalario = salarioAtual + valorDoAumento;

		System.out.println("O salário antes do reajutes = " + salarioAtual);
		System.out.println("O percentual de aumento = " + aumento + "%");
		System.out.println("O valor do aumento = " + valorDoAumento);
		System.out.println("O novo salário após o aumento = " + novoSalario);

		scan.close();

	}

}
