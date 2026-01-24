package BasicPrograms;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Base and Height Of The Triangle: ");
		Scanner sc = new Scanner(System.in);
		float base =sc.nextFloat();
		float height= sc.nextFloat();
		System.out.println("Area Of The Triangle is : "+(0.5*base*height));
		sc.close();
	}

}
