package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o n�mero de horas trabalhadas no m�s: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O valor total do seu salario � de: R$" + salario);
		
		scan.close();

	}

}
