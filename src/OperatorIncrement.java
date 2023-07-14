public class OperatorIncrement{
	public static void main(String[] args){
		OperatorIncrement oi = new OperatorIncrement();
		oi.increment();

	}

	public void increment(){
		int intValue = 1;
		System.out.println(intValue++);
		System.out.println(intValue);
		System.out.println(++intValue);
	}


}