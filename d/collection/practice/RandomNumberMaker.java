package d.collection.practice;

import java.util.*;
import java.math.*;

public class RandomNumberMaker{

	public static void main(String[] args){
		RandomNumberMaker rnm = new RandomNumberMaker();
		
		for(int i = 0; i < 10; i++){
			System.out.println(rnm.getSixNumber());
		}
	}

	public HashSet<Integer> getSixNumber(){
		HashSet<Integer> hs = new HashSet<>();
		while(hs.size() < 6){
			Random random = new Random();
			int num = random.nextInt(45);
			
			hs.add(num);
		}

		return hs;
	}

}