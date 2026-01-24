package ArrayWithThread;

public class ArrayMain {

	public static void main(String[] args) {

		// Validate input
		if (args.length != 5) {
			System.out.println("Please pass exactly 5 numbers using command line arguments.");
			return;
		}

		int[] numbers = new int[5];

		// Convert cmd args to int array
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}

		ArrayApplication app = new ArrayApplication();

		new ArrayThread(app, numbers);
		
	}
}
