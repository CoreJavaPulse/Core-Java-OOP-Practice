package ArithmeticOp;
import java.util.Scanner;

public class Calculation {
	Scanner sc = new Scanner(System.in);
	
	public double addData(int n1,int n2)
	{
		double add = n1 + n2;
		return add;
	}
	
	public double subData(int n1,int n2)
	{
		double sub = n1-n2;
		return sub;
	}
	
	public double mulData(int n1,int n2)
	{
		double mul = n1*n2;
		return mul;
	}
	
	public double divData(int n1,int n2)
	{
		double div = n1/n2;
		return div;
	}
	
	public double modData(int n1,int n2)
	{
		double rem = n1%n2;
		return rem;
	}
}
