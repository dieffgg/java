import java.util.HashSet;
import java.util.Set;

public class Exemplo3 {
	public static void main(String[] args) {
		//Não tem elementos repetidos e a ordem não importa
		Set<String> lista = new HashSet<String>(); //Set é uma coleção(guardar obj)
		lista.add("uva");
		lista.add("maçã");
		lista.add("banana");
		lista.add("amora");
		lista.add("maçã");
		lista.add("uva");

		System.out.println(lista);
		
	}
}
