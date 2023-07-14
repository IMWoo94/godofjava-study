public class InterestManager{
	public static void main(String[] args){
		InterestManager im = new InterestManager();

		for(int i = 1; i <= 365; i+=10){
			System.out.println(im.calculateAmount(i, 1000000));
			System.out.println(i);
		}
	}

	public double getInterestRate(int day){
		double rate = 0.5;

		if(day >= 365){
			rate = 5.6;
		}else if(day >= 181){
			rate = 2.0;
		}else if(day >= 91){
			rate = 1.0;
		}else{
			rate = 0.5;	
		}

		return rate;
	}
	
	public double calculateAmount(int day, long amount){
		double rate = getInterestRate(day);
		double result = 0.0;
		result = amount + (amount * (rate / 100));

		return result; 
	}



}