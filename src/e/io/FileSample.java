package e.io;

import java.io.File;
import java.util.Date;

public class FileSample{

	public static void main(String[] args){
		FileSample fs = new FileSample();
		String pathName = "D:" + File.separator + "IM_Woo" + File.separator + "godofjava" + File.separator + "text";
		fs.checkPath(pathName);
		fs.makeDir(pathName);
		fs.checkFileMethods(pathName);
		fs.canFileMethods(pathName);
		fs.lastModified(pathName);

	}

	public void checkPath(String pathName){
		File file = new File(pathName);
		System.out.println(pathName + " is exists? = " + file.exists());

	}

	public void makeDir(String pathName){
		File file = new File(pathName);
		System.out.println("Make " + pathName + " reuslt = " + file.mkdir());
	}

	public void checkFileMethods(String pathName){
		File file = new File(pathName);
		System.out.println(pathName + " is directory ? = " + file.isDirectory());
		System.out.println(pathName + " is file ? = " + file.isFile());
		System.out.println(pathName + " is hidden ? = " + file.isHidden());

	}

	public void canFileMethods(String pathName){
		File file = new File(pathName);
		System.out.println(pathName + " can read ? = " + file.canRead());
		System.out.println(pathName + " can write ? = " + file.canWrite());
		System.out.println(pathName + " can execute ? = " + file.canExecute());
	}

	public void lastModified(String pathName){
		File file = new File(pathName);
		System.out.println(pathName + " last modified ? = " + new Date(file.lastModified()));

	}

}