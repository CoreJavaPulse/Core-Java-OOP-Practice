package ArrayOperations;
import java.util.Scanner;

public class ArrayOpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayOp aobj=new ArrayOp();
		Scanner sc = new Scanner(System.in);
		String ch = "null";
		int arr[] = new int[100];
		int n=0;
		int element=0;
		do {
			System.out.println("-------------------------Main Menu-----------------------");
			System.out.println("1:Create A Array.\n2:Display The Array.\n3:Search A Element In Array.\n"
					+ "4:Insert A Element In Array\n5:Delete A Element in Array.\n6:Sort The Array");
			System.out.println("Enter Your Choice.");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter The Number of Elements You Want In Array.");
				n =sc.nextInt();
				arr=aobj.create(n);
				break;
			case 2:
				if(arr != null) 
					aobj.display(arr);
				else
					System.out.println("Create array first!");
				break;
			case 3:
				if(arr != null) {
					System.out.println("Enter The Element You Want To Search.");
					int ser = sc.nextInt();
					aobj.search(arr, ser);
				} else 
					System.out.println("Create array first!");
				break;
			case 4:
				if(arr != null) {
					System.out.println("Enter Element And Position To Insert :");
					element = sc.nextInt();
					int pos = sc.nextInt();
					arr = aobj.insertpos(arr,element, pos);
				}
				else 
					System.out.println("Create array first!");
				break;			
			case 5:
				if(arr != null) {
                    System.out.println("Enter The Element You Want To Delete.");
                    element = sc.nextInt();
                    arr = aobj.delete(arr,element);
                } 
				else 
                	System.out.println("Create array first!");
                break;
			case 6:
				if(arr != null) 
			        aobj.sort(arr);
			    else
			        System.out.println("Create array first!");
				break;
			default:
				System.out.println("Please Enter A Valid Choice!!!");
				break;
			}
			System.out.println("\nDo you Want To Continue\nEnter Yes Or No");
			ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));
		System.out.println("------------------------Thank You--------------------------------");
		sc.close();
	}
}
