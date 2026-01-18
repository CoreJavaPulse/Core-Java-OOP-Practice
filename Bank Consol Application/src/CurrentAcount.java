
public class CurrentAcount extends Account {
	
	private String compName;

	public CurrentAcount(int accNo, String ifscCode, double accbal, String accType, String compName) {
		super(accNo, ifscCode, accbal, accType);
		this.compName = compName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	
	
	

}
