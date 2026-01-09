
public class FlyableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flyable farr[] = new Flyable[5];
		farr[0]  = new Helicopter();
		//farr[0] = new plane
		//farr[1 = birds
		
		display(farr);
	}

	private static void display(Flyable[] farr) {
		// TODO Auto-generated method stub
		for (Flyable f : farr)
		{
			if(f instanceof Helicopter)
				f.fly();
		}
	}

}
