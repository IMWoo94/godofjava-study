public class ControlFor{
	public static void main(String[] args){
		ControlFor cf = new ControlFor();
		cf.forLoop(10);

	}

	public void forLoop(int until){
		int sum = 0;
		for(int i = 0; i < until; i++){
			sum += i;
		}

		System.out.println("1 to " + until + " = " + sum);

	}

}