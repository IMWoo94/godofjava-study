package c.inheritance;

public class InheritancePoly{
	public static void main(String[] args){
		InheritancePoly ip = new InheritancePoly();
		ip.callPrintNames();
	}

	public void callPrintNames(){
		Parent p1 = new Parent();
		Parent p2 = new Child();
		Parent p3 = new ChildOther();

		p1.printName();
		p2.printName();
		p3.printName();

	}

}