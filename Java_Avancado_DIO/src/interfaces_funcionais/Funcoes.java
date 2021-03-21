package interfaces_funcionais;

import java.util.function.Function;

public class Funcoes {

	public static void main(String[] args) {

		Function <String, String> returnReversedName = text -> new StringBuilder(text).reverse().toString();
		Function <String, Integer> convertStringToIntegerAndDouble = string -> Integer.valueOf(string)*2;
		System.out.println(returnReversedName.apply("livia"));
		System.out.println(convertStringToIntegerAndDouble.apply("20"));
	}

}
