package c.javapackage;

import c.javapackage.sub.AccessModifier;

public class AccessCall{
	public static void main(String[] args){
		AccessModifier am = new AccessModifier();

		am.publicMethod();
		am.protectedMethod();
		am.packagePrivateMethod();
		am.privateMethod();
	}

}