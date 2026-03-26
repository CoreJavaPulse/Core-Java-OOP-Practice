package demoMapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Map<String,Integer> treemap = new TreeMap<String,Integer>();
		treemap.put("Maruti", 645342);
		treemap.put("BMW",343225);
		treemap.put("Toyota", 898324);
		treemap.put("Tata", 245364);
		System.out.println("Tree Map Is :"+treemap);

		System.out.println(treemap.get("Tata"));
		System.out.println(treemap.containsKey("BMW"));
		treemap.remove("Toyota");
		
		Set<String> keyset = treemap.keySet();
		for(String s: keyset)
		{
			System.out.println("Key "+s+" Values : "+treemap.get(s));
		}
		
		Map<String,Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("Maruti", 645342);
		hashmap.put("BMW",343225);
		hashmap.put("Toyota", 898324);
		hashmap.put("Tata", 245364);
		System.out.println("Hash Map Is :"+hashmap);

	}

}
