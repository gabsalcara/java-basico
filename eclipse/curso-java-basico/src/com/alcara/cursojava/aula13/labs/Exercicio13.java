package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que voc� ganha por hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite o n�mero de horas trabalhadas no m�s: ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double IR = salarioBruto * 0.11;
		double INSS = salarioBruto * 0.08;
		double Sindicato = salarioBruto * 0.05;
		double salarioLiquido = salarioBruto - (IR + INSS + Sindicato);

		System.out.println("O valor do seu salario Bruto � de: R$" + salarioBruto);
		System.out.println("O valor pago ao IR foi de: R$" + IR);
		System.out.println("O valor pago ao INSS foi de: R$" + INSS);
		System.out.println("O valor pago ao Sindicato foi de: R$" + Sindicato);
		System.out.println("O valor do seu salario Liquido � de: R$" + salarioLiquido);
		
		scan.close();
	}

}
