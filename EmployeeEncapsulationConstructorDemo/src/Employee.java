
public class Employee {

	private int employeeId;
	private String employeename;
	private double employeesalary;

	public Employee()
	{

	}

	public Employee(int employeeId, String employeename, double employeesalary) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.employeesalary = employeesalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

}
