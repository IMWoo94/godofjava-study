public class PrimitiveTypeSecond{
	byte byteDefault;
	short shortDefault;
	int intDefault;
	long longDefault;
	char charDefault;

	float floatDefault;
	double doubleDefault;

	boolean booleanDefault;

	public static void main(String[] args){
		PrimitiveTypeSecond pts = new PrimitiveTypeSecond();
		pts.defaultValues();

	}

	public void defaultValues(){
		System.out.println("byteDefault : " + byteDefault);
		System.out.println("shortDefault : " + shortDefault);
		System.out.println("intDefault : " + intDefault);
		System.out.println("longDefault : " + longDefault);
		System.out.println("charDefault : " + charDefault);
		System.out.println();
		System.out.println("floatDefault : " + floatDefault);
		System.out.println("doubleDefault : " + doubleDefault);
		System.out.println();
		System.out.println("booleanDefault : " + booleanDefault);
		
	}

}