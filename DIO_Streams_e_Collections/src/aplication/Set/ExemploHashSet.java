package aplication.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<Double> notaAlunos = new HashSet<>();
		
		//adicionando notas
		
		notaAlunos.add(6.8);
		notaAlunos.add(8.9);
		notaAlunos.add(2.5);
		notaAlunos.add(4.3);
		notaAlunos.add(7.1);
		notaAlunos.add(9.4);
		notaAlunos.add(3.2);
		notaAlunos.add(5.0);
		
		System.out.println(notaAlunos);
		
		notaAlunos.remove(7.1);
		
		System.out.println(notaAlunos);
		
		//retorna a quantidade de itens do set
		
		notaAlunos.add(4.32);
		
		System.out.println(notaAlunos);
		
		System.out.println(notaAlunos.size());
		
		//navega usando iterador
		
		Iterator<Double> iterador = notaAlunos.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		for (Double i : notaAlunos) {
			System.out.println(i);
		}

	}

}
