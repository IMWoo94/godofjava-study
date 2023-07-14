package c.exception;

import java.lang.ArrayIndexOutOfBoundsException;
public class ExceptionSample{

	public static void main(String[] args){
		ExceptionSample es = new ExceptionSample();
		//es.arrayOutOfBounds();
		es.arrayOutOfBoundsTryCatch();
	}

	public void arrayOutOfBounds(){
		int[] array = new int[5];
		System.out.println(array[5]);
	}

	public void arrayOutOfBoundsTryCatch(){
		try{
			int[] array = new int[5];
			System.out.println(array[5]);
			System.out.println("This code should run.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException ÀÏ¾î³µ¾î¿ä");
		}
		
	}
}