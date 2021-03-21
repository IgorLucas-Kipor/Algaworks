package aplication.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashset {

	public static void main(String[] args) {

		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		//adicionando numeros
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(32);
		
		System.out.println(sequenciaNumerica);
		
		//removendo elemento
		
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica);
		
		System.out.println(sequenciaNumerica.size());
		
		Iterator<Integer> iterador = sequenciaNumerica.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
