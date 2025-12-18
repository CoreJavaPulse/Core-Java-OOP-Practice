import java.util.Date;
import java.util.Scanner;

public class ShopInfo {
	Scanner sc = new Scanner(System.in); 
	public Customer create()
	{
		
		System.out.println("Enter The Customer Id.");
		int custId = sc.nextInt();
		System.out.println("Enter The Customer Name.");
		String custName = sc.next();
		System.out.println("Enter The Mobile Number.");
		String mobNo = sc.next();
		
		System.out.println("Enter The City Name.");
		String city = sc.next();
		System.out.println("Enter The State Name.");
		String state = sc.next();
		System.out.println("Enter The Pincode.");
		int pincode = sc.nextInt();
		
		Address addrobj = new Address(city,state,pincode);
		
		System.out.println("How Many Products Do You Want To Add In Cart.");
		int n = sc.nextInt();
		Product prodArr[] = new Product[n];
		for(int i = 0; i<prodArr.length;i++)
		{
			System.out.println("Enter The Product Details For Product "+(i+1));
			System.out.println("Enter The Product Id .");
			int prodId = sc.nextInt();
			System.out.println("Enter The Product Name.");
			String prodname =sc.next();
			System.out.println("Enter The Product Price");
			double prodPrice = sc.nextDouble();
			System.out.println("Enter The Product Quantity.");
			int prodQuantity = sc.nextInt(); 
			Product prodobj= new Product(prodId, prodname, prodPrice, prodQuantity);
			prodArr[i] = prodobj;
		}
		
		Customer custobj = new Customer(custId, custName, mobNo, addrobj, prodArr);
		return custobj;
	}
	
	public void display(Customer customerobj,Bill billobj) {
		// TODO Auto-generated method stub
		System.out.println("---------------------Customer Details-------------------");
		System.out.println("Customer Id :"+customerobj.getCustId());
		System.out.println("Customer Name :"+customerobj.getCustName());
		System.out.println("Customer Mobile Number :"+customerobj.getMobNo());

		System.out.println("---------------------Customer Address-------------------");
		System.out.println("Customer City :"+customerobj.getCustAddress().getCity());
		System.out.println("Customer State :"+customerobj.getCustAddress().getState());
		System.out.println("Customer Pincode :"+customerobj.getCustAddress().getPincode());

		System.out.println("------------Customer Product Purchased Details-----------");
		Product prodArr[] = customerobj.getProduct();
		System.out.println("Id\tName\tPrice\tQty");
		System.out.println("--------------------------------------------------------");
		for(int i = 0;i <customerobj.getProduct().length;i++)
		{
			System.out.println(prodArr[i].getProdId()+"\t"+prodArr[i].getProdName()+"\t"
					+prodArr[i].getProdPrice()+"\t"+prodArr[i].getProdQuantity());
			
		}
		
		System.out.println("---------------------Bill Details------------------------");
		System.out.println("Bill Number : "+billobj.getBillNumber());
		System.out.println("Date  : "+billobj.getDate());
		System.out.println("Total : "+billobj.getTotal());
		System.out.println("CGST  : "+billobj.getCgst());
		System.out.println("SGST  : "+billobj.getSgst());
		System.out.println("Final Total : "+billobj.getFinalTotal());
		System.out.println("-------------------------Thank You--------------------");
	}

	public Bill calculateBill(Customer custobj)
	{
		double total=0;
		double cgst;
		double sgst;
		double finalTotal;
		
		Product prodArr[] =custobj.getProduct();
		for(int i=0;i<prodArr.length;i++)
		{
			total=total+(prodArr[i].getProdPrice()*prodArr[i].getProdQuantity());
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finalTotal=total+cgst+sgst;
		Bill billobj = new Bill(101, new Date(), total, cgst, sgst, finalTotal);
		return billobj;
	}
}
