
public class Lista<T> {
	private No<T> inicio;
	
	public void inserir(T dado) {
		No<T> aux = new No<T>(dado, null);
		
		if(inicio != null) {
			aux.setProx(inicio);
		}
		
		inicio = aux;
	}
	public void imprimir() {
		No<T> aux = inicio;
		while(aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
	}
}
