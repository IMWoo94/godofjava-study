package e.thread.practice;

import java.util.*;

public class TimerThread extends Thread{
	public void run(){

		printCurrentTime();
	}

	public void printCurrentTime(){
		int cnt = 1;
		while(true){
			try{
				Date date = new Date();
				System.out.println(date.toString());
				Long time = System.currentTimeMillis();
				Thread.sleep(1000, (int)(time%1000));
				System.out.println(time);
				cnt++;

				if(cnt == 10){
					break;
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}


}