package e.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileManageClass{

	public static void main(String[] args){
		FileManageClass fs = new FileManageClass();
		String pathName = "D:" + File.separator + "IM_Woo" + File.separator + "godofjava" + File.separator + "text";
		String fileName = "test.txt";

		fs.checkFile(pathName, fileName);


	}

	public void checkFile(String pathName, String fileName){
		File file = new File(pathName, fileName);
		try{
			System.out.println("Create result = " + file.createNewFile());
			getFileInfo(file);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void getFileInfo(File file) throws IOException{

		System.out.println("Absolute path = " + file.getAbsolutePath());
		System.out.println("Absolute file = " + file.getAbsoluteFile());
		System.out.println("Canonical path = " + file.getCanonicalPath());
		System.out.println("Canonical file = " + file.getCanonicalFile());

		System.out.println("Name = " + file.getName());
		System.out.println("Path = " + file.getPath());
		System.out.println("Parent = " + file.getParent());
	}

}