package g.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterMapSample {

	public static void main(String[] args) {
		StreamFilterMapSample sample = new StreamFilterMapSample();
		
		//sample.StreamMapSample();
		sample.StreamFilterSample();

	}
	
	public void StreamMapSample() {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> tryList = intList.stream().map(num -> num*3).collect(Collectors.toList());
		System.out.println(tryList);
		intList.stream().map(num -> num*3).forEach(System.out::println);
		
		List<StudentDTO> students = new ArrayList<>();
		students.add(new StudentDTO("¿ä´Ù", 43, 99, 10));
		students.add(new StudentDTO("¸¸µÎ", 30, 71, 85));
		students.add(new StudentDTO("Âð»§", 32, 81, 75));
		
		students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
		
	}
	
	public void StreamFilterSample() {
		List<StudentDTO> students = new ArrayList<>();
		students.add(new StudentDTO("¿ä´Ù", 43, 99, 10));
		students.add(new StudentDTO("¸¸µÎ", 30, 71, 85));
		students.add(new StudentDTO("Âð»§", 32, 81, 75));
		
		int scoreCutLine = 80;
		
		students.stream().filter(student -> student.getScoreMath() >= scoreCutLine).map(student -> student.getName()).forEach(System.out::println);
		students.stream().filter(student -> student.getScoreMath() >= scoreCutLine).forEach(student -> System.out.println(student.getName()));
	}

}
