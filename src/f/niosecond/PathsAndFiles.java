package f.niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndFiles {

	public static void main(String[] args) {
		PathsAndFiles sample = new PathsAndFiles();
		String dir = "D:\\IM_Woo\\godofjava\\nio\\nio2";
		//sample.checkPath(dir);
		String dir2 = "D:\\99. 프로그램";
		sample.checkPath2(dir, dir2);
		
	}
	
	public void checkPath(String dir) {
		Path path = Paths.get(dir);
		System.out.println(path.toString());
		System.out.println(path.getFileName());
		System.out.println(path.getNameCount());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
	}
	
	public void checkPath2(String dir, String dir2) {
		Path path = Paths.get(dir);
		Path path2 = Paths.get(dir2);
		Path relativized = path.relativize(path2);
		System.out.println(relativized);
		Path absolute = relativized.toAbsolutePath();
		System.out.println(absolute);
		Path nomalized = absolute.normalize();
		System.out.println(nomalized);
		
		Path resolved = path.resolve("godofjava");
		System.out.println(resolved);
	}
}
