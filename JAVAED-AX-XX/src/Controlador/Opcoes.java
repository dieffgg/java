package Controlador;

import java.util.Scanner;

import Pessoa.Candidato;
import Vaga.Vaga;
import tree.Tree;

public enum Opcoes implements FuncaoOpcao
{
	INSCRICAO{
		public void funcao(Tree tree) 
		{
			try
			{
				Scanner teclado = new Scanner(System.in);
				System.out.println("Nome do candidato: ");
				String nome = teclado.next();
				System.out.println("Cpf do candidato: ");
				String cpf = teclado.next();
				System.out.println("Telefone do candidato: ");
				int telefone = teclado.nextInt();
				System.out.println("Curso do candidato(SI ou EP): ");
				String curso = teclado.next();
				System.out.println("Experi�ncia do candidato: ");
				int exp = teclado.nextInt();
			
				if(!curso.equalsIgnoreCase("SI") || !curso.equalsIgnoreCase("EP"))
				{
					Candidato candidato = new Candidato(nome, cpf, telefone, curso, exp);
					tree.root = tree.inserir(tree.root, candidato);
					System.out.println("---------CANDIDATOS EM ORDEM---------");
					tree.inOrdem(tree.root);
					System.out.println(" ");
					System.out.println("---------CANDIDATOS EM ORDEM REVERSA---------");
					tree.reverseOrdem(tree.root);
					System.out.println(" ");
				}	
			}
			catch (Exception e) 
			{
				System.out.println("Verifique as informa��es inseridas!");
				INSCRICAO.funcao(tree);
			}
		}
	},
	
	ABERTURA{
		public void funcao(Tree tree) 
		{
			try
			{
				Scanner teclado = new Scanner(System.in);
				System.out.println("Curso desejado para a vaga: ");
				String curso = teclado.next();
				System.out.println("Tempo de experi�ncia: ");
				int exp = teclado.nextInt();
				System.out.println("Sal�rio: ");
				float salario = teclado.nextInt();
				System.out.println(" ");
			
				if((!curso.equalsIgnoreCase("SI") || !curso.equalsIgnoreCase("EP"))&& salario != 0)
				{
					Vaga vaga = new Vaga(curso,exp,salario);
					
					System.out.println("--------------Lista de pessoal qualificado--------------");
					
					vaga.setListaCandidatos2(tree.reverseOrdemFiltro(tree.root, vaga));
					
					Candidato maiorvalor = new Candidato("0","0",0,"0",0);
					
					for (Candidato lista : tree.reverseOrdemFiltro(tree.root, vaga)) 
					{
						if(maiorvalor.getTempoExperiencia() < lista.getTempoExperiencia())
						{
							maiorvalor = lista;
						}
					}
									
					vaga.removeLista(maiorvalor);
					
					System.out.print("--------------Lista sem a pessoa com mais experi�ncia!--------------");
					vaga.getListaCandidatos().toString();
					System.out.println(" ");
					
					System.out.print(maiorvalor.getNome() + " voc� aceita o emprego?(Sim - N�o)");
					String opcao = teclado.next();
				}	
			}
			catch (Exception e) 
			{
				System.out.println("Verifique as informa��es inseridas!" + e);
			}
		}
	},
	
	CONSULTA_TEMPO{
		public void funcao(Tree tree) 
		{
			
		}
	},
	
	ENCERRA{
		public void funcao(Tree tree) 
		{
			
		}
	}
}
