package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tipo de combustivel? Digite (A) Álcool ou (G) Gasolina");
		String combustivel = scan.next();
		
		System.out.println("Qual a quantidade de litros ?");
		int litros = scan.nextInt();
		
		double gasolina = 2.50;
		double alcool = 1.90;
		
		int desconto = 0; 
		double valor = 0;
		
		if (combustivel.equalsIgnoreCase("A")) {
			
			if(litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
			
			 valor = litros * alcool;
			
		} else if (combustivel.equalsIgnoreCase("G")) {
			
			if(litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
			
			valor = litros * gasolina;
		}
		
		 double totalDesconto = (valor / 100) * desconto;
		 double total =  valor - totalDesconto;
		 
		 System.out.println("O valor a ser pago é de: " + total );
		
		scan.close();

	}

}
