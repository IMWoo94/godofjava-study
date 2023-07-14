public class ReferenceOverloading{
	public static void main(String[] args){
		ReferenceOverloading ro = new ReferenceOverloading();

		ro.print(1);
		ro.print("1");
		ro.print(1, "2");
		ro.print("3", 2);
	}

	public void print(int data){
		System.out.println("나는 int data : " + data);
	}

	public void print(String data){
		System.out.println("나는 String data : " + data);
	}

	public void print(int intData, String stringData){
		System.out.println("나는 int intData, String stringData : " + intData + " , " + stringData);
	}

	public void print(String stringData, int intData){
		System.out.println("나는 String stringData, int intData : " + stringData + " , " + intData);
	}

}