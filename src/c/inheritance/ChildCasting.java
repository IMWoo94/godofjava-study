package c.inheritance;

public class ChildCasting extends ParentCasting{
	public ChildCasting(){
		System.out.println("ChildCasting Constructor");
	}

	public ChildCasting(String name){
		System.out.println("ChildCasting (" + name + ") Constructor");
	}

	public void printName(){
		System.out.println("ChildCasting printName()");
	}

	public void printAge(){
		System.out.println("ChildCasting printAge()");
	}

}