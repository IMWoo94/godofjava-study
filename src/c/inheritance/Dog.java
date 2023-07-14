package c.inheritance;

public class Dog extends Animal{
	
	String food;

	public void move(){
		System.out.println("Dog move()");
	}

	public void eatFood(){
		System.out.println("Dog eatFood()" + food);
	}
}