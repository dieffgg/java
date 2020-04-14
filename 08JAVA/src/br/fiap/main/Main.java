package br.fiap.main;
import br.fiap.aluno.Aluno;

public class Main {

	public static void main(String[] args) {
		
	    Aluno aluno = new Aluno(1000, "Diego", "diegologin", "diegosenh");
	    System.out.println(aluno.getRm());
	    System.out.println(aluno.getNome());
	    
	    
	    aluno.setNome("kabou");
	    System.out.println(aluno.getNome());
	}

}
