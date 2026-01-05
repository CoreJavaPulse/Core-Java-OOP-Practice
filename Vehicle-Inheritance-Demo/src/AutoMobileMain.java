import java.util.Scanner;

public class AutoMobileMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String overallContinue;
		do {
			System.out.println("-------------------Main Menu-----------------");
			System.out.println("1:Car\n2:Bike");
			System.out.println("Enter Your Choice.");
			int mainCh = sc.nextInt();

			if (mainCh == 1) {
				// Car Menu Loop
				String carContinue;
				do {
					System.out.println("-------------------Car Menu-------------");
					System.out.println("1:Maruti\n2:Toyota");
					System.out.println("Enter Your Choice.");
					int ch1 = sc.nextInt();
					if (ch1 == 1) display("Maruti", new Maruti());
					else if (ch1 == 2) display("Toyota", new Toyota());
					System.out.println("Continue in Car Menu? (yes/no)");
					carContinue = sc.next();
				} while (carContinue.equalsIgnoreCase("yes"));
			} 
			else if (mainCh == 2) {
				// Bike Menu Loop
				String bikeContinue;
				do {
					System.out.println("-------------------Bike Menu-------------");
					System.out.println("1:Hero Honda\n2:Tvs");
					System.out.println("Enter Your Choice.");
					int ch2 = sc.nextInt();
					if (ch2 == 1) display("Hero Honda", new HeroHonda());
					else if (ch2 == 2) {
						// TODO: display("Tvs", new Tvs());
						System.out.println("Tvs selected (implement class).");
					}
					System.out.println("Continue in Bike Menu? (yes/no)");
					bikeContinue = sc.next();
				} while (bikeContinue.equalsIgnoreCase("yes"));
			}

			System.out.println("Continue Overall? (yes/no)");
			overallContinue = sc.next();
		} while (overallContinue.equalsIgnoreCase("yes"));
		sc.close();
	}


	public static void display(String str,AutoMobile a)
	{
		System.out.println("---------------------------------------------------------");
		System.out.println(str+" Model :"+a.getModel());
		System.out.println(str+" Color :"+a.getColor());
		System.out.println(str+" Price :"+a.getPrice());
		if(a instanceof Bike) {
			Bike b = (Bike) a;
			System.out.println(str+" CC :"+b.getcc());
		}
	}
}
