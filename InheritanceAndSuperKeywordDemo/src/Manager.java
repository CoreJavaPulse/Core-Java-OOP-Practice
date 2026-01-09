
public class Manager extends Employee{
	
	private double bonus;

	public Manager(int empId, String empName, double empSalary, double bonus) {
		super(empId, empName, empSalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

}
