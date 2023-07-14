package d.generic;

public class CarWildcardSample{

	public static void main(String[] args){
		CarWildcardSample n = new CarWildcardSample();
		n.callBoundedWildcardMethod();
	}

	public void callBoundedWildcardMethod(){
		WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
		wildcard.setWildcard(new Car("Mustang"));
		boundedWildcardMethod(wildcard);	
	}

	public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
		Car value = c.getWildcard();
		System.out.println(value);
	}
} 