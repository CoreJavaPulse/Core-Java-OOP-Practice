package ProductDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductInfo {
	
	List<Product> prodlist = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);
	public List<Product> accept() {
		System.out.println("Enter The Product Id.");
		int prodId = sc.nextInt();
		System.out.println("Enter The Product Name.");
		String prodName = sc.next();
		System.out.println("Enter Product Price.");
		double prodPrice = sc.nextDouble();
		System.out.println("Enter The Product Quantity.");
		int prodQty = sc.nextInt();
		Product productobj =new Product(prodId, prodName, prodPrice, prodQty);
		prodlist.add(productobj);
		
		return prodlist;
	}
	
	public void display(List<Product> prodlist) {
		System.out.println("-----------------Product Details------------------");
		System.out.println("Product Id\tProduct Name\tProduct Price\tProduct Quantity");
		System.out.println("---------------------------------------------------------------------");
		for(Product Prod:prodlist)
		{
			System.out.println(Prod.getProdId()+"\t\t"+Prod.getProdName()+"\t\t"+Prod.getProdPrice()+"\t\t"+Prod.getProdQty());
		}
		
	}
	
	

}
