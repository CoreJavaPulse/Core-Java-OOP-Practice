
public class HeroHonda implements Bike,AutoMobile {

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Hero Honda";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Gray";
	}

	@Override
	public int getcc() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getModel()+"\t"+getColor()+"\t"+getPrice()+"\t\t"+getcc()+"\t";
	}
}
