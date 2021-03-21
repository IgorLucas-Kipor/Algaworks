package interfaces_funcionais;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgunsTestes {

	public static void main(String[] args) {
        String[] nomes = {"Joao","Igor", "Paulo","Oliveira","Santos","Instrutor","Java"};
        
        String namesToPrint = Stream.of(nomes).filter(nome -> nome.toLowerCase().contains("o")).collect(Collectors.joining(" - "));
        
        System.out.println(namesToPrint);

	}

}
