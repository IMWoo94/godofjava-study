public class ProfilePrint{
	byte age;
	String name;
	boolean isMarried;

	public static void main(String[] args){
		ProfilePrint pp = new ProfilePrint();
		pp.setAge((byte)29);
		pp.setName("�̻��");
		pp.setMarried(false);

		System.out.println("�̸� : " + pp.getName());
		System.out.println("���� : " + pp.getAge());
		System.out.println("��ȥ���� : " + pp.isMarried());

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