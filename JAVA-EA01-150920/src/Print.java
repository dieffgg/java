
public class Print {

	public static void main(String[] args) {
		Integer[] numeros = {1,2,3,4};
		Double[] nm = {2.0,4.0,5.0,6.0};
		String[] palavras = {"tv","home","som"};
		
		impressao(numeros);
		impressao(nm);
		impressao(palavras);
		im(numeros);
		im(nm);
		im(palavras);
	}
	public static <T> void impressao(T[] y){
		for (T t : y) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
	public static <T> void im(T[] x) {
		for(int i=0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

}
