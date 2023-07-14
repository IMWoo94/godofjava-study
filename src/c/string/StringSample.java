package c.string;

public class StringSample{
	public static void main(String[] args){
		StringSample ss = new StringSample();
		//ss.convert();
		//ss.convertUTF16();

		String str = "한글입니다";
		System.out.println(str.length());
	}

	public void convert(){
		try{
			String korean = "한글";
			byte[] array = korean.getBytes();
			for(byte data: array){
				System.out.println(data);
			}
			String str = new String(array);
			System.out.println(str);
		}catch(Exception e){

		}

	}

	public void convertUTF16(){
		try{
			String korean = "한글";
			byte[] array = korean.getBytes("UTF-16");
			for(byte data: array){
				System.out.println(data);
			}
			String str = new String(array, "UTF-16");
			System.out.println(str);
		}catch(Exception e){

		}

	}

}