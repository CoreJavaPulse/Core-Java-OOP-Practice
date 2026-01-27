package LogicApplication;

public class Logic {

	public void factor(int num1)
	{
		System.out.print("Factors of "+num1 +" are: 1");
		for (int i = 2;i<num1 ;i++)
		{
			if(num1%i == 0)
			{
				System.out.print(" "+i);
			}
		}
		System.out.println();
	}

	public void factorial(int num1)
	{
		int fact = 1;
		for(int i=1;i<=num1;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial Of "+num1+" Is :"+fact);
	}

	public void prime(int num1)
	{
		int flag =1;
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				flag = 0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num1+" is a Prime Number!");
		}
		else {
			System.out.println(num1+" is not A Prime Number!");
		}
	}

	public void reversenumber(int num1)
	{
		int temp=num1;
		int rev=0;
		while(num1!=0)
		{
			int rem = num1%10;
			rev = (rev*10)+rem;
			num1=num1/10;
		}
		System.out.println("After Reversing The Number "+temp+" : "+rev);
	}

	public void fibbo(int num1)
	{
		int n1=0;
		int n2=1;
		int next = n1+n2;
		System.out.print("Fibbo Series Containing "+num1+" Elements :");
		for(int i =0;i<num1;i++)
		{
			System.out.print(n1+" ");
			n1 =n2;
			n2=next;
			next=n1+n2;
		}
		System.out.println();
	}

	public void sumofdigit(int num1) {
		int temp=num1;
		int sum=0;
		while(num1!=0)
		{
			int rem = num1%10;
			sum+=rem;
			num1/=10;
		}
		System.out.println("Sum Of The Digits In "+temp+" Is :"+sum);
	}

	public void armstrongnumber(int num1) {
		// TODO Auto-generated method stub
		int temp1=num1;
		int temp2=num1;
		int sum=0;
		int noofdigits=0;
		while(temp1!=0)
		{
			temp1/=10;
			noofdigits++;
		}
		while(num1!=0)
		{
			int rem = num1%10;
			int pow=1;
			for(int i=0;i<noofdigits;i++)
				pow*=rem;
			sum+=pow;
			num1/=10;
		}

		if(temp2==sum)
			System.out.println(temp2+" Is A Armstrong Number");
		else
			System.out.println(temp2+" Is Not  A Armstrong Number");
	}

	public void neonnumber(int num1) {
		// TODO Auto-generated method stub
		int temp1=num1;
		int sum=0;
		int sq=num1*num1;
		while(sq!=0)
		{
			int rem = sq%10;
			sum+=rem;
			sq/=10;
		}
		if(temp1==sum)
			System.out.println(temp1+" Is A Neon Number");
		else
			System.out.println(temp1+" Is Not  A Neon Number");
	}

	public void perfectnumber(int num1) {
		// TODO Auto-generated method stub
		int sum=1;
		for(int i = 2;i<num1;i++)
		{
			if(num1%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num1)
			System.out.println(num1+" Is A Perfect Number.");
		else
			System.out.println(num1+" Is Not Perfect Number.");
	}

	public void pallindromenumber(int num1) {
		// TODO Auto-generated method stub
		int temp=num1;
		int pallindrome=0;
		while(num1!=0)
		{
			int rem=num1%10;
			pallindrome=pallindrome*10+rem;
			num1/=10;
		}
		if(pallindrome==temp)
			System.out.println(temp+" Is A Pallindrome Number.");
		else
			System.out.println(temp+" Is Not Pallindrome Number.");
	}

	public void baseandpower(int base, int pow) {
		// TODO Auto-generated method stub
		int value=1;
		for(int i=0;i<pow;i++)
		{
			value=value*base;
		}
		System.out.println("Value of "+base+" With Power "+pow+" is : "+value);
		
	}
}

