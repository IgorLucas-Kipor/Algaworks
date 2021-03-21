package aplication.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComList {


	public static void main(String[] args) {

		List<Estudante> estudantes = new ArrayList<>();
		
		estudantes.add(new Estudante("Igor", 25));
		estudantes.add(new Estudante("Rodrigo", 19));
		estudantes.add(new Estudante("Isaías", 22));
		estudantes.add(new Estudante("Ângela", 23));
		estudantes.add(new Estudante("Isabella", 28));
		estudantes.add(new Estudante("Guilherme", 21));
		estudantes.add(new Estudante("Márcia", 22));
		estudantes.add(new Estudante("Anna", 20));
		estudantes.add(new Estudante("Bruno", 32));
		
		System.out.println("---------------Ordem de inserção--------------------");
		System.out.println();
		
		System.out.println(estudantes);
		
		System.out.println();
		
		System.out.println("---------------Ordem natural--------------------");
		
		estudantes.sort((first, second) -> first.getAge() - second.getAge());
		
		System.out.println(estudantes);
		
		System.out.println();
		
		System.out.println("---------------Ordem reversa--------------------");
		
		estudantes.sort((first, second) -> second.getAge() - first.getAge());
		
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getAge));
		
		System.out.println();
		
		System.out.println("---------------Ordem natural (com método)--------------------");
		
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getAge).reversed());
		
		System.out.println();
		
		System.out.println("---------------Ordem reversa (com método)--------------------");
		
		System.out.println(estudantes);
		
		System.out.println();
		
		Collections.sort(estudantes);
		
		System.out.println("---------------Ordem natural (com collections)--------------------");
		
		System.out.println(estudantes);
		
		Collections.sort(estudantes, new EstudanteOrdemReversaComparator());
		
		System.out.println();
		
		System.out.println("---------------Ordem reversa (com collections)--------------------");
		
		System.out.println(estudantes);

	}

}
