package g.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {

	public static void main(String[] args) {
		StudentForEachSample sample = new StudentForEachSample();
		List<StudentDTO> list = new ArrayList<>();
		list.add(new StudentDTO("¿ä´Ù", 43, 99, 10));
		list.add(new StudentDTO("¸¸µÎ", 30, 71, 85));
		list.add(new StudentDTO("Âð»§", 32, 81, 75));
		
		sample.printStudentNames(list);
		sample.printStudentToString(list);

		
	}
	
	public void printStudentNames(List<StudentDTO> list) {
		list.stream().forEach(student -> System.out.println(student.getName()));
		list.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
	
	}
	
	public void printStudentToString(List<StudentDTO> list) {
		//list.stream().forEach(student -> System.out.println(student.toString()));
		list.stream().forEach(System.out::println);
	}

}
