
public class Alunos {
	
	String nome;
	
	boolean vemDepoisDe(Alunos aluno) {
		if (aluno == null) {
			return false;
		} else {
			return nome.compareTo(aluno.nome) > 0;
		}
	}
	
}
