
public class Impressao {

	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4};
		Double[] nm = {1.0,3.5,4.7,5.8};
		String[] palavras = {"carro", "moto", "avião"};
		
		imprimir(numeros);
		imprimir(nm);
		imprimir(palavras);
		print(numeros);
		print(nm);
		print(palavras);
	}
	public static <T> void imprimir(T[] x) {
		for (T t : x) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	public static <T> void print(T[] x){
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

}
