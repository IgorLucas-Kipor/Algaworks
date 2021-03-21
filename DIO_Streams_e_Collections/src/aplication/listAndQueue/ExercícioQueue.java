package aplication.listAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercícioQueue {

	public static void main(String[] args) {
		
		Queue<String> exercise = new LinkedList<>();
		
		exercise.add("Juliana");
		exercise.add("Pedro");
		exercise.add("Carlos");
		exercise.add("Larissa");
		exercise.add("João");
		
		for (String n : exercise) {
			System.out.println(n);
		}
		
		System.out.println(exercise.peek());
		
		System.out.println(exercise.poll());
		
		exercise.add("Daniel");
		
		System.out.println(exercise.size());
		
		System.out.println(exercise.isEmpty());
		
		System.out.println(exercise.contains("Carlos"));

	}

}
