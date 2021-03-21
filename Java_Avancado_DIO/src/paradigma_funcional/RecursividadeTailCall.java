package paradigma_funcional;

public class RecursividadeTailCall {

	public static void main(String[] args) {

		System.out.println(factorialA(5));

	}
	
	public static double factorialA(double value) {
		return factorialTailCall(value, 1);
	}
	
	public static double factorialTailCall(double value, double number) {
		if (value == 0) {
			return number;
		}
		return factorialTailCall(value-1, number*value);
	}

}
