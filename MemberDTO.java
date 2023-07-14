public class MemberDTO{
	String name;
	String phone;
	String email;

	// 아무 정보도 모를 때
	public MemberDTO(){

	}

	// 이름만 아는 경우
	public MemberDTO(String name){
		this.name = name;
	}

	// 이름, 전화번호 아는 경우
	public MemberDTO(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

	// 이름, 전화번호, 이메일 아는 경우
	public MemberDTO(String name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}



}