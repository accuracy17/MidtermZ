package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
			Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
			myMap.put(1, 20);
			myMap.put(2, 30);
			myMap.put(3, 40);

			System.out.println(myMap.get(2));
		}


}
