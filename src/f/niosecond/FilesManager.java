package f.niosecond;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {
	public static void main(String[] args) {
		FilesManager fm = new FilesManager();
		String fileName = "D:\\IM_Woo\\godofjava\\AboutThisBook.txt";
		Path fromPath = fm.writeAndRead(fileName);
		System.out.println(fromPath.toString());
		fm.copyMoveDelete(fromPath ,"AboutThisBook.txt");
		fm.tempTest(fromPath);
	}
	
	public List<String> getContents(){
		List<String> contents = new ArrayList<>();
		contents.add("이 책은 저자의 6번째 책입니다.");
		contents.add("필자의 수년간의 자바 경험을 바탕으로 집필되었습니다.");
		contents.add("많은 분들에게 도움이 되면 좋겠습니다.");
		contents.add("채에 대한 질문은 메일로 문의 주시기 바랍니다.");
		contents.add("Current date" + new Date());
		
		return contents;
	}
	
	public Path writeFile(Path path) throws Exception{
		Charset charset = Charset.forName("UTF-8");	 
		List<String> contents = getContents();
		StandardOpenOption openOption = StandardOpenOption.CREATE;
		return Files.write(path, contents, openOption);
		
	}
	
	public void readFile(Path path) throws Exception{
		Charset charset = Charset.forName("UTF-8");
		System.out.println(path);
		List<String> fileContents = Files.readAllLines(path, charset);
		for(String temp : fileContents) {
			System.out.println(temp);
		}
		System.out.println();
		
	}
	
	public Path writeAndRead(String fileName) {
		Path returnPath = null;
		try {
			Path path = Paths.get(fileName);
			System.out.println(path.toString());
			returnPath = writeFile(path);
			
			System.out.println("=======================created");

			readFile(returnPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnPath;
	}
	
	public void copyMoveDelete(Path fromPath, String fileName) {
		try {
			Path toPath = fromPath.toAbsolutePath().getParent();
			System.out.println(toPath.toString());
			
			// make a directory if it is not exist.
			Path copyPath = toPath.resolve("copied");
			if(!Files.exists(copyPath)) {
				Files.createDirectories(copyPath);
			}
			
			// copy
			Path copiedFilePath = copyPath.resolve(fileName);
			StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
			Files.copy(fromPath, copiedFilePath, copyOption);
			
			// read copied file
			System.out.println("copied file contents");
			readFile(copiedFilePath);
			
			// move file
			Path movedPath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);
			
			// delete file
			Files.delete(movedPath);
			Files.delete(copyPath);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void tempTest(Path fromPath) {
		try {
			Path toPath = fromPath.toAbsolutePath().getParent();
			Path tempPath = Files.createTempDirectory(toPath, "접두사입니다");
			System.out.println(tempPath.toString());
			
			Path tempPath2 = Files.createTempFile(toPath, "test접두사", ".txt");
			System.out.println(tempPath2.toString());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
