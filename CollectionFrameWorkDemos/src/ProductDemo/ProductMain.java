package ProductDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ch = null;
		ProductInfo prodinfo = new ProductInfo();
		List<Product> prodlist = new ArrayList<Product>();
		do
		{
			System.out.println("------------------Main Menu-------------------");
			System.out.println("1:Enter The Product Details.\n2:Display Product Details.\n3:Exit");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Enter Your Choice.");
			int ch1 = sc.nextInt();
			switch(ch1)
			{
			case 1:
				prodlist = prodinfo.accept();
				break;
			case 2:
				prodinfo.display(prodlist);
				break;
			case 3:
				break;
			default:
				System.out.println("Enter Valid Choice.(1-3)");
				break;
			}
			System.out.println("Do You Want To Continue\n Yes or No.");
			ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));
		System.out.println("---------------------Thank You--------------------");
		sc.close();
	}
}
