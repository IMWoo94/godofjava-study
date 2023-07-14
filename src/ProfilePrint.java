public class ProfilePrint{
	byte age;
	String name;
	boolean isMarried;

	public static void main(String[] args){
		ProfilePrint pp = new ProfilePrint();
		pp.setAge((byte)29);
		pp.setName("이상민");
		pp.setMarried(false);

		System.out.println("이름 : " + pp.getName());
		System.out.println("나이 : " + pp.getAge());
		System.out.println("결혼여부 : " + pp.isMarried());

	}

	public void setAge(byte age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMarried(boolean flag){
		this.isMarried = flag;
	}
	public byte getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
	public boolean isMarried(){
		return this.isMarried;
	}


}