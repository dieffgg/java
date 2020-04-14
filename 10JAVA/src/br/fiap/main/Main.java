package br.fiap.main;

import br.fiap.bilhete.BilheteUnico;
import br.fiap.tipo.TipoDeUsuario;
import br.fiap.usuario.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("Diego", "123", TipoDeUsuario.NORMAL);
		BilheteUnico bilhete = new BilheteUnico(1000, usuario, 5.00);
		
		System.out.println(bilhete.getDados());
		bilhete.carregarBilhete(20.00);
		bilhete.passarNaCatraca();
		System.out.println(bilhete.getDados());
	}

}
