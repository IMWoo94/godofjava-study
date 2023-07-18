package g.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaSample {

	public static void main(String[] args) {
		LambdaSample sample = new LambdaSample();
		//sample.calculateClassic();
		//sample.calculateLambda();
		//sample.runCommonThread();
		sample.runLambdaThread();
		sample.lambdaTest();
	}
	
	private void calculateClassic() {
		Calculate cal = new Calculate() {
			@Override
			public int operation(int a, int b) {
				return a+b;
			}
		};
		
		System.out.println(cal.operation(1, 2));
	}
	
	private void calculateLambda() {
		Calculate calAdd = (a , b) -> a+b;
		System.out.println(calAdd.operation(1, 2));
		Calculate calSubtract = (a , b) -> a-b;
		System.out.println(calSubtract.operation(3, 2));
		
	}
	
	private void runCommonThread() {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		
		};
		new Thread(run).start();
	}
	
	private void runLambdaThread() {
//		Runnable run = () -> System.out.println(Thread.currentThread().getName());
//		new Thread(run).start();
		
		//new Thread (() -> {System.out.println(Thread.currentThread().getName());}).start();
		new Thread (() -> System.out.println(Thread.currentThread().getName())).start();
	}
	
	private void lambdaTest() {
		List<String> list = new ArrayList();
		list.add("Element1");
		list.add("Element2");
		list.add("Element3");

		list.forEach(x -> System.out.println(x));
		
		
	}

}
