package c.exception;

import java.lang.ArrayIndexOutOfBoundsException;
public class FinallySample{

	public static void main(String[] args){
		FinallySample fs = new FinallySample();
		fs.finallySample();
	}

	public void finallySample(){
		int[] array = null;
		try{
			array = new int[5];
			System.out.println(array[5]);
			System.out.println("This code should run.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException 일어났어요");
			System.out.println(array.length);
		}finally{
			System.out.println("무조건");
		}

		System.out.println("This code must run.");
	}
}