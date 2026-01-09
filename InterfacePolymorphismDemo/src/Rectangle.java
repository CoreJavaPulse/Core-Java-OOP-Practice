
public class Rectangle implements Shape{

	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void findarea() {
		// TODO Auto-generated method stub
		System.out.println("Area of the Rectangle  Is :"+length*breadth);
		
	}

	@Override
	public void sayThanks() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Thanks");
		
	}
	
	
}
