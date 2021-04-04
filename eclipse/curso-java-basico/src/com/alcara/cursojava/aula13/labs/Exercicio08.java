package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que você ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O valor total do seu salario é de: R$" + salario);
		
		scan.close();

	}

}
