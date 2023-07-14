public class PrimitiveType{
	public static void main(String[] args){
		PrimitiveType pt = new PrimitiveType();
		//pt.checkByte();
		//pt.checkOtherType();	
		//pt.checkChar();
		pt.checkBoolean();
	}

	public void checkByte(){
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println(byteMin);
		System.out.println(byteMax);
		byteMin = (byte)(byteMin - 1);
		byteMax = (byte)(byteMax + 1);
		System.out.println(byteMin);
		System.out.println(byteMax);
	}

	public void checkOtherType(){
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807l;
		System.out.println(shortMax);
		System.out.println(intMax);
		System.out.println(longMax);
		shortMax = (short)(shortMax + 1);
		intMax = (int)(intMax + 1);
		longMax = (long)(longMax + 1l);
		System.out.println(shortMax);
		System.out.println(intMax);
		System.out.println(longMax);

	}

	public void checkChar(){
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println(charMin);
		System.out.println(charMax);
		int intValue = 'a';
		System.out.println(intValue);
		System.out.println((char)intValue);
	}

	public void checkBoolean(){
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);

	}

	int intDefault1;
	public void defaultValues(){
		int intDefault2;
		System.out.println(intDefault1);
		System.out.println(intDefault2);
	}
}