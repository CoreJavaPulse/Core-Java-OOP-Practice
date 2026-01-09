
public class Circle extends Shape{

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		double ca = 3.14*radius*radius;
		System.out.println("Area Of The Circle Is :"+ca);
	}
	
	
	
}
