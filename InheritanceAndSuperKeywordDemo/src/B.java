
public class B extends A{

	int x = 20;
	public B()
	{
		super(100);
		System.out.println("Class B Constructor.");
	}
	public void show()
	{
		super.show();
		System.out.println("Value Of The Base Class  X is :"+super.x);
		System.out.println("Value Of The Derived Class  X is :"+x);
		
	}
}
