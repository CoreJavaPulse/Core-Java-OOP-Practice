package AreaWithCustomThread;

public class Area {

	public void circleArea(float r)
	{
		System.out.println("Area Of The Circle Is :"+(3.14*r*r));
	}
	
	public void triangleArea(float base,float height)
	{
		System.out.println("Area Of The Triangle Is :"+(0.5*base*height));
	}
	
	public void rectArea(float length,float breadth)
	{
		System.out.println("Area Of The Reactangle is :"+length*breadth);
	}
}
