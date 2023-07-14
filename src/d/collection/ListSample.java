package d.collection;

import java.util.*;

public class ListSample{

	public static void main(String[] args){
		ListSample ls = new ListSample();
		//ls.checkArrayList();
		//ls.checkArrayList2();
		ls.checkArrayList3();
	}

	public void checkArrayList(){
		long startNanoTime = System.nanoTime();
		ArrayList<String> list = new ArrayList<>();
		//list.add(new Object());
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		//list.add(new Double(1));


		System.out.println("time : " + (System.nanoTime() - startNanoTime));
	}

	public void checkArrayList2(){
		long startNanoTime = System.nanoTime();
		ArrayList<String> list = new ArrayList<>();
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add("ArraySample");
		list.add(1,"ArraySample2");

		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println("list = " + it.next());
		}

		System.out.println("time : " + (System.nanoTime() - startNanoTime));
	}

	public void checkArrayList3(){
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("1");
		list.addAll(list2);

	}
}