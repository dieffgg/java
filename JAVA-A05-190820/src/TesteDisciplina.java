import java.util.ArrayList;
import java.util.List;

public class TesteDisciplina {

	public static void main(String[] args) {
		List<Aula> listaAula = new ArrayList<Aula>(); // cria uma Lista pra guardar obj listaAula
		listaAula.add(new Aula("Classe", 120));
		listaAula.add(new Aula("Objeto", 60));
		listaAula.add(new Aula("Herança", 100)); // guardou todos obj dentro de listaAula ["Classe",120, "Objeto", 60, "Herança", 100]
		
		//criar a disciplina 
		Disciplina disciplina = new Disciplina("POO", "Selmini", listaAula);
		//Criou o um obj disciplina = Nome:POO, Professor:Selmini, listaAula:["Classe",120, "Objeto",60, "Herança", 100] listaAluno:listaAlunoObj
		
		//gerar dois alunos
//		Aluno aluno1 = new Aluno(1, "Betina", "SI");
//		Aluno aluno2 = new Aluno(2,"José", "Banco de Dados");
		
		//matricular alunos na disciplina
		disciplina.matricular(new Aluno(1, "Betina", "SI"));
		disciplina.matricular(new Aluno(2, "José", "Banco de Dados"));
		
		//verificar se um aluno está matriculado
		System.out.println(disciplina.estaMatriculado(new Aluno(1, "Betina", "SI")));
	}

}
