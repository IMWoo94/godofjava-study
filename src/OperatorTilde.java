public class OperatorTilde{
	public static void main(String[] args){
		OperatorTilde ot = new OperatorTilde();
		byte b = 127;
		ot.printTildeResult(b);
		b = 1;
		ot.printTildeResult(b);

	}

	public void printTildeResult(byte b){
		System.out.println("Original value = " + b);
		System.out.println("Tilde value = " + ~b);
	}


}