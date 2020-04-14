package br.fiap.pack;

import java.util.Scanner;

public class MainSenha {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		char[] c = new char[20];
		char[] a = new char[20];
		String senha;
		
		Senha pilha = new Senha();
		pilha.init();
	
		System.out.println("Digite uma senha: ");
		senha = teclado.nextLine();
		a = senha.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			pilha.push(a[i]);
		}
		System.out.println(a.length+" é o tamaho de A");
		System.out.println("\n");
		
		for (int j = 0; j < a.length+1; j++) {
			c[j] = pilha.pop();
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println(c.length);
		
		teclado.close();
		
	}
}
