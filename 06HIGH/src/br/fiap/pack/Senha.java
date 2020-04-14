package br.fiap.pack;

public class Senha {
	public final int  N = 20;
	char dados[] = new char[N];
	int topo;
	
	public void init() {
		topo = 0;
	}
	
	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if (topo == N)
			return true;
		else 
			return false;
	}
	
	public boolean isNumeric(char elem) {
		boolean number;
		if(elem >= '0' && elem <= '9') {
			number = true;
			return number;
		}
		else {
			number = false;
			return number;
		}
	}
	
	public boolean isLetter(char elem) {
		boolean letter;
		if ((elem >= 'a' && elem <= 'z') || (elem >= 'A' && elem <= 'Z')) {
			letter = true;
			return letter;
		}
		else {
			letter = false;
			return letter;	
		}
			 
	}
	
	public void push(char elem) {
		if(isEmpty()) {
			dados[topo] = elem;
			topo++;
			System.out.println("bloco 1");
		}
		else if (!isFull() && isNumeric(elem)) {
			
			if(isLetter(dados[topo-1])) {
				dados[topo] = '#';
				topo++;
				dados[topo] = elem;
				topo++;
				System.out.println("bloco 2");
			}
			else{
				dados[topo] = elem;
				topo++;
				System.out.println("bloco 3");
			}
		}
		else if(!isFull() && isLetter(elem)){
			if(isNumeric(dados[topo-1])) {	
				dados[topo] = '#';
				topo++;
				dados[topo] = elem;
				topo++;
				System.out.println("bloco 4");
			}
			else {
				dados[topo] = elem;
				topo++;
				System.out.println("bloco 5");
			}
		}
		else 
			System.out.println("stack overflow");
		
	}

	public char pop() {
		if(!isEmpty()){
			topo--;
			return dados[topo];
		}
		return 'e';
	}

	
}
