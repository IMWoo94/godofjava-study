public class ReferenceString{

	public ReferenceString(){
		System.out.println("나는 기본생성자 입니다.");
	}
	public ReferenceString(String str){
		System.out.println("나는 매개변수를 가진 생성자 입니다.");
	}
	public static void main(String[] args){
		ReferenceString rs = new ReferenceString();
	}

}