package g.optinal;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample {

	public static void main(String[] args) throws Exception{
		OptionalSample sample = new OptionalSample();
		//sample.createOptionalObjects();
		//sample.checkOptionalData();
		Optional<String> str = Optional.ofNullable("common");
		sample.getOptionalData(str);
	}
	
	private void createOptionalObjects() {
		Optional<String> emptyString = Optional.empty();
		String common = null;
		Optional<String> nullableString = Optional.ofNullable(null);
		common = "common";
		Optional<String> nullableString2 = Optional.ofNullable("common");
		Optional<String> commonString = Optional.of(common);
		
		System.out.println(emptyString == nullableString);
		System.out.println(emptyString.equals(nullableString));
		System.out.println(emptyString.equals(nullableString2));
		
		System.out.println(commonString == nullableString2);
		System.out.println(commonString.equals(nullableString2));
		System.out.println(emptyString);
		System.out.println(nullableString);
		System.out.println(nullableString2);
		System.out.println(commonString);
	}
	
	private void checkOptionalData() {
		// isEmpty -> isPresent
		System.out.println(Optional.of("present").isPresent());
		System.out.println(Optional.ofNullable(null).isPresent());
	}
	
	private void getOptionalData(Optional<String> data) throws Exception{
		String defaultValue = "default";
		String result1 = data.get();
		String result2 = data.orElse(defaultValue);
		Supplier<String> stringSupplier = new Supplier<String>() {
			@Override
			public String get() {
				return "godofjava";
			}
		};
		
		String result3 = data.orElseGet(stringSupplier);
		Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
			@Override
			public Exception get() {
				return new Exception();
			}
		};
		
		String result4 = data.orElseThrow(exceptionSupplier);
	}
	
	

}
