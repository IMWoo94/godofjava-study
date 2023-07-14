public class ControlLabel{
	public static void main(String[] args){
		ControlLabel cl = new ControlLabel();
		cl.printTimesTable();

	}

	public void printTimesTable(){
		startLabel :
		for(int i = 2; i<10; i++){
			if(i == 4){
				continue;
			}
			for(int k = 1; k<10; k++){
				if(k == 4){
					continue startLabel;
				}else{
					System.out.print(i + " x " + k + " = " + i*k + " ");
				}
			}
			System.out.println();
		}

	}

}