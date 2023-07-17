package f.switchcase;

public class JDK7Switch {

	public static void main(String[] args) {
		JDK7Switch sample = new JDK7Switch();
		System.out.println(sample.salaryIncreaseAmount(3));
		System.out.println(sample.salaryIncreaseAmount("ceo"));
		System.out.println(sample.salaryIncreaseAmount(null));
	}
	
	public double salaryIncreaseAmount(int employeeLevel) {
		switch (employeeLevel) {
		case 1: //ceo
			return 10.0;
		case 2: //manager
			return 15.0;
		case 3: //engineer, developer
			return 100.0;
		case 4: // designer, planner
			return 20.0;
		}
		
		return 0.0;
	}
	
	public double salaryIncreaseAmount(String employeeLevel) {
		if(employeeLevel == null) return 0.1;
		switch (employeeLevel.toUpperCase()) {
		case "CEO": //ceo
			return 10.0;
		case "MANAGER": //manager
			return 15.0;
		case "ENGINEER": //engineer, developer
		case "DEVELOPER":
			return 100.0;
		case "DESIGNER": // designer, planner
		case "PLANNER":
			return 20.0;
		}
		
		return 0.0;
	}

}
