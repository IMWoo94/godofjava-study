package c.inheritance;

public class ParentArg{
	public ParentArg(String name){
		System.out.println("ParentArg(" + name + ")Constructor");
	}

	public ParentArg(InheritancePrint inheritancePrint){
		System.out.println("ParentArg(inheritancePrint) Constructor");
	}


	public void printName(){
		System.out.println("printName() - ParentArg");
	}
}