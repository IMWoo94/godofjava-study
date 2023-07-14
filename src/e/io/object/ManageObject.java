package e.io.object;

import static java.io.File.separator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {

	public static void main(String[] args) {
		ManageObject m = new ManageObject();
		String fullpath = "D:"+separator+"IM_woo"+separator+"godofjava"+separator+"src"+separator+"text"+separator+"serial.obj";
		
		SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
		m.saveObject(fullpath, dto);
		m.loadObject(fullpath);
	}
	
	public void saveObject(String fullpath, SerialDTO dto) {
		try(FileOutputStream fs = new FileOutputStream(fullpath); ObjectOutputStream os = new ObjectOutputStream(fs)){
			os.writeObject(dto);
			System.out.println("write success");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void loadObject(String fullpath) {
		try(FileInputStream fs = new FileInputStream(fullpath); ObjectInputStream os = new ObjectInputStream(fs)){
			Object obj = os.readObject();
			SerialDTO dto = (SerialDTO)obj;
			System.out.println(dto);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
