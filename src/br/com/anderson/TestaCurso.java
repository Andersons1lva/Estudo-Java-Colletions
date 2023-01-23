package br.com.anderson;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java Colletions","Ricardo");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21)); // forma usando o metodo adiciona.
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modellando com Coleções", 22));
		System.out.println(javaColecoes.getAulas());
	}

}
