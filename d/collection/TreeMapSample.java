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
		map.put("��1", "e1");
		map.put("��6", "e2");
		map.put("��11", "e3");
		map.put("��A", "e4");
		map.put("��b", "e5");
		map.put("��", "e");
		map.put("1", "f");
		map.put("a", "g");

		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> temp : entries){
			System.out.println(temp.getKey() + " : " + temp.getValue());

		}

	}

}