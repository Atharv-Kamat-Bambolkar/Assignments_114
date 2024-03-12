package caseToolsAssignments;

public class Employee {

	private String name, job_title;
	private int salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob_title() {
		return job_title;
	}
	
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void raiseSalary(int percentage) {
		salary = salary + salary * percentage / 100; 
	}
	
}
