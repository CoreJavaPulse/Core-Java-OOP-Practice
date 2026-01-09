
public class ShopInfo {

	public Customer create()
	{
		Product productobj = new Product(1, "Laptop",50000,10);
		Address addressobj = new Address("Pune","Maharashtra",411042);
		Customer customerobj = new  Customer(101,"Hitesh", "9096866587",addressobj,productobj);

		return customerobj;
	}

	public void display(Customer customerobj) {
		// TODO Auto-generated method stub
		System.out.println("---------------------Customer Details-------------------");
		System.out.println("Customer Id :"+customerobj.getCustomerId());
		System.out.println("Customer Name :"+customerobj.getCustomername());
		System.out.println("Customer Mobile Number :"+customerobj.getMobNo());

		System.out.println("---------------------Customer Address--------------------");
		System.out.println("Customer City :"+customerobj.getCustoAddress().getCity());
		System.out.println("Customer State :"+customerobj.getCustoAddress().getState());
		System.out.println("Customer Pincode :"+customerobj.getCustoAddress().getPincode());

		System.out.println("---------------------Customer Purchased Details--------------------");
		System.out.println("Customer Purchased Product Id :"+customerobj.getCustomerproduct().getProductId());
		System.out.println("Customer Purchased Product Name :"+customerobj.getCustomerproduct().getProductname());
		System.out.println("Customer Purchased Product Price :"+customerobj.getCustomerproduct().getProductprice());
		System.out.println("Customer Purchased Product Quantity :"+customerobj.getCustomerproduct().getProductquantity());
		System.out.println("-------------------------Thank You--------------------");
	}


}
