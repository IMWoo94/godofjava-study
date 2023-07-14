package e.io.practice;

import static java.io.File.separator;

import java.io.File;
import java.text.DecimalFormat;

public class FileSizeSummary{
	DecimalFormat formatter = null;

	public static void main(String[] args){
		FileSizeSummary m = new FileSizeSummary();
		String path = "D:" + separator + "IM_Woo" + separator + "godofjava";
		long sum = m.printFileSize(path);
		System.out.println(path + "'s total size = " + m.convertFileLength(sum));

	}

	public long printFileSize(String path){
		File file = new File(path);
		long sum = 0l;

		if(file.isDirectory()){
			File[] fileArr = file.listFiles();
			for(File temp : fileArr){
				if(temp.isFile()){
					String tempFileName = temp.getAbsolutePath();
					long fileLength = temp.length();
					System.out.println(tempFileName + " = " + fileLength);
					sum += fileLength;
				}else{
					String tempDirName = temp.getAbsolutePath();
					long fileLength = printFileSize(tempDirName);
					printInfo(tempDirName, fileLength, true);
					sum += fileLength;
				}

			}

		}

		return sum;
	}

	public void printInfo(String path, long fileLength, boolean dirFlag) {
		if (dirFlag) {
			path = "[" + path + "] TOTAL";
		}
		System.out.println(path + "= " + convertFileLength(fileLength) + "(" + fileLength + ")");

	}

	private String convertFileLength(long fileLength){
		String convertLength;
		if(1024*1024*1024+1 < fileLength){
			convertLength = formatter.format((double)fileLength/(1024*1024*1024)) + "gb";

		}else if(1024*1024*+1 < fileLength){
			convertLength = formatter.format((double)fileLength/(1024*1024)) + "mb";
		}else if(1024*+1 < fileLength){
			convertLength = formatter.format((double)fileLength/(1024)) + "kb";
		}else{
			convertLength = fileLength + "b";
		}
		
		return convertLength;
	}

	public FileSizeSummary() {
		String pattern = "#,##0.0#";
		formatter = new DecimalFormat(pattern);
	}

}