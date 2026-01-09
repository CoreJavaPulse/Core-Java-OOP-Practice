
public class VarArgsMain {
	
	public static void main(String[] args) {
		VarArgs obj = new VarArgs();
		System.out.println(obj.sum(1, 2));       // Output: 3
		System.out.println(obj.sum(1, 2, 3));    // Output: 6
		System.out.println(obj.sum());           // Output: 0 (zero arguments)
	}
}
