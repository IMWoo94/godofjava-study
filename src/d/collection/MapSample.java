package d.collection;

import java.util.*;
import java.util.Map.Entry;

public class MapSample{

	public static void main(String[] args){
		MapSample ms = new MapSample();
		//ms.checkHashMap();
		//ms.checkKeySet();
		//ms.checkValues();
		//ms.checkHashMapEntry();
		//ms.checkContains();
		ms.checkRemove();

	}

	public void checkHashMap(){
		HashMap<String, String> map = new HashMap<>();

		map.put("A","a");
		System.out.println(map.get("A"));
		map.put("A","1");
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
	}

	public void checkKeySet(){
		HashMap<String, String> map = new HashMap<>();

		map.put("A","a");
		map.put("B","1");

		Set<String> set = map.keySet();
		for(String str : set){
			System.out.println(str);
		}

		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

	public void checkValues(){
		HashMap<String, String> map = new HashMap<>();

		map.put("A","a");
		map.put("B","1");

		Collection<String> values = map.values();
		for(String str : values){
			System.out.println(str);
		}

		Iterator<String> it = values.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

	public void checkHashMapEntry(){
		HashMap<String, String> map = new HashMap<>();

		map.put("A","a");
		map.put("B","1");
		map.put("C","1");
		map.put("D","12");

		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> temp : entries){
			System.out.println(temp.getKey() + " : " + temp.getValue());
		}
	}

	public void checkContains(){
		HashMap<String, String> map = new HashMap<>();

		map.put("A","a");
		map.put("B","1");
		map.put("C","1");
		map.put("D","12");

		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("BE"));
		System.out.println(map.containsValue("a"));
		System.out.println(map.containsValue("A"));

	}

	public void checkRemove(){
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>(50);
		System.out.println(map.size());
		System.out.println(map2.size());
		map.put("A","a");
		System.out.println(map.size());
		System.out.println(map.remove("A"));
		System.out.println(map.size());

	}
}