package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um ano");
		
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " � um ano Bissexto!");
		}
		else{
			System.out.println(ano + " n�o � um ano Bissexto!");
		}
		
		scan.close();

	}

}
