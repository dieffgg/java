package br.fiap.bilhete;
import br.fiap.tipo.TipoDeUsuario;
import br.fiap.usuario.Usuario;

public class BilheteUnico {
	private int numero;
	private Usuario usuario;
	private double saldo;
	private final static double valorDaPassagem = 4.40;
	
	public BilheteUnico(int numero, Usuario usuario, double saldo) {
		this.numero = numero;
		this.usuario = usuario;
		this.saldo = saldo;
	} 
	public String getDados() {
		String aux = "";
		aux += "Numero ->>> "+numero+"\n";
		aux += usuario.getDados();
		aux += "Saldo ---> R$ "+String.format("%.2f", saldo)+"\n";
		return aux;
	}
	public void passarNaCatraca() {
		if(usuario.getTipo().equals(TipoDeUsuario.NORMAL)) {
			saldo = saldo - valorDaPassagem;
		}else {
			saldo = saldo - valorDaPassagem / 2;
		}
	}
	
	public void carregarBilhete(double valor) {
		saldo = saldo + valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public static double getValordapassagem() {
		return valorDaPassagem;
	}
	
	
	
}
