import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContadorDePalavras {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String frase;
		Map<String, Integer> contador = new HashMap<String, Integer>();
		
		System.out.println("Frase --> ");
		frase = teclado.nextLine();
		String[] palavra = frase.split(" ");
		
		for (String s : palavra) {
			if(contador.containsKey(s)) {
				int total = contador.get(s);
				contador.put(s, total+1);
			}else {
				contador.put(s, 1);
			}
		}
		//impressao usando lambda
		contador.forEach((k, v) -> {
			System.out.println(k+" "+v);
		});
	}
}
