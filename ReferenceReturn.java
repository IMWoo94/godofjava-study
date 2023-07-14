public class ReferenceReturn{

	public static void main(String[] args){
		ReferenceReturn rr = new ReferenceReturn();
		System.out.println(rr.intReturn());
		System.out.println(rr.intArrayReturn());
		System.out.println(rr.stringReturn());
	}

	public int intReturn(){
		int result = 0;
		return result;
	}

	public int[] intArrayReturn(){
		int[] intArray = new int[5];
		return intArray;
	}

	public String stringReturn(){
		String str = "string";
		return str;
	}
}