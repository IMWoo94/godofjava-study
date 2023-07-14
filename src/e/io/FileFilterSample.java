package e.io;

import java.io.File;

public class FileFilterSample{

	public static void main(String[] args){
		FileFilterSample sample = new FileFilterSample();
		String pathName = "D:" + File.separator + "IM_Woo" + File.separator + "godofjava" + File.separator + "text";
		sample.checkList(pathName);
	}

	public void checkList(String pathName){
		File file;
		try{
			file = new File(pathName);
			//File[] mainFileArr = file.listFiles();
			//File[] mainFileArr = file.listFiles(new JPGFilenameFilter());
			File[] mainFileArr = file.listFiles(new JPGFileFilter());

			for(File temp : mainFileArr){
				System.out.println(temp.getName());
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}