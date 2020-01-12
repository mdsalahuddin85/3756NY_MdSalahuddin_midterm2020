package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfBD = new ArrayList<>();
		cityOfBD.add("Dhaka");
		cityOfBD.add("Comilla");
		cityOfBD.add("Barisal");
		cityOfBD.add("Mymensing");
		cityOfBD.add("Sylhet");
		List<String> cityOfUsa = new ArrayList<>();
		cityOfUsa.add("New York");
		cityOfUsa.add("New Jersey");
		cityOfUsa.add("Texas");
		cityOfUsa.add("Virginia");
		cityOfUsa.add("Florida");
		List<String> cityOfUk = new ArrayList<>();
		cityOfUk.add("London");
		cityOfUk.add("Bristol");
		cityOfUk.add("Liverpool");
		cityOfUk.add("York");
		cityOfUk.add("Belfast");
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("BD",cityOfBD);
		list.put("UK", cityOfUk);
		list.put("USA",cityOfUsa);
		System.out.println(list);
		System.out.println(" ");
		System.out.println("Printout the values using for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " --------> " +st.getValue());
		}
		System.out.println(" ");
		System.out.println("Printout the values using iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
