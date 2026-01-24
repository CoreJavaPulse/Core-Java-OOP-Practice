
public class Customer {

	private int customerId;
	private String customername;
	private String mobNo;
	private Address custoAddress;
	private Product customerproduct;
	
	public Customer(int customerId, String customername, String mobNo, Address custoAddress, Product customerproduct) {
		super();
		this.customerId = customerId;
		this.customername = customername;
		this.mobNo = mobNo;
		this.custoAddress = custoAddress;
		this.customerproduct = customerproduct;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Address getCustoAddress() {
		return custoAddress;
	}

	public void setCustoAddress(Address custoAddress) {
		this.custoAddress = custoAddress;
	}

	public Product getCustomerproduct() {
		return customerproduct;
	}

	public void setCustomerproduct(Product customerproduct) {
		this.customerproduct = customerproduct;
	}

}
