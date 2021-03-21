package aplication.mapAndVector;

import java.util.List;
import java.util.Vector;

public class ExampleVector {

	public static void main(String[] args) {

		List<String> sports = new Vector<>();
		
		//Adiciona 4 esportes no Vectorr
		
		sports.add("Football");
		sports.add("Basketball");
		sports.add("Tennis");
		sports.add("Handball");
		
		System.out.println(sports);
		
		//Altera o valor da posição 2 do Vector
		
		sports.set(2, "Ping-pong");
		
		System.out.println(sports);
		
		//Remove o esporte na posição 2
		
		sports.remove(2);
		
		System.out.println(sports);
		
		//Remove o esporte Handball
		
		sports.remove("Handball");
		
		System.out.println(sports);
		
		//Retorna o primeiro item
		
		System.out.println(sports.get(0));
		
		//Iterar com for each
		
		for(String v : sports) {
			System.out.println(v);
		}
		

	}

}
