package AreaApplication;
import java.util.Scanner;

public class AreaOperation {
	Scanner sc = new Scanner(System.in);
	public void circlearea()
	{
		System.out.println("Enter The Radius Of The Circle: ");
		float r =sc.nextFloat();
		System.out.println("Area Of The Circle is : "+(3.14*r*r));
	}
	
	public void trianglearea()
	{
		System.out.println("Enter The Base and Height Of The Triangle: ");
		float base =sc.nextFloat();
		float height= sc.nextFloat();
		System.out.println("Area Of The triangle is : "+(0.5*base*height));
	}
	
	public void rectanglearea()
	{
		System.out.println("Enter The Length and Breath Of The Rectangle: ");
		float length =sc.nextFloat();
		float breath= sc.nextFloat();
		System.out.println("Area Of The Rectangle is : "+(length*breath));
	}
	public void squarearea()
	{
		System.out.println("Enter The Side Of The Square");
		double side = sc.nextDouble();
		System.out.println("Area Of The Square is : "+(side*side));
	}
}
