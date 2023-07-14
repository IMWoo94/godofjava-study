public class SalaryManager{
	
	public static void main(String[] args){
		SalaryManager s = new SalaryManager();
		double monthlySalary = 0.0;
		monthlySalary = s.getMonthlySalary(20000000);
		System.out.println(monthlySalary);
	
	}


	public double getMonthlySalary(int yearlySalary){
		double monthlySalary = 0.0;
		monthlySalary = yearlySalary / 12.0;

		double tax = calculateTax(monthlySalary);
		double nationalPension = calculateNationalPension(monthlySalary);
		double healthInsurance = calculateHealthInsurance(monthlySalary);
		double total = 0.0;
		total = tax + nationalPension + healthInsurance;
		monthlySalary -= total;
		
		return monthlySalary;
	}

	public double calculateTax(double monthlySalary){
		double tax = 0.0;

		tax = monthlySalary*(12.5/100);
		System.out.println("근로소득세 : " + tax);

		return tax;

	}

	public double calculateNationalPension(double monthlySalary){
		double tax = 0.0;

		tax = monthlySalary*(8.1/100);
		System.out.println("국민연금 : " + tax);

		return tax;

	}

	public double calculateHealthInsurance(double monthlySalary){
		double tax = 0.0;

		tax = monthlySalary*(13.5/100);
		System.out.println("건강보험료 : " + tax);

		return tax;

	}

	


}