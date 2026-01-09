
public class Maruti implements AutoMobile{

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Maruti-swift";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 90000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "red";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getColor()+"\t"+getPrice()+"\t";
	}

}
