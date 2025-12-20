package employeeExample;

public class Developer extends Employee{

	private int noOfHr;

	public Developer(int empId, String empName, double empSalary, int noOfHr) {
		super(empId, empName, empSalary);
		this.noOfHr = noOfHr;
	}

	public int getNoOfHr() {
		return noOfHr;
	}

	public void setNoOfHr(int noOfHr) {
		this.noOfHr = noOfHr;
	}
	
	
}

