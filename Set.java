package Set;

import java.util.HashSet;

public class Set {
	public static void main(String args[]) {
		// HashSet deklaration
		HashSet<String> hset = new HashSet<String>();
		

		


		// Elemente werden hinzugefügt
//		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("hello");
		// Elemente werden entfernt
		hset.remove("hello");
		// Zusätzliche Elemente, welche doppelt vorkommen
		hset.add("Apple");
		hset.add("Mango");
		// "null" Werte werden hinzugefügt
		hset.add(null);
		hset.add(null);

		// Ausgabe vom HashSet
//		System.out.println(hset);

		
		
		// Iteration
		
		
		HashSet<String> hset3 = new HashSet<String>();
		hset3.add("hallo");
		hset3.add("hoi");
		
		for (String s : hset3) {

			System.out.println(s);
			
		}

		
	}
}