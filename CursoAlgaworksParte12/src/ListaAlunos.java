
public class ListaAlunos {
	
	static final int QUANTIDADE_LISTA = 5;
	
	Alunos[] lista = new Alunos[QUANTIDADE_LISTA];
	
	int tamanhoLista = 0;
	
	Alunos obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Alunos aluno) {
		
		if (lista.length == tamanhoLista) {
			Alunos[] novaLista = new Alunos[QUANTIDADE_LISTA+lista.length];
			
			for (int i=0; i<lista.length; i++) {
				novaLista[i] = lista[i];
			}
			
			lista = novaLista;
		}
		
		
		lista[tamanhoLista] = aluno;
		
		tamanhoLista++;
	}
	
	void remover(Alunos aluno) {
		for (int i=0; i < tamanhoLista; i++) {
			Alunos a = lista[i];
			if (a != null && a.equals(aluno)) {
				remover(i);
				break;
			} else if (a == null && aluno==null) {
				remover(i);
				break;
			}
		}
	}
	
	void remover(int indice) {
		int indiceInicial = indice+1;
		
		for (int i=indiceInicial; i<tamanhoLista; i++) {
			lista[i - 1] = lista[i]; 
		}
		
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	
	void ordenar() {
		for (int i = 1; i < tamanhoLista; i++) {
			Alunos alunoPosicaoBase = lista[i];
			int indicePosicaoBase = i;
			while (indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase-1;
				Alunos alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				if (alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase) || alunoPosicaoAnterior == null) {
					lista[indicePosicaoBase] = alunoPosicaoAnterior;
					indicePosicaoBase--;
				} else {
					break;
				}
			}
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
	}

}
