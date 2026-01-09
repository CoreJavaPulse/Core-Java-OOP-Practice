
public class Son extends Father{

	private int sonage;

	public Son(int sonage) {
		super(sonage+30);
		this.sonage = sonage;
	}

	public int getSonage() {
		return sonage;
	}

	public void setSonage(int sonage) {
		this.sonage = sonage;
	}
	
	public void showAge()
	{
		super.showAge();
		System.out.println("Sons Age Is :"+sonage);
	}
}
