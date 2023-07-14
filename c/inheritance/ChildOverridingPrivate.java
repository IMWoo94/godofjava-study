package c.inheritance;

public class ChildOverridingPrivate extends ParentOverridingPrivate{
	public ChildOverridingPrivate(){
		System.out.println("ChildOverridingPrivate Constructor");
	}

	public void printName(){
		System.out.println("ChildOverridingPrivate printName()");
	}

	public static void main(String[] args){
		ChildOverridingPrivate cop = new ChildOverridingPrivate();
		cop.printName();
		ParentOverridingPrivate pop = (ParentOverridingPrivate)cop;
		pop.printName();
	}

}