package e.thread;

public class RunDemonThreads{
	public static void main(String[] args){
		RunDemonThreads sample = new RunDemonThreads();

		sample.checkThreadProperty();
	}

	public void checkThreadProperty(){
		ThreadSample thread1 = new ThreadSample();
		ThreadSample thread2 = new ThreadSample();
		ThreadSample demonThread = new ThreadSample();

		System.out.println("thread1 id = " + thread1.getId());
		System.out.println("thread2 id = " + thread2.getId());

		System.out.println("thread1 name = " + thread1.getName());
		System.out.println("thread2 name = " + thread2.getName());

		System.out.println("thread1 priority = "+ thread1.getPriority());
		demonThread.setDaemon(true);
		System.out.println("thread1 isdemon = " + thread1.isDaemon());
		System.out.println("demonThread isdemon = " + demonThread.isDaemon());


	}

}