package g.parallelarray;

import java.util.Arrays;

public class ParallelArraySample {

	public static void main(String[] args) {
		int[] intValues = new int[10];
		
		long start = System.currentTimeMillis();
		System.out.println("sort = " + start);
		Arrays.sort(intValues);
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		System.out.println("parallelSort = " + start);
		Arrays.parallelSort(intValues);
		System.out.println(System.currentTimeMillis() - start);
		
		
	}

}
