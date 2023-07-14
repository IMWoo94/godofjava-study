package e.thread;

public class runCommonThread{
	public runCommonThread(){
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
	}

	public static void main(String[] args){
		runCommonThread sample = new runCommonThread();

	}

}