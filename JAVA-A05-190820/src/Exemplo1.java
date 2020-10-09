import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo1 {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Tatiana");
		lista.add("Ana");
		lista.add("Roberta");
		
		//impressão usando o recurso lambda
		lista.forEach(nome -> {
			System.out.println(nome);
		});
		
		//impressao do array de forma bem simples 
		System.out.println(lista);//toString() de cada elemento da lista
		
		//ordenar a lista em ordem alfábetica
		Collections.sort(lista);
		System.out.println(lista);
		
		//ordenar a lista em orfem inversa
		Collections.sort(lista, Comparator.reverseOrder());
		System.out.println(lista);
	}
}
