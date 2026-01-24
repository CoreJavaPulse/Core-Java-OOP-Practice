
public class Account {
	
	private int accNumber;
	private double accbal;
	private String accType;
	
	public Account(int accNumber,double accbal, String accType) {
		super();
		this.accNumber = accNumber;
		this.accbal = accbal;
		this.accType = accType;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
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
