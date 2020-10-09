import java.util.Scanner;

import Controlador.Controlador;
import Controlador.Opcoes;
import tree.Tree;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		Tree tree = new Tree();
		
		boolean parar = false;
		
		while(parar != true)
		{
			System.out.println("1 - Inscri��o de Candidato");
			System.out.println("2 - Abertura de Vaga");
			System.out.println("3 - Consulta de maior tempo de experi�ncia");
			System.out.println("4 - Encerrar");
			System.out.println(" ");
			try
			{
				String opcao = teclado.next();
				Opcoes.valueOf(opcao).funcao(tree);
			}
			catch (Exception e) 
			{
				System.out.println("Op��o incorreta!");
			}
		}
		
	}

}
