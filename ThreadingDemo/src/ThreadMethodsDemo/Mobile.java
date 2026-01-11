package ThreadMethodsDemo;

public class Mobile extends Thread{

	private String str;

	public Mobile(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		for(int i = 1;i<=5;i++)
		{
			System.out.println(str+" Calling... "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
