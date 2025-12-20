package employeeExample;

public class EmployeeMain {

	public static void main(String[] args) {

		Manager mobj = new Manager(101,"Hitesh", 2000,1000);
		System.out.println("Manager Id is :"+mobj.getEmpId());
		System.out.println("Manager Name is :"+mobj.getEmpName());
		System.out.println("Manager Salary is :"+mobj.getEmpSalary());
		System.out.println("Manager Bonus is :"+mobj.getBonus());
		System.out.println("--------------------------------------------------");
		
		Developer dobj = new Developer(501,"Deepali", 5000, 30);
		System.out.println("Developer Id :"+dobj.getEmpId());
		System.out.println("Developer Name :"+dobj.getEmpName());
		System.out.println("Developer Salary :"+dobj.getEmpSalary());
		System.out.println("Developer No Of Extra Hours :"+dobj.getNoOfHr());

	}

}
