package f.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

	public void scanFile(String fileName, String encoding) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File(fileName), encoding);
			System.out.println(sc.nextLine());
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public void newScanFile(String fileName, String encoding) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File(fileName), encoding);
			System.out.println(sc.nextLine());
		} catch (IllegalArgumentException | FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
	public void newScanFileWithResource(String fileName, String encoding) {
		try (Scanner sc = new Scanner(new File(fileName), encoding)){
			
			System.out.println(sc.nextLine());
		} catch (IllegalArgumentException | FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
