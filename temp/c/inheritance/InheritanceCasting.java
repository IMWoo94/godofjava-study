package c.inheritance;

public class InheritanceCasting {
	public static void main(String[] args){
		InheritanceCasting ic = new InheritanceCasting();
		//ic.objectCast();
		//ic.objectCast2();
		ic.objectCastArray();
	}

	public void objectCast(){

		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();

		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent;

	}

	public void objectCast2(){

		ParentCasting parent = new ChildCasting();
		ChildCasting child = new ChildCasting();

		ParentCasting parent2 = child;
		ChildCasting child2 = (ChildCasting)parent;
		ChildCasting child3 = (ChildCasting)parent2;

	}

	public void objectCastArray(){
		ParentCasting[] parentArray = new ParentCasting[3];
		parentArray[0] = new ChildCasting();
		parentArray[1] = new ParentCasting();
		parentArray[2] = new ChildCasting();

		objectTypeCheck(parentArray);
		
	}

	private void objectTypeCheck(ParentCasting[] parentArray){
		for(ParentCasting tempParent : parentArray){
			if(tempParent instanceof ChildCasting){
				System.out.println("it's ChildCasting");
				ChildCasting child = (ChildCasting)tempParent;
				child.printAge();
			}else if(tempParent instanceof ParentCasting){
				System.out.println("it's ParentCasting");
			}
		}
	}


}