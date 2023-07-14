package e.thread.sync;


public class ModifyAmountThread extends Thread{

	private CommonCalculate cals;
	private boolean addFlag;
	public ModifyAmountThread(CommonCalculate cals, boolean addFlag){
		this.cals = cals;
		this.addFlag= addFlag;
	}

	public void run(){

		for(int i =0; i<10000; i++){
			if(addFlag){
				cals.plus(1);
			}else{
				cals.minus(1);
			}
		}
	}
}