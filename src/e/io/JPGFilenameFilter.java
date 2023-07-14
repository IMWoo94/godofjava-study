package e.io;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter{

	public boolean accept(File file, String fileName){
		if(fileName.endsWith(".bmp")) return true;
		return false;

	}
}