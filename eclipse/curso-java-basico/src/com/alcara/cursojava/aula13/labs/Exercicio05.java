package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros: ");
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		System.out.println("O tamaho em centimetros é : " + centimetros + " cm");
		
		scan.close();

	}

}
