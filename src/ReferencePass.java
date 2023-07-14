public class ReferencePass{
	public static void main(String[] args){
		ReferencePass rp = new ReferencePass();
		//rp.callPassByValue();
		rp.callPassByReference();

	}

	public void callPassByValue(){
		int a = 10;
		String b = "b";
		System.out.println("before passByValue");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		passByValue(a,b);
		System.out.println("after passByValue");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public void passByValue(int a, String b){
		a = 20;
		b = "z";
		System.out.println("in passByValue");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public void callPassByReference(){
		MemberDTO m1 = new MemberDTO("Sangmin");
		System.out.println("before passByReference");
		System.out.println("m1 = " + m1.name);
		passByReference(m1);
		System.out.println("after passByReference");
		System.out.println("m1 = " + m1.name);
	
	}

	public void passByReference(MemberDTO member){
		member.name = "leemeawoo";
		System.out.println("in passByReference");
		System.out.println("member = " + member.name);

	}
}
