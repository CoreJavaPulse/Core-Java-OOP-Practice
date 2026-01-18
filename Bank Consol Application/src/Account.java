
public class Account {
	
	private int accNo;
	private String ifscCode;
	private double accbal;
	private String accType;
	
	public Account(int accNo, String ifscCode, double accbal, String accType) {
		super();
		this.accNo = accNo;
		this.ifscCode = ifscCode;
		this.accbal = accbal;
		this.accType = accType;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getAccbal() {
		return accbal;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
	
}
