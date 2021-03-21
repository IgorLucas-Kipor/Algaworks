package paradigma_funcional;

import java.util.function.BiPredicate;

public class Funcao_Pura {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> verificaSeMaior = 
				(parameter, comparator) -> parameter > comparator;
				
		System.out.println(verificaSeMaior.test(12, 13));
		System.out.println(verificaSeMaior.test(12, 13));

	}

}
