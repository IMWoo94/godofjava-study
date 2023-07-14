package c.annotation;

public class AnnotationSample {

	@SuppressWarnings("deprecation")
	public void useDeprecated(){
		AnnotationDeprecated ad = new AnnotationDeprecated();
		ad.noMoreUse();
	}
}