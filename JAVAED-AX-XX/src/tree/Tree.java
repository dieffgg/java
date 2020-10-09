package tree;

import java.util.List;

import Pessoa.Candidato;
import Vaga.Vaga;

public class Tree 
{
	private class ARVORE{
		Candidato dado;
		ARVORE dir,esq;
	}
	
	public ARVORE root = null;
	
	public ARVORE inserir (ARVORE p, Candidato info) {
		// insere elemento em uma ABB
		if (p == null) {
			p=new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}
		else if (info.getTempoExperiencia() < p.dado.getTempoExperiencia()) 
		{
				p.esq= inserir (p.esq, info);
		}
			else
			{
				p.dir=inserir(p.dir, info);	
			}
		return p;
		}

	
	public void inOrdem(ARVORE p) {
		if (p!=null) {
			if (p.esq != null)
				inOrdem(p.esq);
			System.out.println(p.dado);
			if (p.dir != null)
				inOrdem(p.dir);
		}
	}
	
	public void reverseOrdem(ARVORE p) {
		if (p!=null) {
			if (p.dir != null)
				reverseOrdem(p.dir);
			System.out.println(p.dado);
			if (p.esq != null)
				reverseOrdem(p.esq);
		}
	}
	
	public void maior(ARVORE p) {
		if (p!=null) {
			if (p.dir != null)
				reverseOrdem(p.dir);
			System.out.println(p.dado);
			if (p.esq != null)
				reverseOrdem(p.esq);
		}
	}
	
	public List<Candidato> reverseOrdemFiltro(ARVORE p,Vaga vaga) {
		if (p!=null) {
			if (p.dir != null)
			{
				reverseOrdemFiltro(p.dir,vaga);	
			}
			
			if(p.dado.getCursoFormacao().equalsIgnoreCase(vaga.getCurso()) && p.dado.getTempoExperiencia() >= vaga.getExp())
			{
				System.out.println(p.dado);
				vaga.setListaCandidatos(p.dado);
			}
			
			if (p.esq != null)
			{
				reverseOrdemFiltro(p.esq,vaga);
			}
			
			if(p.esq == null && p.esq == null)
			{
				return vaga.getListaCandidatos();
			}
		}
		else
		{
			return vaga.getListaCandidatos();
		}
		
		return vaga.getListaCandidatos();
	}
	
	public ARVORE removeValor (ARVORE p, Candidato info) {
		if (p!=null){
			if(info.toString() == p.dado.toString()){
				if (p.esq == null && p.dir==null)
					//nó a ser removido é nó folha
					return null;
				if (p.esq==null){	
					//se não há sub-árvore esquerda o ponteiro passa apontar para a sub-árvore direita      
					return  p.dir;		
					}
				else{
					if (p.dir==null){		
						//se não há sub-árvore direita  o ponteiro passa apontar para a sub-árvore 	esquerda    		 
						return p.esq; 	     
						}
					else{
						/*o nó a ser retirado possui sub-arvore esquerda e direita, então o nó que  
	 		  			será retirado deve-se encontrar o menor valor na sub-árvore á direita */
						ARVORE aux, ref;
						ref = p.dir;
						aux = p.dir;
						while (aux.esq != null)
							aux = aux.esq;
						aux.esq = p.esq;
						return ref;
						}
					}
				}
			else{
				//procura dado a ser removido na ABB
				if(info.getTempoExperiencia() < p.dado.getTempoExperiencia())
					p.esq = removeValor(p.esq,info);
				else
					p.dir = removeValor(p.dir,info);
				}
			}
		return p;
	}
}
