package c.string.practice;

public class UseStringMethods{

	public static void main(String[] args){
		UseStringMethods usm = new UseStringMethods();
		String mainStr = "The String Class represents character strings.";
		usm.printWords(mainStr);
		usm.findString(mainStr, "string");
		usm.findAnyCaseString(mainStr, "string");
		usm.countCahr(mainStr, 's');
		usm.printContainWords(mainStr, "ss");
	}

	public void printWords(String str){
		for(String s : str.split(" ")){
			System.out.println(s);
		}
	
	}

	public void findString(String str, String findStr){
		int index = str.indexOf(findStr);
		System.out.println("string is appered at " + index);

	}

	public void findAnyCaseString(String str, String findStr){
		String temp = str.toLowerCase();
		int index = temp.indexOf(findStr);
		System.out.println("string is appered at " + index);

	}

	public void countCahr(String str, char c){
		int count = 0;
		for(char ch : str.toCharArray()){
			if(ch == c) count++;
		}
		System.out.println("char 's' count is " + count);
	}

	public void printContainWords(String str, String findStr){
		String[] strArray = str.split(" ");
		for(String temp : strArray){
			if(temp.contains(findStr)){
				System.out.println(temp + " contains " + findStr);
			}
		}
	}
}