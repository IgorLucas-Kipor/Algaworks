package aplication.mapAndVector;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleMap {

	public static void main(String[] args) {

		Map<String, Integer> campeoesMundiaisFifa = new LinkedHashMap();
		
		//Adiciona os campeões mundiais da Fifa
		
		campeoesMundiaisFifa.put("Brasil", 5);
		campeoesMundiaisFifa.put("Alemanha", 4);
		campeoesMundiaisFifa.put("Itália", 4);
		campeoesMundiaisFifa.put("Uruguai", 2);
		campeoesMundiaisFifa.put("Argentina", 2);
		campeoesMundiaisFifa.put("França", 2);
		campeoesMundiaisFifa.put("Inglaterra", 1);
		campeoesMundiaisFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundiaisFifa);
		
		//atualiza valor em Brasil
		
		campeoesMundiaisFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundiaisFifa);
		
		//retorna a argentina
		
		System.out.println(campeoesMundiaisFifa.get("Argentina"));
		
		//retorna se existe ou não uma seleção chamada frança
		
		System.out.println(campeoesMundiaisFifa.containsKey("França"));
		
		//verifica se alguma seleção é hexacampeã
		
		System.out.println(campeoesMundiaisFifa.containsValue(6));
		
		//retorna tamanho do mapa
		
		System.out.println(campeoesMundiaisFifa.size());
		
		//navega pelo mapa
		
		for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
			System.out.println(entry.getKey() + " -------- " + entry.getValue());
		}
		
		//navegar 2° forma
		
		for (String k : campeoesMundiaisFifa.keySet()) {
			System.out.println(k + " ================= " + campeoesMundiaisFifa.get(k));
		}
		

	}

}
