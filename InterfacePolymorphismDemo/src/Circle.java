
public class Circle implements Shape {
	
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public void findarea() {
		// TODO Auto-generated method 
		System.out.println("Area of the Circle Is :"+3.14*r*r);	
	}

	@Override
	public void sayThanks() {
		System.out.println("Circle Thanks");
		
	}
	

}
