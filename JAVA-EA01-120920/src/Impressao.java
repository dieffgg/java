
public class Impressao {
	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4};
		Double[] nm = {2.9,2.3,3.5};
		String[] palavra = {"banana", "uva", "pera"};
		
		imprimir(numeros);
		imprimir(nm);
		imprimir(palavra);
		System.out.println();
		imprimir1(numeros);
		imprimir1(nm);
		imprimir1(palavra);

	}
	public static <T> void imprimir(T[] x) {
		for (T i : x) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static <T> void imprimir1(T[] y) {
		for(int i = 0; i < y.length; i++) {
			System.out.print(y[i]+" ");
		}
		System.out.println();
	}
}
