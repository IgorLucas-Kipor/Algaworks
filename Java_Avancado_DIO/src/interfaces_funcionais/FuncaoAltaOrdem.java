package interfaces_funcionais;


//Função de alta ordem é uma função que recebe outra função
//ou que retorna outra função



public class FuncaoAltaOrdem {

	public static void main(String[] args) {

		Calculate sum = (a,b) -> a+b;
		Calculate multiply = (a,b) -> a*b;
		Calculate subtract = (a,b) -> a-b;
		Calculate divide = (a,b) -> a/b;
		
		System.out.println(runOperation(sum, 1, 3));
		System.out.println(runOperation(multiply, 2, 4));
		System.out.println(runOperation(subtract, 5, 3));
		System.out.println(runOperation(divide, 8, 2));

	}
	
	public static int runOperation(Calculate operation, int a, int b) {
		return operation.calculate(a, b);
	}
	
	@FunctionalInterface
	interface Calculate {
		public int calculate(int a, int b);
	}

}
