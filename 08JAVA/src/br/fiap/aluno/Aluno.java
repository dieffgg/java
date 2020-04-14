package br.fiap.aluno;
import br.fiap.email.Email;

public class Aluno {
	private long rm;
	private String nome;
	private Email email;
	
	public Aluno(long rm, String nome, String login, String senha) {
		this.rm = rm;
		this.nome = nome;
		this.email = new Email(login, senha);
	}
	
	public Aluno(long rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}
	
	public long getRm() {
		return this.rm;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
