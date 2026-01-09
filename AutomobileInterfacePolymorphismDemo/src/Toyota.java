
public class Toyota implements AutoMobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota-123";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getColor()+"\t"+getPrice()+"\t";
	}
}
