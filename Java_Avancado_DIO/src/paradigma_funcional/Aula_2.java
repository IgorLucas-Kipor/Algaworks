package paradigma_funcional;

import java.util.Arrays;

public class Aula_2 {

	public static void main(String[] args) {
		int[] values = {1,2,3,4};
		
		Arrays.stream(values)
		.filter(number -> number % 2 == 0)
		.map(number -> number * 2)
		.forEach(number -> System.out.println(number));

	}

}
