package c.exception;

import java.lang.ArrayIndexOutOfBoundsException;
public class ThrowableSample{

	public static void main(String[] args){
		ThrowableSample ts = new ThrowableSample();
		ts.throwableSample();
	}

	public void throwableSample(){
		int[] array = null;
		try{
			array = new int[5];
			System.out.println(array[5]);
			System.out.println("This code should run.");
		}catch(Throwable t){
			System.out.println("t.getMessage()" + t.getMessage());
			System.out.println("t.toString()" + t.toString());
			System.out.println("t.printStackTrace()");
			t.printStackTrace();
		}finally{
			System.out.println("¹«Á¶°Ç");
		}

		System.out.println("This code must run.");
	}
}