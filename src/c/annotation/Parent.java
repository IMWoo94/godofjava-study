package c.annotation;


public class Parent{
	public Parent(){
		System.out.println("Parent Constructor");
	}

	public Parent(String name){

		System.out.println("Parent " + name + " Constructor");
	}

	public void printName(){
		System.out.println("Parent - printName()");

	}



}