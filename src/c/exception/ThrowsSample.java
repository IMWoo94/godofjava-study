package c.exception;

import java.lang.ArrayIndexOutOfBoundsException;
public class ThrowsSample{

	public static void main(String[] args){
		ThrowsSample ts = new ThrowsSample();
		ts.throwsSample(13);
	}

	public void throwsSample(int number){
		try{
			if(number > 12){
				throw new Exception("number is over than 12");
			}
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