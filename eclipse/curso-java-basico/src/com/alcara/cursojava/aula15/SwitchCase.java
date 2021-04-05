package com.alcara.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana");
		
		int dia = scan.nextInt();
		
		/*
		switch(dia) {
			case 1: System.out.println("Domingo"); 
				break;
			case 2: System.out.println("Segunda"); 
				break;
			case 3: System.out.println("Ter�a"); 
				break;
			case 4: System.out.println("Quarta"); 
				break;
			case 5: System.out.println("Quinta"); 
				break;
			case 6: System.out.println("Sexta"); 
				break;
			case 7: System.out.println("S�bado"); 
				break;
			default: System.out.println("N�o � um dia da semana v�lido"); break;
		}
		*/
		switch(dia) {
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: System.out.println("Dia �til"); 
				break;
			case 1:
			case 7: System.out.println("Fim de semana"); 
				break;
			default: System.out.println("N�o � um dia da semana v�lido"); break;
		}
		
		scan.close();

	}

}
