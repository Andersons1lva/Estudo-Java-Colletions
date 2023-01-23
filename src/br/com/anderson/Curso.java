package br.com.anderson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	

	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas); // Collections.unmodifiableList(aulas), impede que adicione ou remove sem chamar o método adicionar
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	@Override
	public String toString() {
		
		return (" Nome: " + this.nome + "," + " Instrutor: " + this.instrutor);
	}
	

}
