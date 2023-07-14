package c.inner;

public class NestedSample{
	public static void main(String[] args){
		NestedSample ns = new NestedSample();

		ns.makeStaticNestedObject();
	
	}

	public void makeStaticNestedObject(){
		OuterOfStatic.StaticNested oossn = new OuterOfStatic.StaticNested();
		System.out.println(oossn.getValue());
		oossn.setValue(3);
		System.out.println(oossn.getValue());

	}
}