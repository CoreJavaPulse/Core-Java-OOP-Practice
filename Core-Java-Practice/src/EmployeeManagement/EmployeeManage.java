package EmployeeManagement;
import java.util.Scanner;

public class EmployeeManage {

	Scanner sc = new Scanner(System.in);
	private int []empid = new int[100];
	private String []empname = new String[100];
	private double []salary = new double[100];
	private int cnt=0;

	public void addemployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id.");
		int id = sc.nextInt();
		if(findById(id) != -1) {
			System.out.println("ID exists!");
			return;
		}
		System.out.println("Enter The Employee Name.");
		empname[cnt]=sc.next();
		System.out.println("Enter Employee Salary.");
		salary[cnt]= sc.nextDouble();
		empid[cnt]=id;
		cnt++;

		System.out.println("Employee Added.");
		System.out.println("Total Employees :"+cnt);
	}

	public void displaydetails()
	{
		if(cnt==0)
		{
			System.out.println("Employee Data Does Not Exist");
			return;
		}
		System.out.println("----------------------Employee Details-----------------------");
		System.out.println("Total Employees :"+cnt);
		System.out.println("\nID\t\tName\t\tSalary");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%d\t\t%s\t\t₹%.2f\n", empid[i], empname[i], salary[i]);
		}
		System.out.println();
	}

	public int findById(int id)
	{
		for(int i = 0;i<cnt;i++)
		{
			if(empid[i]==id)
				return i;
		}
		return -1;
	}
	
	public void searchemployee(int ser) {
		// TODO Auto-generated method stub
		int index = findById(ser);
		if(index == -1)
		{
			System.out.println("Employee Id Does Not Exsit!");
			return;
		}
		System.out.println("Employee Id Found.");
		System.out.println("----------------------Employee Details-----------------------");
		System.out.println("\nID\t\tName\t\tSalary");
		System.out.printf("%d\t\t%s\t\t₹%.2f\n", empid[index], empname[index], salary[index]);
	}

	public void updateEmployeedetails(int id) {
		// TODO Auto-generated method stub
		int index =findById(id);
		if(index == -1)
		{
			System.out.println("Employee Id Does Not Exsit!");
			return;
		}
		sc.nextLine(); // Clear buffer
		System.out.println("Enter New Name For Employee (skip=enter): "+empname[index]);
		String newName = sc.next();
		if(!newName.isEmpty()) 
			empname[index] = newName;
		System.out.println("Enter New Salary For Employee (skip=enter):"+salary[index]);
		double newSalary = sc.nextDouble();
		if(newSalary > 0)
			salary[index] = newSalary;
		System.out.println();
		System.out.println("Employee Details Updated!");
	}

	public void deleteEmployeedetails(int id) {
		// TODO Auto-generated method stub
		int index =findById(id);
		if(index == -1)
		{
			System.out.println("Employee Id Does Not Exsit!");
			return;
		}
		sc.nextLine(); // Clear buffer
		for(int i=index;i<cnt;i++)
		{
			empid[i]=empid[i+1];
			empname[i]=empname[i+1];
			salary[i]=salary[i+1];
		}
		cnt--;
		System.out.println("Employee Id Deleted!");
		System.out.println("Total Employees :"+cnt);
	}
	
}
