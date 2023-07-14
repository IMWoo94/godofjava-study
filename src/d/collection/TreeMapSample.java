package d.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample{
	public static void main(String[] args){
		TreeMapSample tms = new TreeMapSample();
		tms.checkTreeMap();

	}

	public void checkTreeMap(){
		TreeMap<String, String> map = new TreeMap<>();

		map.put("A", "a");
		map.put("가1", "e1");
		map.put("가6", "e2");
		map.put("가11", "e3");
		map.put("가A", "e4");
		map.put("가b", "e5");
		map.put("가", "e");
		map.put("1", "f");
		map.put("a", "g");

		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> temp : entries){
			System.out.println(temp.getKey() + " : " + temp.getValue());

		}

	}

}