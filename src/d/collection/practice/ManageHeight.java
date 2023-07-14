package d.collection.practice;

import java.util.*;

public class ManageHeight{
	public ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

	public static void main(String[] args){
		ManageHeight mh = new ManageHeight();
		mh.setData();

		for(int i = 0; i < 5; i++){
			//mh.printHeight(i);
			mh.printAverage(i);
		}
	}

	public void setData(){
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(170);
		list1.add(180);
		list1.add(173);
		list1.add(175);
		list1.add(177);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(160);
		list2.add(165);
		list2.add(167);
		list2.add(186);

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(158);
		list3.add(177);
		list3.add(187);
		list3.add(176);

		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(173);
		list4.add(182);
		list4.add(181);

		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(170);
		list5.add(180);
		list5.add(165);
		list5.add(177);
		list5.add(172);


		gradeHeights.add(list1);
		gradeHeights.add(list2);
		gradeHeights.add(list3);
		gradeHeights.add(list4);
		gradeHeights.add(list5);
	}

	public void printHeight(int classNo){
		System.out.println("Class No. :" + (classNo + 1));
		for(int num : gradeHeights.get(classNo)){
			System.out.println(num);
		}
	}

	public void printAverage(int classNo){
		System.out.println("Class No. :" + (classNo + 1));
		int sum = 0;
		for(int num : gradeHeights.get(classNo)){
			sum += num;
		}
		System.out.println("Height average : " + ((double)sum/gradeHeights.get(classNo).size()));
	}
}