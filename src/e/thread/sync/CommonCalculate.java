package e.thread.sync;

public class CommonCalculate{
	private int amount;
	Object lock = new Object();

	public CommonCalculate(){
		amount = 0;
	}

	public void plus(int num){
		
		synchronized(lock){
			amount += num;
		}
		
	}

	public void minus(int num){
		synchronized(this){
			amount -= num;
		}
		
	}

	public int getAmount(){
		return amount;
	}

}