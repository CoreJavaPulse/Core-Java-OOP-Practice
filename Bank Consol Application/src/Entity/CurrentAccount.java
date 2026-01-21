package Entity;

import enums.AccountType;

public class CurrentAccount extends Account {

	private String compName;

	public CurrentAccount(int accNo, String ifscCode, double balance, AccountType accType, String compName) {
		super(accNo, ifscCode, balance, accType);
		this.compName = compName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Company=" + compName;
    }

	@Override
	public double calculateInterest() {
		return 0;
	}
}
