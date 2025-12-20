package generationExample;

public class GrandFather {
	
	private int gage;

	public GrandFather(int gage) {
		super();
		this.gage = gage;
	}

	public int getGage() {
		return gage;
	}

	public void setGage(int gage) {
		this.gage = gage;
	}
	
	public void showAge()
	{
		System.out.println("GrandFather Age is :"+gage);
	}

}
