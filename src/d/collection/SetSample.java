package d.collection;
import java.util.*;

public class SetSample{

	public static void main(String[] args){
		SetSample ss = new SetSample();
		String[] str = new String[] {
			"Tico", "Sonata", "BMW", "Benz", "Mini Cooper", "Sonata"
		};

		System.out.println(ss.getCarKinds(str));
	}

	public int getCarKinds(String[] arr){
		
		int size = 0;
		if(arr == null) return 0;
		if(arr.length == 1 ) return 1;
		Set<String> hs = new HashSet<>();
		for(String str : arr){
			hs.add(str);
		}
		size = hs.size();
		return size;
	}
}