
public class Impressao {

	public static void main(String[] args) {
		Integer[] vi = {8,9,1,2,0};
		Double[] vd = {0.5, 2.7, 9.5, 7.0};
		String[] vs = {"uva", "maça", "pera"};
		
		imprimir(vi);
		imprimir(vd);
		imprimir(vs);
	}
	//metodo generico ou parametrizado 
	public static <T> void imprimir(T[] v) { //generico trabalha apenas com referecnias (objetos)
		for(T i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	/*
	public static void imprimir(int[] v) {
		for(int i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void imprimir(double[] v) {
		for(double i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void imprimir(String[] v) {
		for(String i : v) {
			System.out.print(i+' ');
		}
		System.out.println();
	}
*/
	
}
