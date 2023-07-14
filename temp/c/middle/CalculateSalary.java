package c.middle;

public class CalculateSalary{

	public static void main(String[] args){
		CalculateSalary cs = new CalculateSalary();
		cs.calculateSalaries();
	}

	public long getSalaryIncrease(Employee employee){
		int type = employee.getType();
		long salary = employee.getSalary();
		long calSalary = 0L;
		double rate = 0.0;
		
		switch(type){
			case 1 :
				rate = -0.95;
				break;
			case 2 :
				rate = 0.1;
				break;
			case 3 :
				rate = 0.2;
				break;
			case 4 :
				rate = 0.3;
				break;
			default :
				rate = 1;
				break;
		}
		calSalary = salary + (long)(salary*rate);

		return calSalary;

	}
	
	
	public void calculateSalaries(){
		Employee[] EmployeeArr = new Employee[5];
		EmployeeArr[0] = new Employee("LeeDaeRi", 1, 1000000000L);
		EmployeeArr[1] = new Employee("KimManager", 2, 100000000L);
		EmployeeArr[2] = new Employee("WhangDesign", 3, 70000000L);
		EmployeeArr[3] = new Employee("ParkArchi", 4, 80000000L);
		EmployeeArr[4] = new Employee("LeeDevelop", 5, 60000000L);

		for(Employee temp : EmployeeArr){
			temp.setSalary(getSalaryIncrease(temp));
			System.out.println(temp.getName() + " = " + temp.getSalary());
		}
		
		
	}

}