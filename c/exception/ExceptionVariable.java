package c.exception;

import java.lang.ArrayIndexOutOfBoundsException;
public class ExceptionVariable{

	public static void main(String[] args){
		ExceptionVariable ev = new ExceptionVariable();
		ev.checkVariable();
	}

	public void checkVariable(){
		int[] array = null;
		try{
			array = new int[5];
			System.out.println(array[5]);
			System.out.println("This code should run.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException ÀÏ¾î³µ¾î¿ä");
			System.out.println(array.length);
		}

		System.out.println("This code must run.");
	}
}