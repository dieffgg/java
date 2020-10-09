import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Disciplina {
	private String nome;
	private String professor;
	private List<Aula> listaAula; // esse atributo recebe uma lista generica do tipo aula Aula[conteudo, duração]
	private Set<Aluno> listaAluno;
	
	public Disciplina(String nome, String professor, List<Aula> listaAula) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.listaAula = listaAula;
		listaAluno = new HashSet<Aluno>(); //temos que instanciar o obj
	}
	
	public void matricular(Aluno aluno) {
		listaAluno.add(aluno);
	}
	public boolean estaMatriculado(Aluno aluno) {
		return listaAluno.contains(aluno);
	}
	
}
