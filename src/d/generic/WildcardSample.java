package d.generic;


public class WildcardSample{
	public static void main(String[] args){
		WildcardSample ws = new WildcardSample();
		ws.callWildcardMethod();
	}

	public void callWildcardMethod(){
		WildcardGeneric<String> wildcard = new WildcardGeneric<>();
		wildcard.setWildcard("A");
		wildcardStringMethod(wildcard);

	}

	public void wildcardStringMethod(WildcardGeneric<?> c){
		Object value = c.getWildcard();
		System.out.println(value);
	}

}
