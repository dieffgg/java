
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + rm;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rm != other.rm)
			return false;
		return true;
	}
	
	
}
