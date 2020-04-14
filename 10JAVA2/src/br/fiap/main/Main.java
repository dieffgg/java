package br.fiap.main;

import br.fiap.bilhete.BilheteUnico;
import br.fiap.tipo.TipoDeUsuario;
import br.fiap.usuario.Usuario;
import static javax.swing.JOptionPane.*; //Importar todos os metodos da classe
import static java.lang.Integer.parseInt;

public class Main {
	
	//varivel global --> sem ter objeto --> static
	private static BilheteUnico[] bilhete = new BilheteUnico[10];
	private static int posicao = 0;

	public static void main(String[] args) {
		
		String entrada;
		
		do {
			entrada = showInputDialog("Senha ou CPF ou SAIR");
			if(entrada.equals("admin")) {
				moduloAdministrativo();
			}
		} while(!entrada.equalsIgnoreCase("sair"));
	}

	private static void moduloAdministrativo() {
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(menuAdministrativo()));
			if(opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção Inválida");
			}else {
				switch(opcao) { // so pode ser do tipo int (e variacoes), char ou String
					case 1:
						emitirBilhete();
						break;
					case 2:
						imprimirBilhete();
						break;
					case 3:
						consultarBilhete();
						break;
				}
			}
		}while(opcao != 4);
		
	}
	
	private static void consultarBilhete() {
		// TODO Auto-generated method stub
		
	}

	private static void imprimirBilhete() {
		
		String cpf = showInputDialog("Informe o cpf para consulta");
		if(consultarCpf(cpf) != -1) {
			showConfirmDialog(null, "Cpf ja tem bilhete emitido");
		}
		
	}

	public static int consultarCpf(String cpf) {
		int aux = -1;
		for (int i = 0; i < posicao; i++) {
			if(bilhete[i].getUsuario().getCpf().equals(cpf)) {
				aux = i;
				break;//mata o for
			}
		}
		return aux;
	}

	public static void emitirBilhete() {
		
		
	}

	public static String menuAdministrativo() {
		String aux = "Escolha uma opção\n";
		aux += "1.Emitir bilhete\n";
		aux += "2.Imprimir bilhete\n";
		aux += "3.Consultar bilhete\n";
		aux += "4.Sair\n";
		return aux;
	}
	
	public static String menuUsuario() {
		String aux = "Escolha uma opção\n";
		aux += "1.Emitir bilhete\n";
		aux += "2.Imprimir bilhete\n";
		aux += "3.Consultar bilhete\n";
		aux += "4. Sair\n";
		return aux;
	}

}
