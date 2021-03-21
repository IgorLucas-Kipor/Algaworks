package aplication.listAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávia");
		filaBanco.add("Pâmela");
		filaBanco.add("Anderson");
		filaBanco.add("Miriam");
		filaBanco.add("Igor");
		
		System.out.println(filaBanco);
		
		String pessoaSairFila = filaBanco.poll();
		
		System.out.println(pessoaSairFila);
		
		System.out.println(filaBanco);
		
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);
		
//		filaBanco.clear();
		
		String primeiroClienteOuErro = filaBanco.element();
		
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		for (String cliente : filaBanco) {
			System.out.println(cliente);
		}
		
		System.out.println(filaBanco.size());

	}

}
