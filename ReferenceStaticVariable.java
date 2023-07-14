public class ReferenceStaticVariable{
	static String name;
	public ReferenceStaticVariable(){

	}
	public ReferenceStaticVariable(String name){
		this.name = name;
	}

	public static void main(String[] args){
		ReferenceStaticVariable rsv = new ReferenceStaticVariable();
		rsv.checkName();
	}

	public void checkName(){
		ReferenceStaticVariable rsv1 = new ReferenceStaticVariable("sangmin");
		System.out.println(rsv1.name);
		ReferenceStaticVariable rsv2 = new ReferenceStaticVariable("min");
		System.out.println(rsv1.name);
		System.out.println(rsv2.name);
	}



}