package Pessoa;
public class Candidato {
	private String nome;
	private String cpf;
	private int telefone;
	
	public Candidato(String nome, String cpf, int telefone, String cursoFormacao, int tempoExperiencia) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cursoFormacao = cursoFormacao;
		this.tempoExperiencia = tempoExperiencia;
	}
	
	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", cursoFormacao="
				+ cursoFormacao + ", tempoExperiencia=" + tempoExperiencia + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getCursoFormacao() {
		return cursoFormacao;
	}
	public void setCursoFormacao(String cursoFormacao) {
		this.cursoFormacao = cursoFormacao;
	}
	public int getTempoExperiencia() {
		return tempoExperiencia;
	}
	public void setTempoExperiencia(int tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}
	private String cursoFormacao;
	private int tempoExperiencia;
	
	
}
