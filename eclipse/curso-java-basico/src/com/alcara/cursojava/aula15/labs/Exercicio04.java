package com.alcara.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira uma letra");
		String letra = scan.next();

		if (letra.length() > 1) {
			System.out.println("Digite apenas 1 letra");
		} else {

			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("vogal");
				break;
			default:
				System.out.println("consoante");
				break;
			}
		}
		scan.close();

	}

}
