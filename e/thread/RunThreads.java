package e.thread;

public class RunThreads{
	public static void main(String[] args){
		RunThreads rt = new RunThreads();
		rt.runBasic();
	}

	public void runBasic(){
		RunnableSample rs = new RunnableSample();
		new Thread(rs).start();


		ThreadSample ts = new ThreadSample();
		ts.start();

		System.out.println("RunThreads.runBasic() method is ended");
	}

}