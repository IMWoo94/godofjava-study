package d.lang;

public class JavaLangSystem{
	public static void main(String[] args){
		JavaLangSystem n = new JavaLangSystem();
		n.systemPropertiesCheck();
		n.numberMinMaxElapsedCheck();

	}

	public void systemPropertiesCheck(){
		System.out.println("java version = " + System.getProperty("java.version"));
		System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
	}

	public void numberMinMaxElapsedCheck(){
		JavaLangNumber ref = new JavaLangNumber();
		long startTime = System.currentTimeMillis();
		long startNanoTime = System.nanoTime();
		ref.numberMinMaxCheck();
		System.out.println("Milli second = " + (System.currentTimeMillis()- startTime));
		System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));
	}
}