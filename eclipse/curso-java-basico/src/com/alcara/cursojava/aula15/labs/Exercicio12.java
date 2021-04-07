package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor/hora");
		double valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas no mês");
		int horasTrabalhadas = scan.nextInt();

		double salarioBruto = valorHora * horasTrabalhadas;

		double descontoIr = 0;
		double IR;

		int descontoINSS = 10;
		double INSS;

		int descontoFGTS = 11;
		double FGTS;

		int descontoSindicato = 3;
		double Sindicato;

		double totalDescontos;
		double salarioLiquido;

		// Desconto do IR
		if (salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIr = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIr = 10;
		} else if (salarioBruto > 2500) {
			descontoIr = 20;
		}

		IR = (salarioBruto / 100) * descontoIr;
		INSS = (salarioBruto / 100) * descontoINSS;
		FGTS = (salarioBruto / 100) * descontoFGTS;
		Sindicato = (salarioBruto / 100) * descontoSindicato;

		totalDescontos = IR + INSS + Sindicato;
		salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ")	: R$ " + salarioBruto);
		System.out.println("(-) IR (" + descontoIr + "%)			: R$ " + IR);
		System.out.println("(-) INSS (" + descontoINSS + "%)			: R$ " + INSS);
		System.out.println("(-) FGTS (" + descontoFGTS + "%)			: R$ " + FGTS);
		System.out.println("(-) Sindicato (" + descontoSindicato + "%)		: R$ " + Sindicato);
		System.out.println("Total de descontos" + "		: R$ " + totalDescontos);
		System.out.println("Salário Liquido" + "			: R$ " + salarioLiquido);

		scan.close();

	}

}
