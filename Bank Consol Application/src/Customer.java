
public class Customer {
	
	private int custId;
	private String custName;
	private Account custAcc;
	private Address custAddr;
	
	public Customer(int custId, String custName, Account custAcc, Address custAddr) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAcc = custAcc;
		this.custAddr = custAddr;
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

	public Account getCustAcc() {
		return custAcc;
	}

	public void setCustAcc(Account custAcc) {
		this.custAcc = custAcc;
	}

	public Address getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(Address custAddr) {
		this.custAddr = custAddr;
	}
	
	
	
	

}
