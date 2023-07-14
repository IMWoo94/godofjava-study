public class OperatorCompound{

	public static void main(String[] args){
		OperatorCompound oc = new OperatorCompound();
		oc.compound();
	}

	public void compound(){
		int intValue = 10;
		intValue += 5;
		System.out.println(intValue);

		intValue -= 5;
		System.out.println(intValue);

		intValue *= 5;
		System.out.println(intValue);

		intValue /= 5;
		System.out.println(intValue);

		intValue %= 5;
		System.out.println(intValue);

	}

}