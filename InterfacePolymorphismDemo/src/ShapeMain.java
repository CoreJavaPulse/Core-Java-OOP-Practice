
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = null;
		s = new Circle(5);
		s.findarea();
		s.sayThanks();
		s = new Rectangle(5, 4);
		s.findarea();
		s.sayThanks();
	}

}
