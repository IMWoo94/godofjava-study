package e.thread.sync;

public class RunSync{
	public static void main(String[] args){
		RunSync rs = new RunSync();
		for(int i = 0; i<5; i++){
			rs.runCommonCalculate();
		}
		
	}

	public void runCommonCalculate(){
		CommonCalculate cal = new CommonCalculate();
		ModifyAmountThread m1 = new ModifyAmountThread(cal, true);
		ModifyAmountThread m2 = new ModifyAmountThread(cal, true);

		m1.start();
		m2.start();
		try{
			m1.join();
			m2.join();
			System.out.println("Final value is " + cal.getAmount());

		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}