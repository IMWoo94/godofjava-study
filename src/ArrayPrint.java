public class ArrayPrint{
	public static void main(String[] args){
		ArrayPrint ap = new ArrayPrint();
		ap.printString();
		ap.printPrimitiveArray();
	}

	public void printString(){
		System.out.println("strings = " + new String[0]);
		System.out.println("array = " + new ArrayPrint[0]);
	}

	public void printPrimitiveArray(){
		System.out.println(new byte[1]);
		System.out.println(new short[1]);
		System.out.println(new char[1]);
		System.out.println(new int[1]);
		System.out.println(new long[1]);
		System.out.println(new float[1]);
		System.out.println(new double[1]);
		System.out.println(new boolean[1]);

	}

}