package br.fiapfit.main;

public class Teste {

	public static void main(String[] args) {
//		
//		int [] x = {5, 89, 73, 10, 3};
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i]+ "\t ");
//		}
//		System.out.println();
//		for(int i: x ) {
//			System.out.print(i+ "\t ");
//		}
		somar(1,2,3);
		somar(1,2);
		somar(3,4,5,6,7,0);

	}
	
	public static void somar(int... x) {
		int aux = 0;
		for (int i : x) {
			aux = aux + i;
		}
		System.out.println(aux);
	}
}
