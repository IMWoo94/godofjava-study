package e.thread.group;

import e.thread.support.SleepThread;

public class RunGroupThreads{
	public static void main(String[] args){
		RunGroupThreads sample = new RunGroupThreads();
		sample.groupThread();
	}

	public void groupThread(){
		try{
			SleepThread sleep1 = new SleepThread(5000);
			SleepThread sleep2 = new SleepThread(5000);

			ThreadGroup group = new ThreadGroup("Group1");
			Thread thread1 = new Thread(group, sleep1);
			Thread thread2 = new Thread(group, sleep2);

			thread1.start();
			thread2.start();
			Thread.sleep(1000);
			System.out.println("group name " + group.getName());
			int activeCount = group.activeCount();
			int groupCount = group.activeGroupCount();
			System.out.println("group activeCount = " + activeCount);
			System.out.println("group activeGroupCount = " + groupCount);
			group.list();

			Thread[] tempThreadArr = new Thread[activeCount];
			ThreadGroup[] tempGroupThreadArr = new ThreadGroup[groupCount];
			int result = group.enumerate(tempThreadArr);
			int gorupResult = group.enumerate(tempGroupThreadArr);
			System.out.println("Enumerate result = " + result);
			System.out.println("Enumerate gorupResult = " + gorupResult);
			for(Thread temp : tempThreadArr){
				System.out.println(temp);
			}


		}catch(Exception e){

			e.printStackTrace();
		}

	}
}