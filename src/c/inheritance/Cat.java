package c.inheritance;

public class Cat extends Animal{
	
	String food;

	public void move(){
		System.out.println("Cat move()");
	}

	public void eatFood(){
		System.out.println("Cat eatFood()" + food);
	}
}