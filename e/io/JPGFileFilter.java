package e.io;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter{

	public boolean accept(File file){
		if(file.isFile()){
			String fileName = file.getName();
			if(fileName.endsWith(".bmp")) return true;
		}

		return false;

	}
}