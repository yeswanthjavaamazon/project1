package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKeyToList {

	Map<Integer, String> map;

	public MapKeyToList(Map<Integer, String> map) {
		 this.map = map;
		}

	public List<Integer> convertKeysToList() {
		return new ArrayList(map.keySet());
	}

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(9, "Nine");
		map.put(10, "Ten");

		MapKeyToList conv = new MapKeyToList(map);
		List<Integer> keysList = conv.convertKeysToList();

		System.out.println("Keys:");

		for (Integer key : keysList) {
			System.out.println(key);
		}

	}
}