package e.io;

import static java.io.File.separator;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.*;

public class ManageTextFile{

	public static void main(String[] args){
		ManageTextFile m = new ManageTextFile();
		int numberCount = 10;
		String fullpath = "D:" + separator + "IM_Woo" + separator + "godofjava" + separator + "text" + separator + "numbers.txt";
		//m.writeFile(fullpath, numberCount);

		//m.readFile(fullpath);
		m.readFileWithScanner(fullpath);

	}

	public void writeFile(String fullpath, int numberCount){
		FileWriter fw = null;
		BufferedWriter bw = null;

		try{
			fw = new FileWriter(fullpath, true);
			bw = new BufferedWriter(fw);

			for(int i = 0; i<=numberCount; i++){
				bw.write(Integer.toString(i));
				bw.newLine();
			}

			System.out.println("Write SUCCESS!!");

		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(bw != null){
				try{
					bw.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}

			if(fw != null){
				try{
					fw.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	
	}

	public void readFile(String fullpath){
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(fullpath);
			br = new BufferedReader(fr);

			String data;
			while((data = br.readLine()) != null){
				System.out.println(data);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}

			if(fr != null){
				try{
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
	}

	public void readFileWithScanner(String fullpath){
		File file = new File(fullpath); 
		Scanner sc = null;
		try{
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}

			String data = new String(Files.readAllBytes(Paths.get(fullpath)));
			System.out.println("java 7 nio.file files »ç¿ë");	
			System.out.println(data);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{

		}
	}


}