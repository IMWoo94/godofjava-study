public class OperatorUnary{
	public static void main(String[] args){
		OperatorUnary ou = new OperatorUnary();
		ou.unary();

	}

	public void unary(){
		int intValue = -10;
		int result = +intValue;
		System.out.println(result);
		result = -intValue;
		System.out.println(result);
	}


}