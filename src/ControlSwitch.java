public class ControlSwitch{
	public static void main(String[] args){
		ControlSwitch cs = new ControlSwitch();
		//cs.switchStatement(1);
		//cs.switchStatement(2);
		//cs.switchStatement(3);
		//cs.switchStatement(4);
		//cs.switchStatement(5);

		cs.switchStatement2(1);

	}

	public void switchStatement(int numberOfWeel){
		switch(numberOfWeel){
			case 1:
				System.out.println(numberOfWeel + "It is one foot bicycle.");
				break;
			case 2:
				System.out.println(numberOfWeel + "It is a motor cycle or bicycle.");
				break;
			case 3:
				System.out.println(numberOfWeel + "It is three weel car.");
				break;
			case 4:
				System.out.println(numberOfWeel + "It is a car.");
				break;
			default :
				System.out.println(numberOfWeel + "It is an expensive car.");
				break;


		}

	}

	public void switchStatement2(int numberOfWeel){
		switch(numberOfWeel){
			case 1:
				System.out.println(numberOfWeel + "It is one foot bicycle.");
				//break;
			case 2:
				System.out.println(numberOfWeel + "It is a motor cycle or bicycle.");
				//break;
			case 3:
				System.out.println(numberOfWeel + "It is three weel car.");
				break;
			case 4:
				System.out.println(numberOfWeel + "It is a car.");
				break;
			default :
				System.out.println(numberOfWeel + "It is an expensive car.");
				break;


		}

	}


}