public class StaticBlockCheck{
	public static void main(String[] args){
		StaticBlockCheck sbc = new StaticBlockCheck();
		//sbc.makeStaticBlockObject();
		sbc.makeStaticBlockObjectWithData();
	}

	public void makeStaticBlockObject(){
		System.out.println("Creating block1");
		StaticBlock sb1 = new StaticBlock();
		System.out.println("Created block1");
		System.out.println("==============");
		System.out.println("Creating block2");
		StaticBlock sb2 = new StaticBlock();
		System.out.println("Created block2");

	}

	public void makeStaticBlockObjectWithData(){
		System.out.println("Data = " + StaticBlock.data);
		System.out.println("Creating block1");
		StaticBlock sb1 = new StaticBlock();
		sb1.data = 1;
		System.out.println("Created block1");
		System.out.println("==============");
		System.out.println("Creating block2");
		StaticBlock sb2 = new StaticBlock();
		sb2.data =2;
		System.out.println("Created block2");
		System.out.println("Data = " + StaticBlock.getData());

	}

}