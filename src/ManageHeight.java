public class ManageHeight{
	public static void main(String[] args){
		ManageHeight mh = new ManageHeight();
		mh.setData();
		mh.printHeight(5);
		mh.printAverage(5);
	}

	int[][] gradeHeight = new int[5][];

	public void setData(){
		gradeHeight[0] = new int[] {170, 180, 173, 175, 177};
		gradeHeight[1] = new int[] {160, 165, 167, 186};
		gradeHeight[2] = new int[] {158, 177, 187, 176};
		gradeHeight[3] = new int[] {173, 182, 181};
		gradeHeight[4] = new int[] {170, 180, 165, 177, 172};
	}

	public void printHeight(int classNo){
		
		for(int i = 0; i < classNo; i++){
			int size = gradeHeight[i].length;
			System.out.println("classNo : " + classNo);
			for(int k = 0; k < size; k++){
				System.out.println(gradeHeight[i][k]);
			}
		}
		
	}

	public void printAverage(int classNo){
		for(int i = 0; i < classNo; i++){
			int size = gradeHeight[i].length;
			int sum = 0;
			double avg = 0.0;
			System.out.println("classNo : " + classNo);
			for(int k = 0; k < size; k++){
				sum += gradeHeight[i][k];
			}
			System.out.println("height average :" + (double)sum / (double)size);
		}
	}



}