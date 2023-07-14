package c.annotation;

import java.lang.reflect.*;

public class UserAnnotationCheck{
	public static void main(String[] args){
		UserAnnotationCheck check = new UserAnnotationCheck();
		check.checkAnnotations(UserAnnotationSample.class);
	}

	public void checkAnnotations(Class useClass){
		Method[] methods = useClass.getDeclaredMethods();
		for(Method temp : methods){
			UserAnnotation annotation = temp.getAnnotation(UserAnnotation.class);
			if(annotation != null){
				int number = annotation.number();
				String text = annotation.text();
				System.out.println(temp.getName() + " () : number = " + number + " text = " + text);
			}else{
				System.out.println(temp.getName() + " () : annotation is null." );
			}
		}

	}
}