
public class CurrentAccount extends Account {
	
	private String companyName;
	
	public CurrentAccount(int accNumber, double accbal, String accType, String companyName) {
		super(accNumber, accbal, accType);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
