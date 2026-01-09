
public class Customer {
	
	private int custId;
	private String custName;
	private Address custAddr;
	private Account custAcc;
	
	public Customer(int custId, String custName, Address custAddr, Account custAcc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddr = custAddr;
		this.custAcc = custAcc;
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

	public Address getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(Address custAddr) {
		this.custAddr = custAddr;
	}

	public Account getCustAcc() {
		return custAcc;
	}

	public void setCustAcc(Account custAcc) {
		this.custAcc = custAcc;
	}
	
	
	

}
