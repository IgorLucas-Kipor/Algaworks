package paradigma_funcional;

import java.util.HashMap;
import java.util.Map;

public class Memorization {

	static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();
	public static void main(String[] args) {
		
		long I = System.nanoTime();
		System.out.println(factorialMemorization(15));
		long F = System.nanoTime();
		System.out.println("Tempo de execução do primeiro fatorial: " + (F-I));
		
		I = System.nanoTime();
		System.out.println(factorialMemorization(15));
		F = System.nanoTime();
		System.out.println("Tempo de execução do segundo fatorial: " + (F-I));
		
	}
	
	public static Integer factorialMemorization(Integer value) {
		if (value == 1) {
			return value;
		} else {
			if (MAPA_FATORIAL.containsKey(value)) {
				return MAPA_FATORIAL.get(value);
			} else {
				Integer result = value * factorialMemorization(value-1);
				MAPA_FATORIAL.put(value, result);
				return result;
			}
		}
	}

}
