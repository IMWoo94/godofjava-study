package e.thread.object;
 
public class RunObjectThreads{
	public static void main(String[] args){
		RunObjectThreads sample = new RunObjectThreads();
		//sample.checkThreadState2();
		sample.checkThreadState3();
	}

	public void checkThreadState2(){
		Object monitor = new Object();
		StateThread st = new StateThread(monitor);

		try{
			System.out.println("thread state " + st.getState());

			st.start();
			System.out.println("thead state (after start) " + st.getState());
			Thread.sleep(1000);
			System.out.println("thread state (after 0.1 sec) " + st.getState());

			synchronized(monitor){
				monitor.notify();
			}
			Thread.sleep(1000);
			System.out.println("thread state (after notify) " + st.getState());

			st.join();
			System.out.println("thread state (after join) " + st.getState());

		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

	public void checkThreadState3(){
		Object monitor = new Object();
		StateThread st = new StateThread(monitor);
		StateThread st2 = new StateThread(monitor);

		try{
			System.out.println("thread state " + st.getState());

			st.start();
			st2.start();
			System.out.println("thead state (after start) " + st.getState());
			Thread.sleep(1000);
			System.out.println("thread state (after 0.1 sec) " + st.getState());

			synchronized(monitor){
				monitor.notifyAll();
			}
			Thread.sleep(1000);
			System.out.println("thread state (after notify) " + st.getState());

			st.join();
			System.out.println("thread state (after join) " + st.getState());
			st2.join();
			System.out.println("thread2 state (after join) " + st2.getState());

		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}

}