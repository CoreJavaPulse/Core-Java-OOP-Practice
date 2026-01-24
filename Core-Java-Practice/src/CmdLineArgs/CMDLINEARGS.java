package CmdLineArgs;

public class CMDLINEARGS {

	public static void main(String[] args) {
		
//		String s1  = args[0];
//		String s2  = args[1];
//		int n1 = Integer.parseInt(s1);
//		int n2 = Integer.parseInt(s2);
//		int add =n1+n2;
//		
		int sum=0;
		for(int i = 0;i<args.length;i++)
		{
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("Addition Is :"+sum);

	}

}
