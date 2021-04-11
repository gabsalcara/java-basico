package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em (Kg) de Morango");
		int qtdMorango = scan.nextInt();
		
		System.out.println("Digite a quantidade em (Kg) de Maças");
		int qtdMaca = scan.nextInt();
		
		double precoKgMorango = 0;
		double precoKgMaca = 0;
		double totalValor = 0;
		double totalKg = 0;
		double desconto = 0;
		double total = 0;
		
		if(qtdMorango <= 5) {
			precoKgMorango = 2.50; 
		} else {
			precoKgMorango = 2.20;
		}
		
		if(qtdMaca <= 5) {
			precoKgMaca = 1.80; 
		} else {
			precoKgMaca = 1.50;
		}
		
	    totalValor = (qtdMorango * precoKgMorango) + (qtdMaca * precoKgMorango);
	    totalKg = qtdMorango + qtdMaca;
	    
	    if(totalKg > 8 || totalValor > 25) {
	    	desconto = (totalValor / 100) * 10;
	    }
	    
	    total = totalValor - desconto;
	    
	    System.out.println("O valor total a pagar é de R$ " + total);
		
		scan.close();

	}

}
