package Controlador;

import Pessoa.Candidato;
import tree.Tree;

public class Controlador 
{
	public boolean InscricaoCandidato(Candidato candidato,Tree tree)
	{
		if(candidato.getCursoFormacao().equalsIgnoreCase("Sistemas de Informacao") || candidato.getCursoFormacao().equalsIgnoreCase("Engenharia de Produção"))
		{
			tree.inserir(tree.root, candidato);
			return true;
		}
		return false;
		
	}
}
