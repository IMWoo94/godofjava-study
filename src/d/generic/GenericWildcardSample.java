package d.generic;

public class GenericWildcardSample{
	public static void main(String[] args){
		GenericWildcardSample s = new GenericWildcardSample();
		s.callGenericMethod();
	}

	public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
		c.setWildcard(addValue);
		T value = c.getWildcard();
		System.out.println(value);
	}

	public void callGenericMethod(){
		WildcardGeneric<String> wildcard = new WildcardGeneric<>();
		genericMethod(wildcard, "Data");
	}

}