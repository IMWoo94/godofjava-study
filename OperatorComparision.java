public class OperatorComparision{
	public static void main(String[] args){
		OperatorComparision oc = new OperatorComparision();
		//oc.comparision();
		oc.comparision2();
	}

	public void comparision(){
		int intValue1 = 1;
		int intValue2 = 2;
		int intValue3 = 1;

		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1 == intValue3);
		System.out.println(intValue2 == intValue3);

	}

	public void comparision2(){
		char charValue = 'a';
		int intVaue = 97;
		System.out.println(charValue == intVaue);
		int intValue2 = 1;
		double doubleValue = 1.0;
		System.out.println(intValue2 == doubleValue);

		boolean booleanValue = true;
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;
		System.out.println(booleanValue == booleanValue1);
		System.out.println(booleanValue == booleanValue2);

	}

}