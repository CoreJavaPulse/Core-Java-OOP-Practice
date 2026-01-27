package ArithmeticOperationsWithCustomThread;

public class ArithmeticMain {

	public static void main(String[] args) {
		
		ArithmeticOperation operation = new ArithmeticOperation(10, 20);
		ArithmeticThread thread = new ArithmeticThread(operation);	
	}
}
