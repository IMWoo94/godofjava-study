package c.javapackage;

//import c.javapackage.sub.SubStatic;
//import static c.javapackage.sub.SubStatic.subStaticMethod;
//import static c.javapackage.sub.SubStatic.CLASS_NAME;
import static c.javapackage.sub.SubStatic.*;

public class PackageStatic{

	//public final static String CLASS_NAME = "PackageStatic";

	public static void main(String[] args){
		System.out.println("PackageStatic class");
		//SubStatic.subStaticMethod();
		//System.out.println(SubStatic.CLASS_NAME);
		subStaticMethod();
		System.out.println(CLASS_NAME);
	}
}