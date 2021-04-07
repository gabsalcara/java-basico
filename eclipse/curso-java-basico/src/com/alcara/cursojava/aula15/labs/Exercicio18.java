package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("É par");
		} else {
			System.out.println("É ímpar");
		}
		
		scan.close();

	}

}
