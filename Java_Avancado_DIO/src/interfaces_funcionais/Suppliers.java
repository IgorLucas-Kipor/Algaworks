package interfaces_funcionais;

import java.util.function.Supplier;

public class Suppliers {

	public static void main(String[] args) {
		
		Supplier<Person> personInstance = () -> new Person();
		System.out.println(personInstance.get());

	}
	
	}

class Person {
	private String name;
	private Integer age;
	
	public Person() {
		name = "Igor";
		age = 25;
	}
	
	@Override
	public String toString() {
		return String.format("nome: %s, idade: %d", name, age);
	}

}
