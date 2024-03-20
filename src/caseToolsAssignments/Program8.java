package caseToolsAssignments;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Atharv", "CASE Tools Laboratory", 10000);
		
		e1.setName("Atharv");
		e1.setJob_title("CASE Tools Laboratory");
		e1.setSalary(10000);
		e1.raiseSalary(8);
		System.out.println("The updated salary = " + e1.getSalary());
	}

}