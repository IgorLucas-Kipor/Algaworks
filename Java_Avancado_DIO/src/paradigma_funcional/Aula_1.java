package paradigma_funcional;

import java.util.function.UnaryOperator;

public class Aula_1 {

	public static void main(String[] args) {
		UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3; //um conceito de paradigma funcional
		
		int valor = 10;
		
		System.out.println("O resultado é: " + calcularValorVezesTres.apply(valor));

	}

}
