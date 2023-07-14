package c.inner;

public class InnerSample{
	public static void main(String[] args){
		InnerSample is = new InnerSample();

		is.makeInnerNestedObject();
	
	}

	public void makeInnerNestedObject(){
		OuterOfInner ooi = new OuterOfInner();
		OuterOfInner.InnercNested ooiin= ooi.new InnercNested();
		System.out.println(ooiin.getValue());
		ooiin.setValue(3);
		System.out.println(ooiin.getValue());

	}
}