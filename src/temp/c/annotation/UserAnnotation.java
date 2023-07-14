package c.annotation;

import java.lang.annotation.*;


//@Target({ElementType.METHOD, ElementType.TYPE})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnnotation{
	public int number();

	public String text() default "this is first annotation";

}