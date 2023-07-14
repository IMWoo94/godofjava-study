package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics{

	private final int DATA_BOUNDARY = 50;
	public Hashtable<Integer, Integer> hashtable = new Hashtable<>();

	public static void main(String[] args){
		RandomNumberStatistics rns = new RandomNumberStatistics();
		rns.getRandomNumberStatistics();
	}

	public void getRandomNumberStatistics(){
		for(int i = 0; i < 5000; i++){
			Random ran = new Random();
			int num = ran.nextInt(DATA_BOUNDARY);
			putCurrentNumber(num);
		}


		printStatistics();
	}

	public void putCurrentNumber(int tempNumber){
		if(hashtable.containsKey(tempNumber)){
			hashtable.put(tempNumber, hashtable.get(tempNumber)+1);	
		}else{
			hashtable.put(tempNumber, 1);	
		}
	}

	public void printStatistics(){
		Set<Integer> set = hashtable.keySet();
		for(int temp : set){
			if(temp%10-1 == 0) System.out.println();
			System.out.print(temp + "=" + hashtable.get(temp) +" ");	
		}
	}

}