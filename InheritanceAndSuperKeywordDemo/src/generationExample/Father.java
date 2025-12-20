package generationExample;

public class Father  extends GrandFather{
	
	private int fage;

	public Father(int fage) {
		super(fage+30);
		this.fage = fage;
	}

	public int getFage() {
		return fage;
	}

	public void setFage(int fage) {
		this.fage = fage;
	}
	
	public void showAge()
	{
		super.showAge();
		System.out.println("Father Age Is :"+fage);
	}

}
