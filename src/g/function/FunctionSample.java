package g.function;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionSample {

	public static void main(String[] args) {
		FunctionSample sample = new FunctionSample();

		//sample.predicateSample();
		sample.supplierSample();
	}
	
	private void predicateSample() {
		Predicate<String> predicateLength = (a) -> a.length() > 5;
		Predicate<String> predicateContains = (a) -> a.contains("God");
		Predicate<String> predicateStart = (a) -> a.startsWith("God");
		
		String godofjava = "GodOfJava";
		String goodjava = "GoodJava";
		
		predicateTest(predicateLength ,goodjava);
		predicateTest(predicateLength ,goodjava);
		
		predicateAnd(predicateLength, predicateContains, godofjava);
		predicateAnd(predicateLength, predicateContains, goodjava);
		
		predicateOr(predicateLength, predicateContains, godofjava);
		predicateOr(predicateLength, predicateContains, goodjava);
		
		predicateNegate(predicateStart, godofjava);
		predicateNegate(predicateStart, goodjava);
		
	}
	
	private void predicateTest(Predicate<String> p, String data) {
		System.out.println(p.test(data));
	}
	
	private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.and(p2).test(data));
	}
	
	private void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.or(p2).test(data));
	}
	
	private void predicateNegate(Predicate<String> p, String data) {
		System.out.println(p.negate().test(data));
	}
	
	private void supplierSample() {
		Supplier<String> stringSupplier = () -> "get";
		System.out.println(stringSupplier.get());
	}

}
