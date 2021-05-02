
public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();
		
		Alunos aluno1 = new Alunos();
		aluno1.nome = "João";
		lista.adicionar(aluno1);
		
		Alunos aluno2 = new Alunos();
		aluno2.nome = "Maria";
		lista.adicionar(aluno2);
		
		Alunos aluno3 = new Alunos();
		aluno3.nome = "Alexandre";
		lista.adicionar(aluno3);
		
		Alunos aluno4 = new Alunos();
		aluno4.nome = "Thiago";
		lista.adicionar(aluno4);
		
		Alunos aluno5 = new Alunos();
		aluno5.nome = "Normandes";
		lista.adicionar(aluno5);
		
		Alunos aluno6 = new Alunos();
		aluno6.nome = "Luíza";
		lista.adicionar(aluno6);
		
		iterar(lista);
		
		lista.remover(aluno4);
		
		iterar(lista);
		
		lista.ordenar();
		
		iterar(lista);
	}
	
	static void iterar(ListaAlunos lista) {
		for (int i=0; i<lista.tamanho();i++) {
			Alunos a = lista.obter(i);
			if (a != null) {
				System.out.println("Aluno: "+a.nome);
			} else {
				System.out.println("Aluno sem nome.");
			}
		}
		
		System.out.println("---------------------------------------");
	}

}
