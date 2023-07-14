public class Calculator{
	public static void main(String[] args){
		System.out.println("start Calculator class");

		Calculator cal = new Calculator();
		int a = 10;
		int b = 5;
	
		System.out.println(cal.add(a,b));
		System.out.println(cal.substract(a,b));
		System.out.println(cal.multiply(a,b));
		System.out.println(cal.divide(a,b));
	}

	public int add(int a, int b){
		int sum = a + b;
		return sum;
	}

	public int substract(int a, int b){
		int sum = a - b;
		return sum;
	}

	public int multiply(int a, int b){
		int sum = a * b;
		return sum;
	}

	public int divide(int a, int b){
		int sum = a / b;
		return sum;
	}
}