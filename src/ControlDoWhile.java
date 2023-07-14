public class ControlDoWhile{
	public static void main(String[] args){
		ControlDoWhile cdw = new ControlDoWhile();
		cdw.doWhile();

	}

	public void doWhile(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;
		do{
			loop++;
			cof.switchCalendar(loop);
		}while(loop < 12);
	}

}