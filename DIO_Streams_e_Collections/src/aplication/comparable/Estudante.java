package aplication.comparable;

public class Estudante implements Comparable<Estudante>{
	
	private String nome;
	private int idade;
	
	public Estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getName() {
		return nome;
	}

	public int getAge() {
		return idade;
	}
	
	@Override
	public String toString() {
		return nome + " - " + idade;
	}
	
	@Override
	public int compareTo (Estudante o) {
		return this.getAge() - o.getAge();
	}
	
	

}
