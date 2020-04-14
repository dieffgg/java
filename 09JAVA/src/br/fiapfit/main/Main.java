package br.fiapfit.main;

import java.util.Scanner;
import br.fiapfit.atleta.Atleta;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Atleta[] lista = new Atleta[3];
		String nome;
		double altura, peso, quadril;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("----------------------------------------------");
			System.out.print("Nome ->>>");
			nome = teclado.nextLine();
			System.out.print("digite altura (em metros)");
			altura = teclado.nextDouble();
			System.out.print("digite o peso (em quilos)");
			peso = teclado.nextDouble();
			System.out.print("digite o quadril (em centímetros)");
			quadril = teclado.nextDouble();
			lista[i] = new Atleta(nome, peso, altura, quadril);
			System.out.println();
			teclado.nextLine();
		}
		//saída de dados
		for(Atleta i: lista) {
			System.out.println("-----------------------------");
			System.out.println(i.getNome());
			System.out.println(String.format("%.2f", i.calcularImc()));
			System.out.println(i.calcularBai());
			System.out.println();
		}
		
		teclado.close();
	}
	
	

}
