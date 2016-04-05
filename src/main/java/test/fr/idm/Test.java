package test.fr.idm;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello IDM Ready Really");

		// Test Java 8
		Function<String, String> personString = p -> "Personne sélectionnée, age =" + p;
		System.out.println(personString.apply("toto"));

	}
}
