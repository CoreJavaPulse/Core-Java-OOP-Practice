package EmployeeManagement;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		EmployeeManage empobj = new EmployeeManage();
		int id;
		do {
			System.out.println("--------------------------Main Menu----------------------");
			System.out.println("1:Add Employee.\n2:Display Employee Details.\n3:Search Employee By Id."
					+ "\n4:Update Employee Details\n5:Delete Employee.\n6:Sort The Employees List.\n7:Exit.");
			System.out.println("Enter Your Choice.");
			int ch=sc.nextInt();
			System.out.println();
			switch(ch)
			{
			case 1:
				empobj.addemployee();
				break;
			case 2:
				empobj.displaydetails();
				break;
			case 3:
				System.out.println("Enter Employee Id To Search.");
				int ser =sc.nextInt();
				empobj.searchemployee(ser);
				break;
			case 4:
				System.out.println("Enter The Emloyee Id You Want To Update!");
				id = sc.nextInt();
				empobj.updateEmployeedetails(id);
				break;
			case 5:
				System.out.println("Enter The Emloyee Id You Want To Delete!");
				id = sc.nextInt();
				empobj.deleteEmployeedetails(id);
				break;
			case 6:
				break;
			case 7:
				break;
			default:
				System.out.println("\nEnter A Valid Choice!(1-7)");
				break;
			}
			System.out.println("\nDo You Want To Continue.\nEnter Yes or No.");
			choice=sc.next();
			System.out.println();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("---------------------------Thank You-------------------");
		sc.close();
	}

}
