public class CarManager{
	public static void main(String[] args){
		Car dogCar = new Car();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.speedUp();
		dogCar.speedUp();
		dogCar.speedUp();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.speedDown();
		System.out.println(dogCar.getCurrentSpeed());
	}
}