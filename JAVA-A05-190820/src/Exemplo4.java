import java.util.HashMap;
import java.util.Map;

public class Exemplo4 {
	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "amora");
		mapa.put(2, "manga");
		mapa.put(3, "banana");
		//mapa.put(2, "manga"); troca o valor key 2 
		
		System.out.println(mapa.get(2));
		System.out.println(mapa.containsKey(2));
	}
}
