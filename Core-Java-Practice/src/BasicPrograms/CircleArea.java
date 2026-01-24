package BasicPrograms;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Radius Of The Circle: ");
		Scanner sc = new Scanner(System.in);
		float r =sc.nextFloat();
		System.out.println("Area Of The Circle is : "+(3.14f*r*r));
		sc.close();
	}

}
