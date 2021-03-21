package paradigma_funcional;

public class Lambda {

	public static void main(String[] args) {

		Funcao generatePrint = value -> {
				System.out.println("Sr. "+value);
				return value;
		};
		
		System.out.println(generatePrint.generate("Igor"));

	}
	
	@FunctionalInterface
	interface Funcao {
		String generate(String value);
	}

}
