package d.lang;

public class JavaLangNumber{
	public static void main(String[] args){
		JavaLangNumber sample = new JavaLangNumber();
		sample.numberTypeCheck();
		sample.numberTypeCheck2();
		sample.numberMinMaxCheck();
		sample.integerMinMaxCheckBinary();
	}

	public void numberTypeCheck(){
		String str1 = "3";
		String str2 = "5";
		byte byte1 = Byte.parseByte(str1);
		byte byte2 = Byte.parseByte(str2);
		System.out.println(byte1 + byte2);

		Integer refInt1 = Integer.valueOf(str1);
		Integer refInt2 = Integer.valueOf(str2);

		System.out.println(refInt1 + refInt2 + "7");
	}

	public void numberTypeCheck2(){
		Integer refInt;
		refInt = 3;
		System.out.println(refInt.doubleValue());
	}

	public void numberMinMaxCheck(){
		System.out.println("Byte min = " + Byte.MIN_VALUE + " | Byte max = " + Byte.MAX_VALUE);
		System.out.println("Short min = " + Short.MIN_VALUE + " | Short max = " + Short.MAX_VALUE);
		System.out.println("Integer min = " + Integer.MIN_VALUE + " | Integer max = " + Integer.MAX_VALUE);
		System.out.println("Long min = " + Long.MIN_VALUE + " | Long max = " + Long.MAX_VALUE);
		System.out.println("Float min = " + Float.MIN_VALUE + " | Float max = " + Float.MAX_VALUE);
		System.out.println("Double min = " + Double.MIN_VALUE + " | Double max = " + Double.MAX_VALUE);
		System.out.println("Character min = " + (int)Character.MIN_VALUE + " | Character max = " + (int)Character.MAX_VALUE);
	}

	public void integerMinMaxCheckBinary(){
		System.out.println("Integer BINARY MIN = " + Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("Integer BINARY MAX = " + Integer.toBinaryString(Integer.MAX_VALUE));

		System.out.println("Integer HEX MIN = " + Integer.toHexString(Integer.MIN_VALUE));
		System.out.println("Integer HEX MAX = " + Integer.toHexString(Integer.MAX_VALUE));

	}
}