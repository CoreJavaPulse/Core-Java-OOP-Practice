package ArithmeticOp;
import java.util.Scanner;

public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculation cobj = new Calculation();
		String ch = null;
		do {
			System.out.println("---------------------------------Main Menu--------------------------------");
			System.out.println("1:Addition\n2:Substraction\n3:Multiplication\n4:Division\n5:Remainder");
			System.out.println("Enter Your Choice...");
			ch =sc.next();
			System.out.println("Enter Any 2 Numbers You want to perform opertions on :");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			switch(ch)
			{
			case "1":
				System.out.println("Addition of 2 Numbers is : "+cobj.addData(n1,n2));
				break;
			case "2":
				System.out.println("Subtraction of 2 Numbers is :"+cobj.subData(n1, n2));
				break;
			case "3":
				System.out.println("Multiplication of 2 Numbers is :"+cobj.mulData(n1, n2));
				break;
			case "4":
				System.out.println("Division of 2 Numbers is :"+cobj.divData(n1, n2));
				break;
			case "5":
				System.out.println("Remainder of 2 Numbers after Division is :"+cobj.modData(n1, n2));
				break;
			default:
				System.out.println("Enter a valid Choice!!!");
				break;
			}
			System.out.println("Do You Want To Continue ...\nEnter Yes or No");
			ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
		System.out.println("-------------------------------------Thank You-----------------------------------------");
		sc.close();
	}
}
