package d.collection;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample{
	public static void main(String[] args){
		PropertiesSample ps = new PropertiesSample();
		ps.checkProperties();
	}

	public void checkProperties(){
		Properties pro = System.getProperties();
		Set<Object> keySet = pro.keySet();
		for(Object temp : keySet){
			System.out.println(temp + " : " + pro.get(temp));
		}
	}

}