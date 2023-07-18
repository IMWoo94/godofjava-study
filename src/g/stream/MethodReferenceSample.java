package g.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceSample {

	public static void main(String[] args) {
		MethodReferenceSample sample = new MethodReferenceSample();
		String[] stringArr = {"¿ä´ô", "Âð»§", "¸¸µÎ"};
		sample.staticReference(stringArr);
		
		Object[] objArr = {new int[5], new int[4], new String("test")};
		sample.staticReference(objArr);
		
		sample.objectReference(stringArr);
	}

	public void staticReference(String...str) {
		Stream.of(str).forEach(MethodReferenceSample::printResult);
	}
	
	private static void printResult(String str) {
		System.out.println(str);
	}
	
	public void staticReference(Object[] obj) {
		Stream.of(obj).forEach(System.out::println);
	}

	public void objectReference(String[] str) {
		Arrays.sort(str, String::compareToIgnoreCase);
		Arrays.asList(str).stream().forEach(System.out::println);
	}
	
	private void createInstance() {
		
		MakeString makeStringAnonymous = new MakeString() {
			@Override
			public String fromBytes(char[] chars) {
				return new String(chars);
			}
		};
		
		MakeString makeStringLambda = (charArr) -> new String(charArr);

		MakeString makeString = String::new;
		char[] chars = {'g','o','d','o','f','j','a','v','a'};
		String madeString = makeString.fromBytes(chars);
		System.out.println(madeString);
	}
}
