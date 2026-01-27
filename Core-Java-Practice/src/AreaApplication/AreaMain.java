package AreaApplication;
import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AreaOperation aobj = new AreaOperation();
		String ch = null;
		do {
			System.out.println("---------------------------------Main Menu--------------------------------");
			System.out.println("1:Area Of Circle\n2:Area Of Triangle\n3:Area Of Rectangle\n4:Area Of Square\n");
			System.out.println("Enter Your Choice...");
			ch =sc.next();
			switch(ch)
			{
			case "1":
				aobj.circlearea();
				break;
			case "2":
				aobj.trianglearea();
				break;
			case "3":
				aobj.rectanglearea();
				break;
			case "4":
				aobj.squarearea();
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
