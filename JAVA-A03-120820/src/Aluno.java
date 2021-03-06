
public class Aluno implements Comparable<Aluno>{ // para implementar o compareTo temos que implementar essa interface
	private int rm; 
	private String nome;
	private String curso;
	
	public Aluno(int rm, String nome, String curso) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.curso = curso;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return nome.compareTo(aluno.getNome());
	}

	@Override
	public String toString() {
		return rm+" - "+nome+" - "+curso;
	}
}
