public class ControlWhile{
	public static void main(String[] args){
		ControlWhile cw = new ControlWhile();
		//cw.whileLoop1();
		//cw.whileLoop2();
		//cw.whileBreak();
		//cw.whileContinue();
		cw.whileContinueInfinit();
	}

	public void whileLoop1(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;

		while(loop < 12){
			loop++;
			cof.switchCalendar(loop);
		}

	}

	public void whileLoop2(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;

		while(loop < 12){
			loop++;
			cof.switchCalendar(loop);
			if(loop == 6) loop = 100;
		}

	}

	public void whileBreak(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;

		while(loop < 12){
			loop++;
			cof.switchCalendar(loop);
			if(loop == 6) break;
		}
	}

	public void whileContinue(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;

		while(loop < 12){
			loop++;
			if(loop == 6) continue;
			cof.switchCalendar(loop);
		}
	}

	public void whileContinueInfinit(){
		ControlOfFlow cof = new ControlOfFlow();
		int loop = 0;

		while(loop < 12){
			if(loop == 6) continue;
			loop++;
			cof.switchCalendar(loop);
		}
	}

}