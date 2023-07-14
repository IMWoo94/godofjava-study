package d.lang.practice;

public class NumberObjects{
	public static void main(String[] args){
		NumberObjects n = new NumberObjects();
		n.parseLong("231");
		n.parseLong("n2323");
		n.printOtherBase(1024l);

	}

	public long parseLong(String data){
		long result;
		try{
			result = Long.parseLong(data);
		}catch(NumberFormatException e){
			System.out.println(data + " is not a number.");
			return -1;
		}
		return result;
	}

	public void printOtherBase(long value){
		System.out.println("Original : " + value);
		System.out.println("Binary : " + Long.toBinaryString(value));
		System.out.println("Hex : " + Long.toHexString(value));
		System.out.println("Octal : " + Long.toOctalString(value));

	}
}