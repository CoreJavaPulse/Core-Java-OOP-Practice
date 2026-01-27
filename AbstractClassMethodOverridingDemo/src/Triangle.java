
public class Triangle extends Shape{
	
	private double base,height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double ta = 0.5*base*height;
		System.out.println("Area Of The Triangle Is :"+ta);
	}
}
