public class ArrayInitValue{
	public static void main(String[] args){

		ArrayInitValue aiv = new ArrayInitValue();
		//aiv.pimitiveTypes();
		aiv.refereceTypes();
	}

	public void pimitiveTypes(){
		byte[] arrayByte = new byte[1];
		short[] arrayShort = new short[1];
		char[] arrayChar = new char[1];
		int[] arrayInt = new int[1];
		long[] arrayLong = new long[1];
		float[] arrayFloat = new float[1];
		double[] arrayDouble = new double[1];
		boolean[] arrayBoolean = new boolean[1];

		System.out.println(arrayByte[0]);
		System.out.println(arrayShort[0]);
		System.out.println(arrayChar[0]);
		System.out.println(arrayInt[0]);
		System.out.println(arrayLong[0]);
		System.out.println(arrayFloat[0]);
		System.out.println(arrayDouble[0]);
		System.out.println(arrayBoolean[0]);
	}

	public void refereceTypes(){
		String[] strings = new String[2];
		ArrayInitValue[] array = new ArrayInitValue[2];

		strings[1] = "test";
		array[1] = new ArrayInitValue();
		System.out.println(strings[0]);
		System.out.println(strings[1]);
		System.out.println(array[0]);
		System.out.println(array[1]);

	}
}