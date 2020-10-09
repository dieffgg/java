package Vaga;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Candidato;

public class Vaga 
{
	String curso;
	int exp;
	float salario;
	List<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}

	public void setListaCandidatos(Candidato candidato) {
		listaCandidatos.add(candidato);
	}
	
	public void setListaCandidatos2(List <Candidato> lista) {
		listaCandidatos = lista;
	}
	
	public void removeLista(Candidato candidato) {
		listaCandidatos.remove(candidato);
	}
	
	public String toString() {
		return "Vaga [curso=" + curso + ", exp=" + exp + ", salario=" + salario + "]";
	}
	
	public Vaga(String curso, int exp, float salario) {
		super();
		this.curso = curso;
		this.exp = exp;
		this.salario = salario;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
