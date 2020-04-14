package br.fiap.pack;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//		String a;
//		char [] b = new char [4];
//		char [] c = new char [8];
//		System.out.print("Digite a senha: ");
//		a = teclado.nextLine();
//		b = a.toCharArray();
//		System.out.println(b.length);
//		for (int i = 0; i < b.length; i++) {
//			if(b[i] == '1') {
//				c[i] = '_';
//				c[i+1] = b[i];
//				System.out.println("\nAchei");
//			}
//			System.out.print(c[i]);
//		}
//		
//		teclado.close();
		volt(2);
		volt(1);
		
	}
	public static int volt(int a) {
		int b = 0;
		System.out.println(b);
		b = a;
		System.out.println(b);
		return b;
	}
	public void push(char elem) {
		if (!isFull() || isNumeric(elem)) {
			if(isLetter(dados[elem-1])) {
				dados[topo] = '#';
				topo++;
				dados[topo] = elem;
				topo++;
			}
			else{
				dados[topo] = elem;
				topo++;
			}
		}
		if(!isFull() || isLetter(elem)){
			if(isNumeric(dados[elem-1])) {
				dados[topo] = '#';
				topo++;
				dados[topo] = elem;
				topo++;
			}
			else {
				dados[topo] = elem;
				topo++;
			}
		}
		else 
			System.out.println("stack overflow");
		
	}
}
