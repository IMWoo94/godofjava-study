public class ControlIfElse{
	public static void main(String[] args){
		ControlIfElse cie = new ControlIfElse();
		cie.ifElseStatement();
	}

	public void ifElseStatement(){
		int intValue = 5;

		if(intValue > 5) System.out.println("it's bigger than 5.");
		else System.out.println("it's smaller or equals than 5.");
		
		if(intValue <= 5) System.out.println("it's smaller or equals than 5.");
		else System.out.println("it's bigger than 5.");


	}

}