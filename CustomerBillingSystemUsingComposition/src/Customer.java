
public class Customer {
	
	private int  custId;
	private String custName;
	private String mobNo;
	private Address custAddress;
	private Product product[];
	
	public Customer(int custId, String custName, String mobNo, Address custAddress, Product[] product) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.custAddress = custAddress;
		this.product = product;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public Product[] getProduct() {
		return product;
	}

	public void setProduct(Product[] product) {
		this.product = product;
	}
}
