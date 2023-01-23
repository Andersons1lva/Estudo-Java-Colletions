package br.com.anderson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 22));
		javaColecoes.adiciona(new Aula("Modeloando com coleções", 19));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis); //Parace Precisar ordernar usando a class Colletions do Java foi necessario criar uma nova lista e passa a lista antiga
		
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
