package productEncapsulation;
import java.util.Scanner;

public class Shopmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product productobj = new Product();
		
		System.out.println("Enter The Product Id :");
		int productId = sc.nextInt();
		System.out.println("Enter The Product Name :");
		String productname = sc.next();
		System.out.println("Enter The Product Price :");
		double productprice = sc.nextDouble();
		System.out.println("Enter The Product Quantity");
		int productqauntity = sc.nextInt();
		
		productobj.setProductId(productId);;
		productobj.setProductname(productname);;
		productobj.setProductprice(productprice);
		productobj.setProductquantity(productqauntity);
		
		System.out.println("Product ID : "+productobj.getProductId());
		System.out.println("Product Name : "+productobj.getProductname());
		System.out.println("Product Price : "+productobj.getProductprice());
		System.out.println("Product Quantity : "+productobj.getProductquantity());
		
		//initiazing and createing Product object  using parametric construction 
		System.out.println("------------------------------------------------------");
		System.out.println("Createing Product object  using parametric construction ");
		Product productobj2 = new Product(productId, productname, productprice, productqauntity);
		System.out.println("Product ID : "+productobj2.getProductId());
		System.out.println("Product Name : "+productobj2.getProductname());
		System.out.println("Product Price : "+productobj2.getProductprice());
		System.out.println("Product Quantity : "+productobj2.getProductquantity());
		
		sc.close();
	}

}
