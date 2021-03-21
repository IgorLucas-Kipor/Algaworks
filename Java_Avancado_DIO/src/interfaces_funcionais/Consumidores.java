package interfaces_funcionais;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> printPhraseOne = System.out::println;
		
//		Consumer<String> printPhraseOne = phrase -> System.out.println(phrase);
	
		printPhraseOne.accept("Hello World.");

	}

}
