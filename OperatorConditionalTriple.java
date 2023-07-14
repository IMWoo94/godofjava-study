public class OperatorConditionalTriple{
	public static void main(String[] args){
		OperatorConditionalTriple oct = new OperatorConditionalTriple();
		oct.doBlindDate(90);
	}

	public boolean doBlindDate(int point){

		boolean doBlindDateFlag = false;
		doBlindDateFlag = (point >= 80) ? true : false;
		System.out.println(doBlindDateFlag + " : " + point);
		return doBlindDateFlag;
	}

}