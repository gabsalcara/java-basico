package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Questionário do Crime - Responda (s) para sim ou (n) para Não");
		
		System.out.println("Telefonou para a vitima?");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vitima?");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vitima?");
		String resposta4 = scan.next();
		
		System.out.println("Já trabalhou com a vitima?");
		String resposta5 = scan.next();
		
		int cont = 0;
		
		if(resposta1.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta2.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta3.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta4.equalsIgnoreCase("S")) {
			cont++;
		}
		if(resposta5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		} else if (cont == 5) {
			System.out.println("Assasino");
		} else {
			System.out.println("Inocente");
		}
		
		
		scan.close();

	}

}
