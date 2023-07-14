public class ReferenceConstructor{
	public static void main(String[] args){
		ReferenceConstructor rc = new ReferenceConstructor();
		rc.makeMemberObject();
	}

	public void makeMemberObject(){
		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO("sangmin");
		MemberDTO m3 = new MemberDTO("min", "1234567");
		MemberDTO m4 = new MemberDTO("sang", "1234567", "leemeawoo");
	}
}
