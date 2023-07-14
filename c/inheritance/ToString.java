package c.inheritance;

public class ToString{
	public static void main(String[] args){
		ToString ts = new ToString();
		//ts.toStringMethod(ts);
		ts.toStringMethod2();
	}

	public void toStringMethod(Object object){

		System.out.println(object);
		System.out.println(object.toString());
		System.out.println("plus" + object);
	}

	public void toStringMethod2(){

		System.out.println(this);
		System.out.println(toString());
		System.out.println("plus" + this);
	}

	public String toString(){
		return "ToString class";
	}

}