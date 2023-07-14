package e.thread.practice;



public class TimerMain{
	public static void main(String[] args){
		TimerMain sample = new TimerMain();
		TimerThread thread = new TimerThread();
		thread.start();

	}

}