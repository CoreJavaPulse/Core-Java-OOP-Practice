package employeeEncapsulation;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Employee employeeobj = new Employee();

		System.out.println("Enter The Employee Id :");
		int employeeId = sc.nextInt();
		System.out.println("Enter The Employee Name :");
		String employeename = sc.next();
		System.out.println("Enter The Employee Salary :");
		double employeesalary = sc.nextDouble();

		employeeobj.setEmployeeId(employeeId);;
		employeeobj.setEmployeename(employeename);;
		employeeobj.setEmployeesalary(employeesalary);

		System.out.println("Employee ID : "+employeeobj.getEmployeeId());
		System.out.println("Employee Name : "+employeeobj.getEmployeename());
		System.out.println("Employee Salary : "+employeeobj.getEmployeesalary());

		//initiazing and createing Product object  using parametric construction 
		System.out.println("------------------------------------------------------");
		System.out.println("Createing Product object  using parametric construction ");
		Employee employeeobj2 = new Employee(employeeId,employeename,employeesalary);
		
		System.out.println("Employee ID : "+employeeobj2.getEmployeeId());
		System.out.println("Employee Name : "+employeeobj2.getEmployeename());
		System.out.println("Employee Salary : "+employeeobj2.getEmployeesalary());

		sc.close();


	}

}
