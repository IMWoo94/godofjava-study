public class MemberDTO{
	String name;
	String phone;
	String email;

	// �ƹ� ������ �� ��
	public MemberDTO(){

	}

	// �̸��� �ƴ� ���
	public MemberDTO(String name){
		this.name = name;
	}

	// �̸�, ��ȭ��ȣ �ƴ� ���
	public MemberDTO(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

	// �̸�, ��ȭ��ȣ, �̸��� �ƴ� ���
	public MemberDTO(String name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}



}