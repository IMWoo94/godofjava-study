package g.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

	public static void main(String[] args) {
		Integer[] values = {1, 3, 5};
		List<Integer> list = new ArrayList<>(Arrays.asList(values));
		List<Integer> list2 = Arrays.stream(values).collect(Collectors.toList());
		
		
	}

}
