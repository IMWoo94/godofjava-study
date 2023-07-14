public class ReferenceStatic{
	String name = "min";


	public static void main(String[] args){
		ReferenceStatic.staticMethod();
	}

	public static void staticMethod(){
		System.out.println("This is a staticMethod");
		ReferenceStatic rs = new ReferenceStatic();
		System.out.println(rs.name);
	}

}