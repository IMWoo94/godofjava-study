public class ReferenceOverloading{
	public static void main(String[] args){
		ReferenceOverloading ro = new ReferenceOverloading();

		ro.print(1);
		ro.print("1");
		ro.print(1, "2");
		ro.print("3", 2);
	}

	public void print(int data){
		System.out.println("���� int data : " + data);
	}

	public void print(String data){
		System.out.println("���� String data : " + data);
	}

	public void print(int intData, String stringData){
		System.out.println("���� int intData, String stringData : " + intData + " , " + stringData);
	}

	public void print(String stringData, int intData){
		System.out.println("���� String stringData, int intData : " + stringData + " , " + intData);
	}

}