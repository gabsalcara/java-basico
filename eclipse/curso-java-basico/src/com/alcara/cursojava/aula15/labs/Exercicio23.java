package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o tipo de carne - FileDuplo (F), Alcatra (A), Picanha (P)");
		String tipo = scan.next();
		
		System.out.println("Insira a quantidade em Kg");
		double qtd = scan.nextDouble();

		System.out.println("Informe o tipo de Pagamento - Cartão Tabajara Sim (S) ou Não (N)?");
		String tipoPagamento = scan.next();
		
		double precoKgFileDuplo;
		double precoKgAlcatra;
		double precoKgPicanha;
		double desconto = 0;
		double total = 0;
		
		if(tipo.equalsIgnoreCase("F")) {
			
			if(qtd <= 5) {
				precoKgFileDuplo = 4.9;
			} else {
				precoKgFileDuplo = 5.8;
			}
			
			total = qtd * precoKgFileDuplo;
			
		} else if(tipo.equalsIgnoreCase("A")) {
			
			if(qtd <= 5) {
				precoKgAlcatra = 5.9;
			} else {
				precoKgAlcatra = 6.8;
			}
			
			total = qtd * precoKgAlcatra;
			
		} else if(tipo.equalsIgnoreCase("P")) {
			
			if(qtd <= 5) {
				precoKgPicanha = 6.9;
			} else {
				precoKgPicanha= 7.8;
			}
			
			total = qtd * precoKgPicanha;
		}
		
		if(tipoPagamento.equalsIgnoreCase("S")) {
			desconto = (total / 100) * 5;
		}
		
		double pagar = total - desconto;
	
		System.out.println("Tipo de carne comprada " + tipo);
		System.out.println("Quantidade total em Kg " + qtd);
	    System.out.println("Valor total " + total);
	    System.out.println("Pagamento com Cartão? " + tipoPagamento);
	    System.out.println("Valor desconto " + desconto);
	    System.out.println("Valor a pagar " + pagar);
	    
		scan.close();

	}

}
