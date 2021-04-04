package com.alcara.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();

		System.out.println("Digite a velocidade do link em Mbps: ");
		double velocidadeLink = scan.nextDouble();
		
		double tempoDownload = tamanhoArquivo / velocidadeLink ;
		
		System.out.println("O tempo estimado de download é de: " + tempoDownload + " minutos");
		
		scan.close();
	}

}
