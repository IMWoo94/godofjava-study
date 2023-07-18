package g.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerSample {

	public static void main(String[] args) {
		String[] stringArray = new String[] {"studyhard", "godofjava", "book"};
		
		StringJoiner strJoin = new StringJoiner(",","(",")");
		for(String str : stringArray) {
			strJoin.add(str);
		}
		
		System.out.println(strJoin.toString());
		
		StringJoinerSample sample = new StringJoinerSample();
		sample.withCollector(stringArray);
		
		
	}
	
	public void withCollector(String[] strarr) {
		List<String> stringList = Arrays.asList(strarr);
		String result = stringList.stream().collect(Collectors.joining(",", "(", ")"));
		
		System.out.println(result);
	}

}
