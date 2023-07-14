public class StaticBlock{
	static int data = 1;
	public StaticBlock(){
		System.out.println("StaticBlokc Constructor");
	}

	static {
		System.out.println("*** First static block. ***");
		data = 5;
	}

	static {
		System.out.println("*** Second static block. ***");
		data = 3;
	}

	public static int getData(){
		return data;
	}	

}