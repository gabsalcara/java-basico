package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as quatros notas bimestrais: ");
		double primeiroBimestre = scan.nextDouble();
		double segundoBimestre = scan.nextDouble();
		double terceiroBimestre = scan.nextDouble();
		double quartoBimestre = scan.nextDouble();
		double media = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
		System.out.println("A média de notas bimestrais é de : " + media);
		
		scan.close();
	}

}
