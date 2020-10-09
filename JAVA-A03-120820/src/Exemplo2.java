import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno(500, "Carolina", "Sistemas de Informação"));
		lista.add(new Aluno(250, "Tatiana", "BD"));
		lista.add(new Aluno(100, "Ana", "Eng"));
		
		//ordenar a lista em ordem alfabética
		Collections.sort(lista);
		System.out.println(lista); //toString() de cada de elemento
		
		//critério de ordenação pelo nome usando Comparator
		lista.sort(Comparator.comparing(Aluno::getNome));//temos que colocar um comparador
		System.out.println(lista);
		
		//critério de ordenção pelo rm usando Comparator
		lista.sort(Comparator.comparing(Aluno::getRm));
		System.out.println(lista);
		
		//critério de ordenção pelo curso usando Comparator
		lista.sort(Comparator.comparing(Aluno::getCurso));
		System.out.println(lista);

	}

}
