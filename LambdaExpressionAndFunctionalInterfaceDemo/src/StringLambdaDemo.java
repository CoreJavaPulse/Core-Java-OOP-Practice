
interface StringOp {
	String process(String s);
}

public class StringLambdaDemo {

	public static void main(String args[]) {


		StringOp upper = s -> s.toUpperCase();
		StringOp reverse = s -> new StringBuilder(s).reverse().toString();

		System.out.println(upper.process("java"));   // JAVA
		System.out.println(reverse.process("java")); // avaj
	}

}
