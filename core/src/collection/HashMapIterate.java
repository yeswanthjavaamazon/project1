package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterate {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "yeswanth");
		map.put("age", "30");

		// Method 1
		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}

		// Method 2
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> mapite = (Entry<String, String>) itr.next();
			System.out.println(mapite.getKey() + " -> " + mapite.getValue());
		}
		
		// Method 3
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}
}
